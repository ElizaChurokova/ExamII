package com.company;

public class Margarita extends Pizza {
    String margaritaComposition;
    String bonus;

    public Margarita(String margaritaComposition) {}
//("Margarita with meat", "M2", 1000, 500, "meat, tomato, olives, cheese, pineapples", "Pepsi");
    public Margarita(String type, String number, double price, double weight, String margaritaComposition, String bonus) {
        super (type, number, price, weight);
        this.margaritaComposition = margaritaComposition;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        String message = "Type of Pizza: " + getType() + ", number of Pizza: "
                + getNumber() + ", price: " + getPrice() + ", weight: "
                + getWeight() + ", Specification: " + getMargaritaComposition() + ", bonus for delivery of 2 : "
                + getType() + " is " + getBonus();
        return message;
    }

    @Override
    public String preparePizza(String number) {
        System.out.println("Margarita Pizza by number - " + number + " is cooked");
        return getNumber();
    }

    @Override
    public double pizzaDelivery(String type, String number, double weight, double price) {
        System.out.println("Margarita: Pizza is delivered. Delivery pizza information: type - "
                + type + ", number - " + number + ", weight - " + weight + " gramm, price - " + price + " KGS.");
        return getPrice();
    }

    public String getMargaritaComposition() {
        return margaritaComposition;
    }

    public void setMargaritaComposition(String margaritaComposition) {
        this.margaritaComposition = margaritaComposition;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }
}