import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, contagem=0;
        double soma=0;

        do{
            System.out.println("Número: ");
            num1 = sc.nextInt();
            if (num1!=0){
                soma+=num1;
                contagem++;
                }
        } while(num1 != 0);

        System.out.printf("Média: %.2f\n", soma/contagem);
    }
}