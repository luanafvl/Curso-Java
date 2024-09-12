package main;

import java.util.Scanner;

public class ola {
    public static void main(String[] args) {

        int numero = 2018, chute, contagem = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Chute: ");
        do{
            chute = sc.nextInt();
            contagem++;
        } while (chute!=numero);
        System.out.println("Acertou depois de " + (contagem-1) + " erros.");
    }
}