/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    static ProductManagement productManagement = new ProductManagement();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice = 0;
        do {
            System.out.println("========== PRODUCT MANAGEMENT ========== ");
            System.out.println("1. Add product.");
            System.out.println("2. Upadate product.");
            System.out.println("3. Delete product.");
            System.out.println("4. Display prodcut.");
            System.out.println("5. Search product by name.");
            System.out.println("6. Sort product increasing by price.");
            System.out.println("7. Sort product decreasing by price.");
            System.out.println("8. Exits.");
            System.out.println("Rhat is your choice? ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Input id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Input name: ");
                    String name = scanner.nextLine();
                    System.out.println("Input price: ");
                    double price = scanner.nextDouble();
                    productManagement.addProduct(new Product(id, name, price));
                    System.out.println("Add sucessfully!");
                    break;
                case 2:
                    System.out.print("input id updated: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Input product name updated: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Input product price updated: ");
                    double updatePrice = scanner.nextDouble();
                    productManagement.updateProduct(updateId, updateName, updatePrice);
                    System.out.println("Update product sucessfully!");
                    break;
                case 3:
                    System.out.print("Input id need delete: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine(); 
                    productManagement.deleteProduct(deleteId);
                    System.out.println("Delete product sucessfully!");
                    break;
                case 4:
                    System.out.println("List product:");
                    productManagement.displayProduct();
                    break;
                case 5:
                    System.out.print("Input name for search: ");
                    String searchName = scanner.nextLine();
                    System.out.println("Search result:");
                    productManagement.searchProductByName(searchName);
                    break;
                case 6: 
                    System.out.println("List product are sorted increasing:");
                    productManagement.sortProductsByPrice(true);
                    break;
                case 7:
                    System.out.println("List product are sorted decreasing:");
                    productManagement.sortProductsByPrice(false);
                    break;
                case 0:
                    System.out.println("Exits.");
                    break;

                default:
                    System.out.println("Invalid. Please enter.");
            }
        }while(choice != 0);
    }
}
