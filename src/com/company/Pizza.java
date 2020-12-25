package com.company;

public class Pizza {
    String type;
    String number;
    double price;
    double weight;

    public Pizza(){}

    public Pizza(String type, String number, double price, double weight) {
        this.type = type;
        this.number = number;
        this.price = price;
        this.weight = weight;
    }

    public String preparePizza(String number){
        System.out.println("Pizza by number - " + number + " is cooked");
        return number;
    }

    public double pizzaDelivery(String type, String number, double weight, double price){
        System.out.println("Pizza is delivered. Delivery pizza information: type - "
                + type + ", number - " + number + ", weight - " + weight + " gramm, price - " + price + " KGS.");
        return price;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
