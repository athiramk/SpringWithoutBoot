package com.athira;

public class Laptop {

    private int price;

    /*
    This setter methods uses value passed from spring.xml as property
    And this is setter injection
     */
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public Laptop() {
        System.out.println("Creating Laptop bean");
    }

    public void compile()
    {
        System.out.println("Compiling on Laptop");
    }
}
