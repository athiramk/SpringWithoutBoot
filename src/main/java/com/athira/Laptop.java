package com.athira;

public class Laptop {
    public Charger getCharger() {
        return charger;
    }

    /*public Laptop(Charger charger, int price) {
        this.charger = charger;
        this.price = price;
    }*/

    public void setCharger(Charger charger) {
        this.charger = charger;
    }

    private int price;
    private Charger charger;
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

    public Laptop(int price) {
        this.price = price;
        System.out.println("Creating Laptop bean in parameterised constructor");
    }

    public Laptop() {
        System.out.println("Creating Laptop bean");
    }

    public void compile()
    {
        System.out.println("Compiling on Laptop");
    }
}
