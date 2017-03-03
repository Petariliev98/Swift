package CalculatorClient;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "s";
        
        while (s.equals("END") == false) {

            System.out.println("Enter operation: ");
            s = sc.nextLine();
            if ((s.equals("END"))) {
                break;
            } else if ((s.equals("SUM") == false) && (s.equals("END") == false) && (s.equals("MUL") == false) && (s.equals("DIV") == false) && (s.equals("PER") == false) && (s.equals("SUB") == false)) {
                System.out.println("wrong command");
            } else {
                System.out.print("enter the first number: ");
                double num1 = sc.nextDouble();
                sc.nextLine();
                System.out.print("enter the second number: ");
                double num2 = sc.nextDouble();
                sc.nextLine();

                Calculator c1 = new Calculator();

                switch (s) {
                    case "SUM":
                        System.out.printf("%.3f", c1.sum(num1, num2));
                        break;
                    case "MUL":
                        System.out.printf("%.3f", c1.multiply(num1, num2));
                        break;
                    case "DIV":
                        System.out.printf("%.3f", c1.divide(num1, num2));
                        break;
                    case "PER":
                        System.out.printf("%.3f", c1.percentage(num1, num2));
                        break;
                    case "SUB":
                        System.out.printf("%.3f", c1.subtract(num1, num2));
                        break;
                }

            }
        }

    }

}