package com.capg.springcore;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class EmployeeClient {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        EmployeeClient e1 = (EmployeeClient) factory.getBean("employee1");
        EmployeeService e1 = (EmployeeService) factory.getBean("employee1");
        e1.displayEmployee();

//        EmployeeClient e2 = (EmployeeClient) factory.getBean("employee2");
        EmployeeService e2 = (EmployeeService) factory.getBean("employee2");
        e2.displayEmployee();
        
	}

	

}
