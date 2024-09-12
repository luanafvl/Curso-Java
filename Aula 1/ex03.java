//Calculando salario e mostrando total de funcionarios

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       //Declarando variaveis
       int qntFunc;
       int horasTrabalhadas;
       double salarioHora;

       //Coletando infos
       System.out.println("Quantidade de funcionários: ");
       qntFunc = sc.nextInt();

       System.out.println("Carga horária: ");
       horasTrabalhadas = sc.nextInt();

       System.out.println("Salario por hora: ");
       salarioHora = sc.nextDouble();

       //Saida
       System.out.printf("Funcionários: " + qntFunc + "\nSalário: U$%.2f", salarioHora*horasTrabalhadas);
   }
}
