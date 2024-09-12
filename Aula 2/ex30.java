import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, maior=0, contagem=0;

        do{
            System.out.println("Número: ");
            num1 = sc.nextInt();
            if (num1!=0){
                if (contagem==0)
                    maior = num1;
                else
                if (num1>maior)
                    maior = num1;
                contagem++;
            }
        } while(num1 != 0);

        System.out.printf("Maior: %d", maior);
    }
}