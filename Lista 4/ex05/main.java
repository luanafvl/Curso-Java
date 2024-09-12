package main;

public class ola {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        double[] notas = aluno.recebeNotas();
        double media = aluno.media(notas);

        if (media>=5)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
    }
}
