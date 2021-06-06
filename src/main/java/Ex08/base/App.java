/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package Ex08.base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        int people = myApp.getPeople();
        int pizzas = myApp.getSlices();
        int slicesPerPizza = myApp.getSlicesPerPizza();
        int totalSlices = myApp.totalSlices(pizzas, slicesPerPizza);
        myApp.calcPerPerson(people, pizzas, totalSlices);
        myApp.calcLeftovers(totalSlices, people);
    }

    private void calcLeftovers(int totalSlices, int people) {
        int leftovers = totalSlices % people;
        System.out.print("There are " + leftovers + " leftover pieces.");
    }

    private void calcPerPerson(int people, int pizzas, int totalSlices) {
        int perPerson = (int) Math.floor(totalSlices / people);
        System.out.println(people + " people with " + pizzas + " pizzas (" + totalSlices + " slices)\nEach person gets " + perPerson + " slices of pizza.");
    }

    private int totalSlices(int pizzas, int slicesPerPizza) {
        return pizzas * slicesPerPizza;
    }

    private int getSlicesPerPizza() {
        System.out.print("How many slices per pizza? ");
        return Integer.parseInt(in.nextLine());
    }

    private int getSlices() {
        System.out.print("How many pizzas do you have? ");
        return Integer.parseInt(in.nextLine());
    }

    private int getPeople() {
        System.out.print("How many people? ");
        return Integer.parseInt(in.nextLine());
    }

}

