import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double peso;
        double altura;
        double imc;
        char sexo;
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Peso: "); peso = sc.nextDouble();
        System.out.println("Altura: "); altura = sc.nextDouble();
        System.out.println("Sexo: "); sexo = sc.next().charAt(0);

        imc = peso / (altura * altura);

        if (sexo == 'm' || sexo == 'M') {
            System.out.println("Você é homem");
        } else if (sexo == 'f' || sexo == 'F') {
            System.out.println("Você é mulher");
        } else {
            System.out.println("Sexo invalido");
        }
        
        if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("IMC normal");
        } else {
            System.out.println("IMC anormal");
        }
    }
}