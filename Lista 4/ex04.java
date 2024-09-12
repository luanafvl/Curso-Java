package main;

import java.util.Scanner;

public class ola {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int L, C, casa;

        System.out.println("Linha: ");
        L = sc.nextInt();
        System.out.println("Coluna: ");
        C = sc.nextInt();

        if (L%2==0){
            L = 0;
        } else {
            L = 1;
        } if (C%2==0){
            C = 0;
        } else {
            C = 1;
        }

        if (L==C){
            casa=1;
        } else {
            casa=0;
        }
        System.out.println(casa);
    }
}
