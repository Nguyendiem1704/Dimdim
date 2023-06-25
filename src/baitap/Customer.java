/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Customer {

    private String customerID;
    private String name;
    private String phone;
    private String dateOfBirth;

    public Customer(String customerID, String name, String phone, String dateOfBirth) {
        this.customerID = customerID;
        this.name = name;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerID='" + customerID + '\''
                + ", name='" + name + '\''
                + ", phone='" + phone + '\''
                + ", dateOfBirth='" + dateOfBirth + '\''
                + '}';
    }

}
