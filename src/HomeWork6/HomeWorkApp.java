package HomeWork6;

import java.util.Scanner;

public class HomeWorkApp {

    public static void main(String[] args) {

        HomeWorkApp homeWorkApp = new HomeWorkApp();
        homeWorkApp.printThreeWords();
        homeWorkApp.checkSumSign();
        homeWorkApp.printColor();
        homeWorkApp.compareNumbers();
        homeWorkApp.twoNumbers();
        homeWorkApp.positiveNegative(-1);
        homeWorkApp.trueFalse(3);
        homeWorkApp.printOut("hello", 3);
        homeWorkApp.year(500);
    }

    void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    void checkSumSign() {
        int a = 6;
        int b = 33;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Sum is positive.");
        } else {
            System.out.println("Sum is negative.");
        }
    }

    void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Red");
        } else if (0 < value && value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    void compareNumbers() {
        int a = 0;
        int b = 3;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    boolean twoNumbers() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    void positiveNegative(int number) {
        if (number >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }

    boolean trueFalse (int number) {
        return number < 0;
    }

    void printOut (String print, int i) {
        for (int count = 0; count < i; count++) {
            System.out.println(print);
        }
    }

    boolean year(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
