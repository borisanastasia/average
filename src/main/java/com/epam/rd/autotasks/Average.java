package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().trim().split("\\s");
        int sum = 0;

        for (int i = 0; i < input.length - 1; i++) {
            sum += Integer.parseInt(input[i]);
        }

        int average = sum / (input.length - 1);
        System.out.println(average);
    }
}