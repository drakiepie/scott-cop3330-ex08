package org.example;
import java.util.Scanner;

public class pizza {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("How many people? ");
        int numPeople = input.nextInt();
        System.out.print("How many pizza do you have? ");
        int numPizza = input.nextInt();
        System.out.print("How many slices per pizza? ");
        int slicePer = input.nextInt();
        int totalSlice = slicePer * numPizza;
        System.out.println(numPeople + " people with " + numPizza + " pizzas. (" + totalSlice + " slices).");

        int pizzaHaul, leftover;

        //if there is no remainder, the leftover will be 0.
        if (totalSlice % numPeople == 0){
            leftover = 0;
            pizzaHaul = totalSlice / numPeople;
            System.out.println("Each person gets " + pizzaHaul + " pieces of pizza.\nThere are " + leftover + " leftover pieces.");

        //assuming there is a remainder.
        } else {
            pizzaHaul = totalSlice / numPeople;
            leftover =  totalSlice % numPeople;
            System.out.println("Each person gets " + pizzaHaul + " pieces of pizza.\nThere are " + leftover + " leftover pieces.");
        }

    }
}
