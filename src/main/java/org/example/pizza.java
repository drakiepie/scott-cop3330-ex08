package org.example;
import java.util.Scanner;

/* based on the example given, I am assuming there are 8 slices per pizza. */

public class pizza {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("How many people? ");
        int numPeople = input.nextInt();
        System.out.print("How many pizza do you have? ");
        int numPizza = input.nextInt();
        System.out.println(numPeople + " people with " + numPizza + " pizzas.");

        int totalSlice = 8 * numPizza;
        int pizzaHaul, leftover;

        if (totalSlice % numPeople == 0){
            leftover = 0;
            pizzaHaul = totalSlice / numPeople;
            System.out.println("Each person gets " + pizzaHaul + " pieces of pizza.\nThere are " + leftover + " leftover pieces.");

        } else {
            pizzaHaul = totalSlice / numPeople;
            leftover =  totalSlice % numPeople;
            System.out.println("Each person gets " + pizzaHaul + " pieces of pizza.\nThere are " + leftover + " leftover pieces.");
        }

    }
}