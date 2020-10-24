package ND_2020_10_26_Calculator;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input function: ");
        String function = sc.nextLine();
        String operators[] = function.split("[0-9]+");
        String numbers[] = function.split("[+-/*!]");
        if (function.equals("")) {
            System.out.println(0);
            return;
        } else if (function.indexOf(",") > 0) {
            System.out.println("-1" + " (Function can't contain not a whole number");
            return;
        }
        int calculation = Integer.parseInt(numbers[0]);
        int result = calculation;
        for (int i = 1; i < numbers.length; i++) {
            if (operators[i].equals("*")) {
                calculation = Integer.parseInt(numbers[i]) * Integer.parseInt(numbers[i - 1]);
            } else if (operators[i].equals("/")) {
                if (Integer.parseInt(numbers[i]) == 0) {
                    System.out.println("-1" + " (Division from zero is not possible.");
                    return;
                } else
                    calculation /= Integer.parseInt(numbers[i]);
            } else if (operators[i].equals("+")) {
                calculation += Integer.parseInt(numbers[i]);
            } else if (operators[i].equals("-")) {
                calculation -= Integer.parseInt(numbers[i]);
            } else if (operators[i].equals("!")) {
                for (int a = 1; a <= Integer.parseInt(numbers[i - 1]); a++) {
                    calculation *= a;
                }
            }
        }
        System.out.println(calculation);
    }
}