package org.example.car;

public class CarDetails {
    public String getPrice() {
        return price;
    }

    public CarDetails(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;
    public String price;

}
