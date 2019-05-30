package com.epam.courses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter binary number: ");
        Scanner scanner = new Scanner(System.in);
        String binary = scanner.nextLine();

        binaryToNumber(binary);
    }

    private static void binaryToNumber(String binary) {
        char c;
        int number = 0;
        int b;

        for (int i = 0; i < binary.length(); i++) {
            c = binary.charAt(binary.length() - 1 - i);
            if (c == '0' || c == '1') {
                if (c == '0') {
                    b = 0;
                } else {
                    b = 1;
                }
            } else {
                System.out.println("Wrong binary number");
                return;
            }
            number += b * Math.pow(2, i);
        }
            System.out.println("\"" + binary + "\"" + "->" + number);
    }
}
