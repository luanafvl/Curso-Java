public class Funcionario {
    String nome;
    float salario = 1000;

    public double calcular_bonificacao(){
        double bonificacao = salario * 0.1;
        return bonificacao;
    }
}
