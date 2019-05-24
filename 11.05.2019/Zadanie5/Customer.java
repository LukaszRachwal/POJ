package com.company;

// Lukasz Rachwal s19638
// Maciej Rybacki S18553

public class Customer {

    private int ID;
    private String name;
    private int discount;

    public Customer(int ID, String name, double amount) {
        this.ID = ID;
        this.name = name;
        this.amount = amount;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
    	retunr discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getCustomerName() {
        return getCustomer().getName();
    }
    
    public String toString() {
	return name+"("+ID+")";
    }
