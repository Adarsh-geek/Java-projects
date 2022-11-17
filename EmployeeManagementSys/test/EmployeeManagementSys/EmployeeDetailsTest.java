/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package EmployeeManagementSys;

//import org.junit.*;
import com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert.*;
import org.junit.*;
import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.rules.ExpectedException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class EmployeeDetailsTest {
    
    EmployeeDetails employeeDetails;
    
    public EmployeeDetailsTest() {
    }
    
    
    @Before
    public void setUp() {
        employeeDetails = new EmployeeDetails();
    }
    

    /**
     * Test of main method, of class employeeDetails.
     */
    @Test
    public void testDatabaseConnection() {
//        employeeDetails = new EmployeeDetails();
        assertNotNull( employeeDetails.databaseConnection(),"Database connection should not be null");
    }

    /**
     * Test of main method, of class EmployeeDetails.
     */
//    @org.junit.Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        EmployeeDetails.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of main method, of class EmployeeDetails.
     */
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EmployeeDetails.main(args);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testDisplayDetails() {
        try {
            employeeDetails.displayDetails("2361668", "Name");
        }
        catch(Exception ex) {
            System.out.println(ex);
            Logger.getLogger(EmployeeDetailsTest.class.getName()).log(Level.SEVERE, "This is in test file", ex);
        }
    }
    
    @Test
    public void testDisplayExperience() {
        try{
            employeeDetails.displayExperience("1");
        }
        catch(Exception ex) {
            Logger.getLogger(EmployeeDetailsTest.class.getName()).log(Level.SEVERE, "This is in test file", ex);
        }
    }
}
