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
            while (true) {
                String pizzaSize = input.next();
                pizzaSize = pizzaSize.toLowerCase();
                if (pizzaSize.equals("small")) {
                    pizzaPrice = pizzaPrice + 7.99;
                    break;
                }
                if (pizzaSize.equals("medium")) {
                    pizzaPrice = pizzaPrice + 10;
                    break;
                }
                if (pizzaSize.equals("large")) {
                    pizzaPrice = pizzaPrice + 13.99;
                    break;
                }
                else{
                    System.out.println("invalid respones try again");
                }
            }

            while (placeholder != 1) {
                System.out.println("please enter your toppings and type done when finshed. extra topping cost 1.25");
                topping = input.next();
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
