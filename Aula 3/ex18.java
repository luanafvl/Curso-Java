package main;

import java.util.Scanner;

public class ola {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int[] primos = new int[100];
        int n, contagemPrimos, contagemQnt=0;

        do {
            System.out.println("Quantidade de números primos: ");
            n = sc.nextInt();
        } while (n < 0);
        
        for (int i = 1; i < 100; i++) {
            contagemPrimos=0;
            for (int j = 1; j < 100; j++) {
                if (i%j==0){
                    contagemPrimos++;
                }
            }
            if(contagemPrimos==2){
                primos[i] = i;
                contagemQnt++;
            }
            if (contagemQnt==n){
                break;
            }
        }
        for (int i = 0; i < primos.length; i++) {
            if (primos[i] != 0){
                System.out.println(primos[i]);
            }
        }
    }
}