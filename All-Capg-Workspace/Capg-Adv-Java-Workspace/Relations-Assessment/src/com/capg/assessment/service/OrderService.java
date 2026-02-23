package com.capg.assessment.service;

import java.util.*;
import javax.persistence.*;
import com.capg.assessment.entity.*;

public class OrderService {

    private EntityManager em;

    public OrderService(EntityManager em) {
        this.em = em;
    }

    public void placeOrder(Long customerId, List<Long> productIds) {

        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            Customer customer = em.find(Customer.class, customerId);

            Order order = new Order();
            order.setCustomer(customer);
            order.setOrderDate(new Date().toString());

            double total = 0;

            for (Long pid : productIds) {
                Product product = em.find(Product.class, pid);
                order.getProducts().add(product);
                total += product.getPrice();
            }

            order.setTotalAmount(total);

            em.persist(order);

            tx.commit();
            System.out.println("Order Placed Successfully!");

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        }
    }
}