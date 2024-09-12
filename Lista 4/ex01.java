package main;

import java.util.Scanner;

public class ola {
    public static void main(String[] args) {

        int []lados = new int[4];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++){
            System.out.println("Lado "  + (i+1));
            do {
                lados[i] = sc.nextInt();
            } while (lados[i] < 1 || lados[i] > 100);
        }
        if (lados[0]*lados[1]>lados[2]*lados[3]){
            System.out.println(lados[0]*lados[1]);
        } else {
            System.out.println(lados[2]*lados[3]);
        }
    }
}
