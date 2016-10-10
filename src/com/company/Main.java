package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        boolean running = true;
        int action = 2;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        while (running && action == 2) {

            boolean nameInput = true;
            String name = "";

            while (nameInput) {

                System.out.println("Please input your name.");
                String tempName = sc.next();

                if (tempName.length() > 0) {

                    System.out.println("You need to input a name.");

                } else {

                    name = tempName;
                    nameInput = false;

                }
            }

            double rn = rand.nextInt(100) + 1;
            rn = Math.round(rn);
            RNG person = new RNG (rn);

            int lucky = person.perfectRandom(rn);

            boolean ask = true;

            System.out.println("Welcome " + name + "! Your lucky number is " + lucky);

            System.out.println("What would you like to do?");

            while (ask) {


                System.out.println("Type 0 to exit, type 1 to list previous name and lucky number, and type 2 to input another name.");

                action = sc.nextInt();

                if (action == 0) {

                    running = false;
                    break;

                } else if (action == 1) {

                    System.out.println("Your name was " + name + " and your lucky number was " + lucky + ".");

                } else if (action == 2) {

                    ask = false;

                } else {

                    System.out.println("You either input a false number or input words. Please input a number associated with its option.");

                }

            }



        }

    }
}
