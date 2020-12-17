package com.company;

public class Pepperoni extends Pizza {
    String pepperoniComposition;

    public Pepperoni(String pepperoniComposition) {
    }

    public Pepperoni(String type, String number, double price, double weight, String pepperoniComposition) {
        super(type, number, price, weight);
        this.pepperoniComposition = pepperoniComposition;
    }

    @Override
    public String toString() {
        String message = "Type of Pizza: " + getType() + ", number of Pizza: " + getNumber() + ", price: "
                + getPrice() + ", weight: " + getWeight() + ", Specification: " + getPepperoniComposition();
        return message;
    }

    @Override
    public String preparePizza(String number) {
        System.out.println("Pizza by number - " + number + " is cooked.");
        return getNumber();
    }

    @Override
    public double pizzaDelivery(String type, String number, double weight, double price) {
        System.out.println("Pepperony: Pizza is delivered. Delivery pizza information: type - "
                + type + ", number - " + number + ", weight - " + weight + " gramm, price - " + price + " KGS.");
        System.out.println("Gift for delivery Pepperony is a firm pen.");
        return getPrice();
    }


    public String getPepperoniComposition() {
       return pepperoniComposition;
    }

    public void setPepperoniComposition(String pepperoniComposition) {
        this.pepperoniComposition = pepperoniComposition;
    }

}
