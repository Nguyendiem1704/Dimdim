/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Customer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 *
 * @author Admin
 */
public class Company {
    public ArrayList<Customer> arrCustomer = new ArrayList<>();
    public void addCustomer(Customer customer){
        arrCustomer.add(customer);
    }
    
    public void displayCustomer(){
        arrCustomer.forEach(c -> System.out.println(c));
    }
    
    public int totalCustomer(){
        return arrCustomer.size();
    }
    
   public void removeCustomer(Customer customer) {
    arrCustomer.remove(customer);
}

    
    
    
    public ArrayList<Customer> search(Predicate<Customer> p){
        ArrayList<Customer> searchResults = new ArrayList<>();
        for (Customer customer : arrCustomer){
            if (p.test(customer)){
                searchResults.add(customer);
            } 
        }
        return searchResults;
    }
    
    public void updateCustomerDetails(String customerID, String newPhone, String newDateOfBirth) {
        for (Customer customer : arrCustomer) {
            if (customer.getCustomerID().equals(customerID)) {
                customer.setPhone(newPhone);
                customer.setDateOfBirth(newDateOfBirth);
                System.out.println("Customer details updated successfully.");
                return;
            }
        }
        System.out.println("Customer not found with ID: " + customerID);
    }
}
