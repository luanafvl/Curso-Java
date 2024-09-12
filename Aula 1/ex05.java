//Fazendo mais algumas operacoes

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       //Declarando variaveis
       int A, B, C, D;

       //Coletando infos
       System.out.println("Informe o valor de A: ");
       A = sc.nextInt();

       System.out.println("Informe o valor de B: ");
       B = sc.nextInt();

       System.out.println("Informe o valor de C: ");
       C = sc.nextInt();

       System.out.println("Informe o valor de D: ");
       D = sc.nextInt();

       //Calculos e saidas:

       System.out.printf("Resultado = %d", (A*B)-(C*D));
   }
}
