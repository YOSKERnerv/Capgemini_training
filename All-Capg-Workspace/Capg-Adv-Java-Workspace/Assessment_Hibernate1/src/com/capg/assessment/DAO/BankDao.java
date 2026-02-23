package com.capg.assessment.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.capg.assessment.entity.BankBean;

public class BankDao {

    private static SessionFactory sess;

    static {
        sess = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
    }

 
    public void createAccount(BankBean bank) {

        Session session = sess.openSession();
        Transaction tx = session.beginTransaction();

        try {
            session.save(bank);

            session.createSQLQuery(
                    "INSERT INTO TRANSACTIONS(ID, ACCOUNT_NUMBER, MESSAGE) " +
                    "VALUES (TRANS_SEQ.NEXTVAL, :acc, :msg)")
                    .setParameter("acc", bank.getAccountNumber())
                    .setParameter("msg", "Account Created Successfully")
                    .executeUpdate();

            tx.commit();

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public BankBean getAccount(long accNo) {

        Session session = sess.openSession();
        BankBean bank = (BankBean) session.get(BankBean.class, accNo);
        session.close();

        return bank;
    }

    public boolean deposit(long accNo, double amount) {

        Session session = sess.openSession();
        Transaction tx = session.beginTransaction();

        try {
            BankBean bank = (BankBean)session.get(BankBean.class, accNo);

            if (bank == null) {
                tx.rollback();
                return false;
            }

            bank.setBalance(bank.getBalance() + amount);
            session.update(bank);

            session.createSQLQuery(
                    "INSERT INTO TRANSACTIONS(ID, ACCOUNT_NUMBER, MESSAGE) " +
                    "VALUES (TRANS_SEQ.NEXTVAL, :acc, :msg)")
                    .setParameter("acc", accNo)
                    .setParameter("msg", amount + " deposited successfully")
                    .executeUpdate();

            tx.commit();
            return true;

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }


    public boolean withdraw(long accNo, double amount) {

        Session session = sess.openSession();
        Transaction tx = session.beginTransaction();

        try {
            BankBean bank = (BankBean) session.get(BankBean.class, accNo);

            if (bank == null || bank.getBalance() < amount) {
                tx.rollback();
                return false;
            }

            bank.setBalance(bank.getBalance() - amount);
            session.update(bank);

            session.createSQLQuery(
                    "INSERT INTO TRANSACTIONS(ID, ACCOUNT_NUMBER, MESSAGE) " +
                    "VALUES (TRANS_SEQ.NEXTVAL, :acc, :msg)")
                    .setParameter("acc", accNo)
                    .setParameter("msg", amount + " withdrawn successfully")
                    .executeUpdate();

            tx.commit();
            return true;

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }


    public boolean fundTransfer(long fromAcc, long toAcc, double amount) {

        Session session = sess.openSession();
        Transaction tx = session.beginTransaction();

        try {
            BankBean sender = (BankBean) session.get(BankBean.class, fromAcc);
            BankBean receiver = (BankBean) session.get(BankBean.class, toAcc);

            if (sender == null || receiver == null ||
                sender.getBalance() < amount) {
                tx.rollback();
                return false;
            }

            sender.setBalance(sender.getBalance() - amount);
            receiver.setBalance(receiver.getBalance() + amount);

            session.update(sender);
            session.update(receiver);

            session.createSQLQuery(
                    "INSERT INTO TRANSACTIONS(ID, ACCOUNT_NUMBER, MESSAGE) " +
                    "VALUES (TRANS_SEQ.NEXTVAL, :acc, :msg)")
                    .setParameter("acc", fromAcc)
                    .setParameter("msg", amount + " transferred to account " + toAcc)
                    .executeUpdate();

            session.createSQLQuery(
                    "INSERT INTO TRANSACTIONS(ID, ACCOUNT_NUMBER, MESSAGE) " +
                    "VALUES (TRANS_SEQ.NEXTVAL, :acc, :msg)")
                    .setParameter("acc", toAcc)
                    .setParameter("msg", amount + " received from account " + fromAcc)
                    .executeUpdate();

            tx.commit();
            return true;

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
}


    public void showTransactions(long accNo) {

        Session session = sess.openSession();

        List<String> list = session.createSQLQuery(
                "SELECT MESSAGE FROM TRANSACTIONS WHERE ACCOUNT_NUMBER = :acc")
                .setParameter("acc", accNo)
                .list();

        if (list.isEmpty()) {
            System.out.println("No Transactions Found.");
        } else {
            for (String msg : list) {
                System.out.println(msg);
            }
        }

        session.close();
    }
}
