package com.athira;

public class Computer {
    private Accessory accessory;

    public Computer() {
        System.out.println("Constructor in Computer");
    }

    public Accessory getAccessory() {
        return accessory;
    }

    public void setAccessory(Accessory accessory) {
        this.accessory = accessory;
    }

    public void compile()
    {
        accessory.connect();
    }
}
