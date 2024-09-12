//Fazendo mais algumas operacoes

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       //Declarando variaveis
       double A, B, C, pi = 3.14159;

       //Coletando infos
       System.out.println("Informe o valor de A: ");
       A = sc.nextDouble();

       System.out.println("Informe o valor de B: ");
       B = sc.nextDouble();

       System.out.println("Informe o valor de C: ");
       C = sc.nextDouble();

       //Calculos e saidas:

       //a)
       System.out.printf("\nÁrea do triângulo retângulo que tem A por base e C por altura = %.2f", (A*C)/2);

       //b)
       System.out.printf("\nÁrea do círculo de raio C = %.2f", pi*C*C);

       //c)
       System.out.printf("\nÁrea do trapézio que tem A e B por bases e C por altura = %.2f", (A+B)*C/2);

       //d)
       System.out.printf("\nÁrea do quadrado de lado B = %.2f", B*B);

       //e)
       System.out.printf("\nÁrea do retângulo que tem lados A e B = %.2f", A*B);
   }
}
