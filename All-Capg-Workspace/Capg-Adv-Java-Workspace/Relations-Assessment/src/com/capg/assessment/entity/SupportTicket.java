package com.capg.assessment.entity;

import javax.persistence.*;

@Entity
public class SupportTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String issueDescription;

    @OneToOne
    private Order order;

    public SupportTicket() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getIssueDescription() { return issueDescription; }
    public void setIssueDescription(String issueDescription) { this.issueDescription = issueDescription; }

    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }
}