package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int placeholder1 = 0;
        double pizzaPrice = 0;
        int placeholder = 0;
        int count = 0;
        String userExit;
        String topping;
        Scanner input = new Scanner(System.in);
        while (placeholder1 == 0) {
            System.out.println("what size pizza would you like?");
            String pizzaSize = input.next();
            if (pizzaSize.equals("small")) {
                pizzaPrice = pizzaPrice + 7.99;
            }
            if (pizzaSize.equals("medium")) {
                pizzaPrice = pizzaPrice + 10;
            }
            if (pizzaSize.equals("large")) {
                pizzaPrice = pizzaPrice + 13.99;
            }

            while (placeholder != 1) {

                    System.out.println("please enter your toppings and type done when finshed. extra topping cost 1.25");

                    try {
                        topping = input.next();
                    } catch (InputMismatchException e) {
                        System.out.println("numbers not allowed");
                        topping = input.next();
                    }


                if (count > 2) {
                    pizzaPrice = pizzaPrice + 1.25;
                }
                count++;
                if (topping.equals("done")) {
                    placeholder++;
                }
            }
            System.out.println("would you like to order another pizza?");
            userExit = input.next();
            if (userExit.equals("no")) {
                System.out.println("your total price is " + pizzaPrice);
                placeholder1++;
            }

            }
        }
    }
