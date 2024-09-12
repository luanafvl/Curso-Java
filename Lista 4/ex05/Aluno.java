package main;

import java.util.Scanner;

public class Aluno {

    Scanner sc = new Scanner(System.in);

    private String nome = "Luhh";
    private int matricula = 123;
    double [] notas = new double[5];

    public double[] recebeNotas() {
        System.out.println("Notas: ");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextDouble();
        }
        return notas;
    }

    double media = 0;

    public double media(double[] notas) {
        for (int i = 0; i < this.notas.length; i++) {
            media += notas[i];
        }
        return media/5;
    }
}
