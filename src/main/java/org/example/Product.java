package org.example;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
      this.setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
       if(price < 0)
       {
           System.out.println("Цена не может быть отрицательной");
           return;
       }
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
