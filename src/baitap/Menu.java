/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Customer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menu {

    static Scanner scanner = new Scanner(System.in);
    static CompanyManagement companyManagement = new CompanyManagement();
    private ArrayList<Customer> arrcustomer;

    public void runApplication() {
        int choice = 0;
        while (true) {
            System.out.println("______________________ COMPANY MANAGEMENT APPLICATION _________________________");
            System.out.println("1. Display all customers.");
            System.out.println("2. Add new customer.");
            System.out.println("3. Search customer.");
            System.out.println("4. Write data to file.");
            System.out.println("5. Delete a customer by ID.");
            System.out.println("6. Update phone and date of birth.");
            System.out.println("7. Exit.");
            System.out.println("What is your choice ?");
            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Wrong input! Please re-enter.");
                continue;
            }

            switch (choice) {
                case 1:
                    companyManagement.displayCustomer();
                    break;
                case 2:
                    companyManagement.addCustomer();
                    break;
                case 3:
                    companyManagement.searchCustomer();
                    break;
                case 4:
                    
                    break;
                case 5:
                    companyManagement.deleteCustomer();
                    break;
                case 6:
                    companyManagement.updateCustomerDetails();
                    break;
                case 7:
                    System.out.println("Exiting the program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
