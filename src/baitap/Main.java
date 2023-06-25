/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Customer;
import static View.CompanyManagement.company;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        
        Customer customer1 = new Customer("KH01", "John Horstman", "0985405999","12/01/1999");
        Customer customer2 = new Customer("KH02", "Jane Smith", "0906567789","13/09/1999");
        Customer customer3 = new Customer("KH03", "Cays Horstman", "0987787676","18/02/1999");
        Customer customer4 = new Customer("KH04", "Cays Horstman", "0908778887","11/09/1999");
        company.addCustomer(customer1);
        company.addCustomer(customer2);
        company.addCustomer(customer3);
        company.addCustomer(customer4);
        menu.runApplication();
        
    }
}
