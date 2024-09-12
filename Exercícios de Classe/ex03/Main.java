public class Main {
    public static void main(String[] args) {

       Funcionario funcionario = new Funcionario();
       Gerente gerente = new Gerente();
       Desenvolvedor desenvolvedor = new Desenvolvedor();

        System.out.println("---Bonificações---");
        System.out.println("Funcionario: " + funcionario.calcular_bonificacao());
        System.out.println("Gerente: " + gerente.calcular_bonificacao());
        System.out.println("Desenvolvedor: " + desenvolvedor.calcular_bonificacao());
    }
}