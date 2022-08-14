package com.fizzBuzz;

import java.util.Scanner;

public class Main {

    static boolean isDivisible (int inputNumber, int divider) {
      return inputNumber % divider == 0;
    };

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        String input = scanner.next();
        int inputNumber = Integer.parseInt(input);

        String result;

        if (isDivisible(inputNumber, 3) && isDivisible(inputNumber, 5)) {
            result = "FizzBuzz";
        } else if (isDivisible(inputNumber, 3))  {
            result = "Fizz";
        } else if (isDivisible(inputNumber, 5)) {
            result = "Buzz";
        }else {
           result = input;
        }

        System.out.println(result);
    }
}