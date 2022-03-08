package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println(pow(2,3));
        //System.out.println((fak(5)));
        //System.out.println(fib(25));
        //System.out.println(recursivePow(2,3));
        //System.out.println(recursiveFak(5));

        //System.out.println(charCount("Anna", 'a'));

        //int[] array = {1,2,5,1,4,2,5,1,3,1,1,1,2,8,11,1};
        //System.out.println(count(1, array, array.length - 1));

        //String word = "hejsa";
        //reverseDisplay(word, word.length() - 1);

        int[] array = {1,7,4,5,8,2,3};
        reverseArray(array, array.length - 1);

        //Scanner input = new Scanner(System.in);
        //System.out.print("Enter a decimal integer: ");
        //int decimal = input.nextInt();
        //System.out.println(decimal + " is hex " + dec2Hex(decimal));
    }

    // opgaveark opgave 1 - iterativ
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int returnValue = x;
        for (int i = 1; i < n; i++) {
             returnValue *= x;
        }
        return returnValue;
    }

    // opgaveark opgave 1 - recursiv
    public static int recursivePow(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * recursivePow(x, n - 1);
        }
    }

    // opgaveark opgave 2 - iterativ
    public static int fak(int n) {
        int returnValue = n;
        for (int i = n - 1; i > 0; i--) {
            returnValue *= i;
        }
        return returnValue;
    }

    // opgaveark opgave 2 - recursiv
    public static int recursiveFak(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * recursiveFak(n - 1);
        }
    }

    // opgaveark opgave 3 - iterativ
    public static int fib(int n) {
        int first = 0;
        int second = 1;
        int sum = 0;

        if (n == 0) {
            return first;
        } else if (n == 1) {
            return second;
        }

        for (int i = 1; i < n; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }

        return sum;
    }

    // opgaveark opgave 4 - interativ
    public static int charCount(String s, char c) {
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    // opgaveark opgave 5
    public static int count(int n, int[] array, int arraySize) {
        int result = 0;
        if (arraySize >= 0) {
           result = count(n,array, arraySize - 1) + ((array[arraySize] == n) ? 1 : 0);
        }
        return result;
    }

    // opgaveark opgave 6 - iterativ
    public static void reverseDisplay(String word, int high) {
        for (int i = high; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }

    // opgaveark opgave 7 - recursiv
    public static void reverseArray(int[] array, int index) {
        if (index >= 0) {
            System.out.println(array[index]);
            reverseArray(array, index - 1);
        }
    }

    // opgaveark opgave 8
    public static String dec2Hex(int value) {
        if (value == 0)
            return "";
        else {
            System.out.format("%s %s\n",value/16,value%16);
            return dec2Hex(value / 16) + dec2HexChar(value % 16);
        }
    }

    public static char dec2HexChar(int value) {
        if (value >= 10 && value <=15)
            return (char)('A' + value - 10);
        else
            return (char)('0' + value);
    }
}



