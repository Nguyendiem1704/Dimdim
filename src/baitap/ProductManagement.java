/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ProductManagement {

    private List<Product> productList;

    public ProductManagement() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void updateProduct(int id, String name, double price) {
        for (Product product : productList) {
            if (product.getId() == id) {
                product.setName(name);
                product.setPrice(price);
                break;
            }
        }
    }

    public void deleteProduct(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                productList.remove(product);
                break;
            }
        }
    }

    public void displayProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void searchProductByName(String name) {
        for (Product product : productList) {
            if (product.getName().toLowerCase().contains(name));
            System.out.println(product);
        }
    }

    public void sortProductsByPrice(boolean ascending) {
        Comparator<Product> priceComparator = Comparator.comparingDouble(Product::getPrice);
        if (!ascending) {
            priceComparator = priceComparator.reversed();
        }
        Collections.sort(productList, priceComparator);
        displayProduct();
    }
}

