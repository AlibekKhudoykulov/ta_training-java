package com.epam.training.Alibek_Khudoykulov.Fundamental;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println(sum);
                sum = 0;
            } else {
                sum += Integer.parseInt(input);
            }
        }
    }
}
