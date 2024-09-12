import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1;
        int num2;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 2 números: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1>0 && num2>0) {
            System.out.println(num1*num2);
        } else if (num1<0 || num2<0) {
            System.out.println(num1+num2);
        }
    }
}