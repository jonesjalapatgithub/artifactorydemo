package com.cybage.assignment.decassignment;

import junit.framework.TestCase;



public class AppTest 
    extends TestCase{
	String a="Rajeev";
	EmpBusinessLogic empBusinessLogic =new EmpBusinessLogic();
	   EmployeeDetails employee = new EmployeeDetails();

    public AppTest( String testName ){
        super( testName );
    }
    
   // @Test
    public void testmytestcases(){
        employee.setName(a);
        employee.setAge(25); 
        employee.setMonthlySalary(8000);
        double appraisal=empBusinessLogic.calculateAppraisal(employee);
       assertEquals(500, appraisal, 0.0);
        employee.setMonthlySalary(18000);
        appraisal=empBusinessLogic.calculateAppraisal(employee);  
    }

    public void testApp(){
        employee.setName(a);
        employee.setAge(25);
        employee.setMonthlySalary(8000);
        double salary= empBusinessLogic.calculateYearlySalary(employee);
        assertEquals(96000, salary, 0.0);
        System.out.println("#########################this is my testing###################");
        
    }
}
