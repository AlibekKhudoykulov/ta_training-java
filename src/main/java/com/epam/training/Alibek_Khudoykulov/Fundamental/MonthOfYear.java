package com.epam.training.Alibek_Khudoykulov.Fundamental;

import java.util.Scanner;

public class MonthOfYear {
    public static void main(String[] args) {
        while (true) {
            String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter month number (1-12): ");
            int month = scanner.nextInt();
            if (month > 0 && month < 13) {
                System.out.println("Month number " + month + " is " + months[month-1]);
            }else {
                System.out.println("Wrong month number");
            }

        }
    }
}
