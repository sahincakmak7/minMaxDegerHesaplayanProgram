package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner input = new Scanner(System.in);

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        System.out.print("Sayı giriniz :");
        int n = input.nextInt();

        int minValue = list[0];
        int maxValue = list[0];


        for (int i : list) {
            if (i < n) {
                minValue = i;

            }
            if (i > n) {
                maxValue = i;
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın değer :" + minValue);
        System.out.println("Girilen sayıdan büyük en yakın değer :" + maxValue);

    }
}
