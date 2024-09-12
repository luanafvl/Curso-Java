package main;

import java.util.Scanner;

public class ola {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float[] array = new float[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        float[] newArray = new float[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                newArray[i] = array[i];
            }
            if(newArray[i] != 0) {
                System.out.println(newArray[i]);
            }
        }
    }
}
