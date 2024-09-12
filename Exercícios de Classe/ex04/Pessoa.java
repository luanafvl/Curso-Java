import java.util.Scanner;

public class Pessoa {
    Scanner sc = new Scanner(System.in);
    Endereco endereco = new Endereco();

    public String obtRua(){
        System.out.println("Rua: ");
        endereco.rua = sc.nextLine();
        return endereco.rua;
    }
    public int obtNumero(){
        System.out.println("Numero: ");
        endereco.numero = sc.nextInt();
        sc.nextLine();
        return endereco.numero;
    }
    public String obtCidade(){
        System.out.println("Cidade: ");
        endereco.cidade = sc.nextLine();
        return endereco.cidade;
    }
}
