package com.fizzBuzz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        String input = scanner.next();
        int number = Integer.parseInt(input);

        String result;

        if ((number % 3 == 0) && (number % 5 == 0)) {
            result = "FizzBuzz";
        } else if (number % 3 == 0) {
            result = "Fizz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        }else {
           result = input;
        }

        System.out.println(result);
    }
}