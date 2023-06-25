/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import CheckValidator.DataValidator;
import static CheckValidator.DataValidator.Regex_number;
import static CheckValidator.DataValidator.date_format;
import static CheckValidator.DataValidator.date_regex;
import CheckValidator.Input;
import static CheckValidator.Input.inputString;
import Controller.Company;
import Model.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CompanyManagement {

    static Company company = new Company();
    static ArrayList<Customer> arrCustomer = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public void addCustomer() {
        System.out.println("_______ADD NEW CUSTOMER_________");
        String customerID = Input.inputString("Enter ID: ", DataValidator.customer_id_regex);
        String name = Input.inputString("Enter Name");
        String phone = Input.inputString("Phone Number (10 numbers)", DataValidator.phone_regex);
        System.out.println("Enter date birth (dd/mm/yyyy): ");
        String dateOfBirth = scanner.nextLine();
        if (!DataValidator.validateDateOfBirth(dateOfBirth)) {
            System.out.println("Invalid Date of Birth format.");
            return;
        }
        Customer customers = new Customer(customerID, name, phone, dateOfBirth);
        company.addCustomer(customers);
        System.out.println("Customer added successfully!");
    }

    public void displayCustomer() {
        System.out.println("_______Display Customer__________");
        company.displayCustomer();
        System.out.println("Total of customer is: " + company.totalCustomer());
    }

    public void searchCustomer() {
        int searchChoice;
        while (true) {
            System.out.println("_______SEARCH CUSTOMER_________");
            System.out.println("1.Search by customer ID");
            System.out.println("2.Search by name");
            System.out.println("3.Search by phone");
            System.out.println("4.Search by date of birth");
            System.out.println("5.Exit");
            System.out.println("Enter your choice: ");
            try {
                searchChoice = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Wrong input ! Please re-enter");
                continue;
            }
            ArrayList<Customer> searchResults;
            switch (searchChoice) {
                case 1:
                    String customerId = inputString("Search Id: ");
                    searchResults = company.search(c -> c.getCustomerID().contains(customerId));
                    if (searchResults.isEmpty()) {
                        System.out.println("No matching customers found.");
                    } else {
                        System.out.println("Search results: ");
                        for (Customer customer : searchResults) {
                            System.out.println(customer);
                        }
                        System.out.println("Total: " + searchResults.size() + " customer(s)");
                    }
                    break;

                case 2:
                    String name = inputString("Search name: ");
                    searchResults = company.search(c -> c.getName().contains(name));
                    if (searchResults.isEmpty()) {
                        System.out.println("No matching customers found.");
                    } else {
                        System.out.println("Search results: ");
                        for (Customer customer : searchResults) {
                            System.out.println(customer);
                        }
                        System.out.println("Total: " + searchResults.size() + " customer(s)");
                    }
                    break;
                case 3:
                    String numberPhone = inputString("Phone number Start With ", Regex_number);
                    ArrayList<Customer> phoneArr = company.search(c -> c.getPhone().contains(numberPhone));
                    if (phoneArr.isEmpty()) {
                        System.out.println("No matching customers found.");
                    } else {
                        System.out.println("Search results: ");
                        for (Customer customer : phoneArr) {
                            System.out.println(customer);
                        }
                        System.out.println("Total: " + phoneArr.size() + " customer(s)");
                    }
                    break;
                case 4:
                    String dateOfBirth = inputString("Search date of birth (dd/mm/yyyy): ", date_regex);
                    searchResults = company.search(c -> c.getDateOfBirth().contains(dateOfBirth));
                    if (searchResults.isEmpty()) {
                        System.out.println("No matching customers found.");
                    } else {
                        System.out.println("Search results: ");
                        for (Customer customer : searchResults) {
                            System.out.println(customer);
                        }
                        System.out.println("Total: " + searchResults.size() + " customer(s)");
                    }
                    break;
                case 5:
                    break;

                default:
                    System.out.println("Invalid choice. Return menu.");
                    return;
            }
            if (searchChoice == 4) {
                break;

            }

        }
    }

    
public void deleteCustomer() {
    System.out.print("Enter the customer ID to delete: ");
    String customerID = scanner.nextLine();
    boolean customerFound = false;

    for (int i = 0; i < arrCustomer.size(); i++) {
        Customer customer = arrCustomer.get(i);
        if (customer.getCustomerID().equals(customerID)) {
            arrCustomer.remove(i);
            customerFound = true;
            break;
        }
    }

    if (customerFound) {
        System.out.println("Customer with ID " + customerID + " deleted successfully.");
    } else {
        System.out.println("Customer not found with ID: " + customerID);
    }
}


    public void updateCustomerDetails() {
        scanner.nextLine();
        System.out.print("Enter the customer ID to update: ");
        String customerID = scanner.nextLine();
        System.out.print("Enter the new phone: ");
        String newPhone = scanner.nextLine();
        System.out.print("Enter the new date of Birth (dd/MM/yyyy): ");
        String newDateOfBirth = scanner.nextLine();
        company.updateCustomerDetails(customerID, newPhone, newDateOfBirth);
    }

}
