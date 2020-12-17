package com.company;

public class Lafita extends Pizza{
    String lafitaComposition;

    public Lafita(String lafitaComposition){}

    public Lafita(String type, String number, double price, double weight, String lafitaComposition) {
        super(type, number, price, weight);
        this.lafitaComposition = lafitaComposition;
    }

    @Override
    public String toString() {
        String message = "Type of Pizza: " + getType() + ", number of Pizza: "
                + getNumber() + ", price: " + getPrice() + ", weight: "
                + getWeight() + ", Specification: " + getLafitaComposition();
        return message;
    }

    @Override
    public String preparePizza(String number) {
        System.out.println("La fita Pizza by number - " + number + " is cooked");
        return getNumber();
    }

    @Override
    public double pizzaDelivery(String type, String number, double weight, double price) {
        System.out.println("La fita: Pizza is delivered. Delivery pizza information: type - "
                + type + ", number - " + number + ", weight - " + weight + " gramm, price - " + price + " KGS.");
        System.out.println("Two tickets for delivery as a bonus.");
        return super.pizzaDelivery(type, number, weight, price);
    }

    public String getLafitaComposition() {
        return lafitaComposition;
    }

    public void setLafitaComposition(String lafitaComposition) {
        this.lafitaComposition = lafitaComposition;
    }
}
