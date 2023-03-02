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

    } // end of main
} // end of lab6 class

class Employee {

    private int employeeID;
    private String firstName;
    private String lastName;
    private String occupation;
    Employee left;
    Employee right;

    public Employee(int employeeID, String firstName, String lastName, String occupation) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.left = null;
        this.right = null;
    }

} // end node class employee
