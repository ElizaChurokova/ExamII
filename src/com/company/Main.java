package com.company;



import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Task 2 Pizza

        Pepperoni pepperoni = new Pepperoni("Spicy Pepperoni", "P1", 600, 300, "tomato, mushrooms,garlic, onion");
        Margarita margarita = new Margarita("Margarita with meat", "M2", 1000, 500, "meat, tomato, olives, cheese, pineapples", "Coke");
        Lafita lafita = new Lafita("La fita with mushrooms", "L3", 950, 450, "mushrooms, greens, beans");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pizza by number - " + pepperoni.getNumber() + " is cooked.");

        System.out.println("Pepperony: Pizza is delivered. Delivery pizza information: type - "
                + pepperoni.getType() + ", number - " + pepperoni.getNumber() + ", weight - " + pepperoni.getWeight() + " gramm, price - " + pepperoni.getPrice() + " KGS.");
        System.out.println("Gift for delivery Pepperony is a firm pen.");


        System.out.println();
        System.out.println("Margarita Pizza by number - " + margarita.getNumber() + " is cooked");
        System.out.println("Margarita: Pizza is delivered. Delivery pizza information: type - "
                + margarita.getType() + ", number - " + margarita.getNumber() + ", weight - " + margarita.getWeight() + " gramm, price - " + margarita.getPrice() + " KGS.");

        System.out.println();
        System.out.println("La fita Pizza by number - " + lafita.getNumber() + " is cooked");
        System.out.println("La fita: Pizza is delivered. Delivery pizza information: type - "
                + lafita.getType() + ", number - " + lafita.getNumber() + ", weight - " + lafita.getWeight() + " gramm, price - " + lafita.getPrice() + " KGS.");
        System.out.println("Two tickets for delivery as a bonus.");







    }
}
