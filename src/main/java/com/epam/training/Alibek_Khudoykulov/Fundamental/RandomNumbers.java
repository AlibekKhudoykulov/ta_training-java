package com.epam.training.Alibek_Khudoykulov.Fundamental;

public class RandomNumbers {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        print array elements random order
        for (int i = 0; i < array.length; i++) {
            int randomIndex = (int) (Math.random() * array.length);

            System.out.println(array[randomIndex]);
        }
    }
}
