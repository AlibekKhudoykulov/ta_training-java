package com.epam.training.Alibek_Khudoykulov.Fundamental;

import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of random numbers: ");
        int n=scanner.nextInt();
        int[] array=new int[n];
        for (int i=0;i<n;i++){
            array[i]= (int) (Math.random()*100);
        }
        for (int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
