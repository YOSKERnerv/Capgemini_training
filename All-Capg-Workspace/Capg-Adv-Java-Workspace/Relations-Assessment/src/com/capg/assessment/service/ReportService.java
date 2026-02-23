package com.capg.assessment.service;

import javax.persistence.*;

public class ReportService {

    private EntityManager em;

    public ReportService(EntityManager em) {
        this.em = em;
    }

    public void getEmployeePerformance(Long employeeId) {

        try {

            Long count = (Long) em.createQuery(
                "SELECT COUNT(l) FROM Lead l WHERE l.employee.id = :empId")
                .setParameter("empId", employeeId)
                .getSingleResult();

            System.out.println("Total Leads Handled: " + count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}