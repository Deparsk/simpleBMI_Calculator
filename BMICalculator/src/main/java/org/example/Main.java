package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your weight ?");
        double weight = scanner.nextDouble();
        System.out.println("What is your Height ?");
        double height = scanner.nextDouble();

        double formula = 1000 * (weight /  (height * height));

        if (formula >= 25.0) {
            System.out.println("Your BMI is: " + formula + " You are OVER_WEIGHT");
        } else if (formula < 18.5) {
            System.out.println("Your BMI is: " + formula + " You are UNDER_WEIGHT");
        } else {
            System.out.println("your BMI is: "+ formula + " You're within the Health range, keep eating healthy.");
        }

    }

        }

