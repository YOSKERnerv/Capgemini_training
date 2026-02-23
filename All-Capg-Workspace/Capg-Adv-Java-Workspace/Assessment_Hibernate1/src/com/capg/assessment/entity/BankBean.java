package com.capg.assessment.entity;
import javax.persistence.*;

@Entity
@Table(name = "BANK_DATABASE")
public class BankBean {

    @Id
    @Column(name = "ACCNO")
    private long accountNumber;

    @Column(name = "NAME")
    private String name;

    @Column(name = "MOBILE")
    private long mobile;

    @Column(name = "BALANCE")
    private double balance;

    public BankBean() {}

    public long getAccountNumber() {
    	return accountNumber; 
    }
    public void setAccountNumber(long accountNumber) {
    	this.accountNumber = accountNumber; 
    }

    public String getName() { 
    	return name; 
    }
    public void setName(String name) { 
    	this.name = name;
    }

    public long getMobile() {
    	return mobile; 
    }
    public void setMobile(long mobile) { 
    	this.mobile = mobile; 
    }

    public double getBalance() {
    	return balance; 
    }
    public void setBalance(double balance) { 
    	this.balance = balance; 
    }
}

