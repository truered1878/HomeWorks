package HomeWork7;

import java.util.Random;
import java.util.Scanner;

public class StringClass {

    void findSymbolOccurance() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i <= str.length()-1; i++) {
            if (str.charAt(i) == ch) {
                count++;
            }

        } System.out.println(count);
    }

    void findWordPosition() {
        Scanner sc = new Scanner(System.in);
        String source = sc.nextLine();
        String target = sc.nextLine();
        if (source.contains(target)) {
            System.out.println(source.indexOf(target));
        } else {
            System.out.println(-1);
        }
    }

    void stringReverse() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = new char[str.length()];
        int i = 0;
        int n = str.length() - 1;
        int m = 0;
        while (i < str.length()) {
            ch[m] = str.charAt(n);
            i++;
            m++;
            n--;
        }
        System.out.println(ch);
    }

    void isPalindrome() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        int i = 0;
        int n = 0;
        int m = str.length() - 1;
        while (i < str.length() / 2) {
            if (str.charAt(n) == str.charAt(m)) {
                n++;
                m--;
                i++;
                if (i >= str.length() / 2) {
                    System.out.println(str + " -> " + true);
                    break;
                }
            } else {
                System.out.println(str + " -> " + false);
                break;
            }
        }
    }

    void guessWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        int randomIndex = random.nextInt(words.length - 1);
        String randomWord = words[randomIndex];

        System.out.println("Guess a word?");
        Scanner sc = new Scanner(System.in);
        String userWord = sc.nextLine().toLowerCase();

        char[] ch = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
        char[] symb = {' ', '~', '`', '!', '@', '"', '#', '¹', '$', '%', '^', ':', '&', '?', '*', '(', ')', '-', '_',
                '=', '+', ';', ',', '.', '/', '|', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '<', '>', '?',};

        for (int n = 0; n <= randomWord.length()-1 || n <= userWord.length()-1;) {
            for (int i = 0; i <= userWord.length()-1; i++) {
                for (int j = 0; j <= symb.length - 1; j++) {
                    if (userWord.charAt(i) == symb[j] || userWord.length() - 1 == 0) {
                        System.out.println("Do not use any symbols. Type a simple word.");
                        userWord = sc.nextLine().toLowerCase();
                    }
                }
            } if (randomWord.equals(userWord)) {
                System.out.println("Your answer is correct: " + userWord);
                break;
            } if (userWord.length()-1 <= 1 || userWord.length()-1 > 15) {
                System.out.println("Your word is too small or big. Try again.");
                userWord = sc.nextLine().toLowerCase();
            } else if (randomWord.charAt(n) == userWord.charAt(n)) {
                ch[n] = userWord.charAt(n);
                n++;
                if (n > randomWord.length()-1 || n > userWord.length()-1) {
                    n = 0;
                    System.out.println(ch);
                    userWord = sc.nextLine().toLowerCase();
                }
            } else if (n == randomWord.length()-1 || n == userWord.length()-1) {
                n = 0;
                System.out.println(ch);
                userWord = sc.nextLine().toLowerCase();
            } else {
                n++;
            }
        }
    }
}
