// Programmers: Ben Diskin, David Rukashaza-Hancock, T. Jake Holmes, Jaspreet Khatkar
// CS 145: Face-To-Face
// Date: 3/2/2023
// Assignment: Binary Search Tree
// Reference: Chapter 17
// Purpose: Use recursion to add/remove employees from a fictional database
// Extra Credit:



import java.util.*;
import java.io.*;

public class BinarySearchTree {
    public static void main(String[] args) {

        // sample employee
        Employee one = new Employee(1, "Jake", "Holmes", "Junior Software Developer");
        System.out.println(one.EmployeeInfo());

    } // end of main
} // end of lab6 class

class Employee {

    private int employeeID;
    private String firstName;
    private String lastName;
    private String occupation;
    private Employee left;
    private Employee right;

    public Employee(int employeeID, String firstName, String lastName, String occupation) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.left = null;
        this.right = null;
    }

    public String EmployeeInfo() {
        return "Employee Name: " + this.firstName + " " + this.lastName + "\nEmployee ID: " + this.employeeID + "\nPosition: " + this.occupation;
    }

} // end node class employee
