import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static double num1 = 0, num2 = 0,sum=0, conut = 0;
public static    ArrayList<Double> resultsCalculator = new ArrayList<>();

    public static void main(String[] args) {
        try {
            Calc();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }// End -Main.

    public static void Calc()throws  Exception {


        while (true) {

            printMenu();

            System.out.print("\t> Enter you choice: ");
            String choice = input.next();


            if (choice.matches("([0-9]{1,2})")) {
                switch (choice) {


                    case "0":
                       //Exit
                        exit();
                        break;

                    case "1":
                        //Enter 1 to addition the numbers.
                        addition();

                        break;

                    case "2":
                        //Enter 2 to subtraction the numbers.
                        subtraction();

                        break;


                    case "3":
                        //Enter 3 to multiplication the numbers.
                        multiplication();

                        break;


                    case "4":
                        //Enter 4 to division the numbers.
                        division();

                        break;
                    case "5":
                        // Enter 5 to modulus the numbers.
                        modulus();
                        break;
                    case "6":
                        //Enter 6 to find minimum number.
                        minimum();
                        break;

                    case "7":
                        //Enter 7 to find maximum number.
                        maximum();
                        break;

                    case "8":
                        //Enter 8 to find the average of numbers.
                        average();
                        break;

                    case "9":
                        //Enter 9 to print the last result in calculator.
                        lastResult();
                        break;

                    case "10":
                        //Enter 10 to print the list of all results in calculator.
                        allResults();

                        break;

                    default:
                        System.out.println("\t\t --- Please Enter from 0 To 10 --- \n");
                        break;
                }

            } else {
                System.out.println("your Enter wrong!!");
            }


        }


    }

    private static void allResults() {
        System.out.print("\t\tAll results:[ ");
        for (int i = 0; i < resultsCalculator.size(); i++) {
            System.out.print(resultsCalculator.get(i) + " ");
        }
        System.out.print(" ]");
        System.out.println("\n\n");
    }

    private static void lastResult() {
        System.out.print("\t\tlast result:[ ");
        for (int i = 0; i <resultsCalculator.size() ; i++) {

        }
        System.out.print(resultsCalculator.get(resultsCalculator.size()-1) + " ");

        System.out.print(" ]");
        System.out.println("\n\n");
    }

    private static void average() {
        for (int i = 0; i <resultsCalculator.size() ; i++) {
            sum+=resultsCalculator.get(i);
            conut++;
        }
        System.out.println("Count:"+conut);
        System.out.println("average result : "+sum/conut);
    }

    private static void maximum() {
        System.out.print("Please Enter first number: ");
        try {
            num1 = input.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("please Input Only number");
        }

        System.out.print("Please Enter first number: ");
        try {
            num2 = input.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("please Input Only number");
        }
        if(num1>num2){
            System.out.println("MaxNumber is: "+num1);
        }else{
            System.out.println("MaxNumber is: "+num2);
        }


    }

    private static void minimum() {
        System.out.print("Please Enter first number: ");
        try {
            num1 = input.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("please Input Only number");
        }

        System.out.print("Please Enter first number: ");
        try {
            num2 = input.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("please Input Only number");
        }
        if(num1<num2){
            System.out.println("Min Number is: "+num1);
        }else{
            System.out.println("Min Number is: "+num2);
        }

    }

    private static void modulus() {
        System.out.print("Please Enter first number: ");
        try {
            num1 = input.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("please Input Only number");
        }

        System.out.print("Please Enter first number: ");
        try {
            num2 = input.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("please Input Only number");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        double reslut5 = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        resultsCalculator.add(reslut5);
    }

    private static void division() {
        System.out.print("Please Enter first number: ");
        try {
            num1 = input.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("please Input Only number");
        }

        System.out.print("Please Enter first number: ");
        try {
            num2 = input.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("please Input Only number");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        double reslut4 = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        resultsCalculator.add(reslut4);
    }

    private static void multiplication() {
        System.out.print("Please Enter first number: ");
        try {
            num1 = input.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("please Input Only number");
        }

        System.out.print("Please Enter first number: ");
        try {
            num2 = input.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("please Input Only number");
        }
        double reslut3 = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + reslut3);
        resultsCalculator.add(reslut3);
    }

    private static void subtraction() {
        System.out.print("Please Enter first number: ");
        try {
            num1 = input.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("please Input Only number");
        }

        System.out.print("Please Enter first number: ");
        try {
            num2 = input.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("please Input Only number");
        }

        double result1 = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result1);
        resultsCalculator.add(result1);
    }

    private static void exit() {
        System.out.println("\t >Thank you  :) ");
        System.exit(-1);
    }

    private static void addition() {
        System.out.print("Please Enter first number: ");
        try {
            num1 = input.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("please Input Only number");
        }


        System.out.print("Please Enter first number: ");
        try {
            num2 = input.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("please Input Only number");
        }
        double result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        resultsCalculator.add(result);
    }

    private static void printMenu() {
        System.out.println("\n\n\t ---Welcom to My Calculators---\n" +
                "\n" +
                "\t Enter 1 to addition the numbers\n" +
                "\n" +
                "\t Enter 2 to subtraction the numbers\n" +
                "\n" +
                "\t Enter 3 to multiplication the numbers\n" +
                "\n" +
                "\t Enter 4 to division the numbers\n" +
                "\n" +
                "\t Enter 5 to modulus the numbers\n" +
                "\n" +
                "\t Enter 6 to find minimum number\n" +
                "\n" +
                "\t Enter 7 to find maximum number\n" +
                "\n" +
                "\t Enter 8 to find the average of numbers\n" +
                "\n" +
                "\t Enter 9 to print the last result in calculator\n" +
                "\n" +
                "\t Enter 10 to print the list of all results in calculator" +
                "\n" +
                "\n\t\t \"---Enter Exit to Exit---\"\n\n ");

    }

}