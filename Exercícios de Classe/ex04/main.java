public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        String rua = pessoa.obtRua();
        int numero = pessoa.obtNumero();
        String cidade = pessoa.obtCidade();

        System.out.println("Rua: " + rua);
        System.out.println("Numero: " + numero);
        System.out.println("Cidade: " + cidade);
    }
}