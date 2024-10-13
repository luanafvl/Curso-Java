import java.util.Scanner;

public class Funcionario {

    private Departamento depart;
    private Scanner sc = new Scanner(System.in);
    private int[] idFuncionario = new int[100];
    private String[] nomesFuncionarios = new String[100];
    private String[] cargosFuncionarios = new String[100];
    private int[] departamento = new int[100];
    private int optDepartamento;
    private int optFuncionario;
    public int contagem;

    public Funcionario(Departamento depart) {
        this.depart = depart;
    }

    public void listarFuncionarios() {
        boolean encontrado = false; // Para controlar se algum funcionário foi encontrado

        for (int i = 0; i < nomesFuncionarios.length; i++) {
            if (nomesFuncionarios[i] != null) {
                // Se encontrar um funcionário
                encontrado = true;
                System.out.println("Nome: " + nomesFuncionarios[i]);
                System.out.println("ID: " + idFuncionario[i]);
                System.out.println("Cargo: " + cargosFuncionarios[i]);
                System.out.println("----------");
            }
        }
        // Se nenhum funcionário for encontrado
        if (!encontrado) {
            System.out.println("Nenhum funcionário encontrado.");
        }
    }

    //função de adc funcionario
    public void addFuncionario() {

        System.out.println("Adicionando funcionario...");
        int index = 0;
        while (nomesFuncionarios[index] != null && index < nomesFuncionarios.length - 1) {
            index++;
        }
        System.out.println("Nome do funcionario: ");
        nomesFuncionarios[index] = sc.nextLine();

        System.out.println("ID do funcionario: ");
        idFuncionario[index] = Integer.parseInt(sc.nextLine());

        System.out.println("Cargo do funcionario: ");
        cargosFuncionarios[index] = sc.nextLine();

        System.out.println("Funcionários adicionados:");
        for (int i = 0; i < nomesFuncionarios.length; i++) {
            if (nomesFuncionarios[i] != null) {
                System.out.println("----------");
                System.out.println("Nome: " + nomesFuncionarios[i]);
                System.out.println("ID: " + idFuncionario[i]);
                System.out.println("Cargo: " + cargosFuncionarios[i]);
                System.out.println("----------");
            }
        }
    }
  

    //função de atribuir um funcionario a um departamento
    public void atribuirFuncionarioDepartamento() {

        int contagemFuncionariosDisponiveis = 0;
        int contagem2 = 0;

        System.out.println("Atribuindo funcionário a um departamento...");

        //abre um loop dentro do array de departamentos
        for (int i = 0; i < depart.getDepartamentos().length; i++) {
            if (depart.getDepartamentos()[i] != null) {
                contagem2++;
            }
        }
        System.out.println("Departamentos disponíveis:");

        for (int i = 0; i < depart.getDepartamentos().length; i++) {

            //verificando se existe algum departamento no array
            //se sim, aparecem as escolhas
            if (contagem2 > 0) {
                //for (int j = 0; j < depart.getDepartamentos().length; j++) {
                if (depart.getDepartamentos()[i] != null) {
                    System.out.println(i + 1 + ". " + depart.getDepartamentos()[i]);
                }

                //senão, tem de crirar um departamento
            } else if (contagem2 == 0) {
                System.out.println("=========");
                System.out.println("Erro: não existem departamentos dispiníveis");
                System.out.println("=========");

                return;
            }
        }

        optDepartamento = sc.nextInt();
        sc.nextLine();
        System.out.println("Departamento escolhido: " + depart.getDepartamentos()[optDepartamento - 1]);
        System.out.println("----------");
        System.out.println("Nome: " + depart.getDepartamentos()[optDepartamento - 1]);
        System.out.println("ID: " + depart.getIdDepartamento()[optDepartamento - 1]);
        System.out.println("----------");

        for (int j = 0; j < depart.getDepartamentos().length; j++) {

            if (optDepartamento == departamento[j]) {
                contagem++;
            }
        }

        if (contagem == 0) {
            System.out.println("Não há funcionários neste departamento");
        } else if (contagem > 0){
            System.out.println("Funcionários: ");
            for (int i = 0; i < nomesFuncionarios.length; i++) {
                if (nomesFuncionarios[i] != null && optDepartamento == departamento[i]) {
                    System.out.println(nomesFuncionarios[i]);
                }
            }
            System.out.println("----------");
        }

        System.out.println("Funcionários disponíveis:");

        for (int i = 0; i < departamento.length; i++) {

            if (departamento[i] == 0 && nomesFuncionarios[i] != null) {
                System.out.println(i + 1 + ". " + nomesFuncionarios[i]);
                contagemFuncionariosDisponiveis++;
            }
        }
        if (contagemFuncionariosDisponiveis == 0) {
            System.out.println("Não há funcionários disponíveis para atribuição.");
            return;
        }
        optFuncionario = sc.nextInt();
        sc.nextLine();
        departamento[optFuncionario-1] = optDepartamento;
        System.out.println("Funcionário(a) " + nomesFuncionarios[optFuncionario - 1] + " atribuído(a) ao departamento de " + depart.getDepartamentos()[optDepartamento - 1]);
    }

  
    //função de gerenciar funcionarios: Adicionar, atualizar e remover
    public void gerenciarFuncionarios () {

        System.out.println("Gerenciando funcionários...\n1.Adicionar funcionário\n2.Atualizar funcionário\n3.Remover funcionário\n4.Sair");
        int opt = sc.nextInt();
        sc.nextLine();

        int opt2;

        while (opt >= 1 && opt <= 3) {

            switch (opt) {
                case 1:
                    addFuncionario();
                    break;
                case 2:
                    //atualizar
                    System.out.println("Opção escolhida: Atualizar funcionário");
                    System.out.println("Funcionários disponíveis:");

                    //abre um loop dentro do array de nomes de funcionarios
                    for (int i = 0; i < nomesFuncionarios.length; i++) {
                        //se a posição for preenchida com um nome, ou seja, se for diferente de nula, o nome irá aparecer juntamente de um número, que é a ordem de adição do funcionario no sistema

                        if (nomesFuncionarios[i] != null) {
                            System.out.println(i + 1 + ". " + nomesFuncionarios[i]);
                        }
                    }

                    opt2 = sc.nextInt();
                    sc.nextLine();

                    //abre novamente um loop, mas agora para a seleção do funcionário a ser atualizado
                    for (int i = 0; i < nomesFuncionarios.length; i++) {

                        //primeira posição -> 1 - 1 == 0
                        if ((opt2 - 1) == i) {
                            System.out.println("Funcionário selecionado: " + nomesFuncionarios[i]);
                            System.out.println("----------");

                            System.out.println("Nome do funcionario: ");
                            nomesFuncionarios[i] = sc.nextLine();

                            System.out.println("ID do funcionario: ");
                            idFuncionario[i] = Integer.parseInt(sc.nextLine());

                            System.out.println("Cargo do funcionario: ");
                            cargosFuncionarios[i] = sc.nextLine();
                        }
                    }
                    System.out.println("----------");
                    break;
                case 3:
                    //remover
                    System.out.println("Opção escolhida: Atualizar funcionário");
                    System.out.println("Funcionários disponíveis:");

                    for (int i = 0; i < nomesFuncionarios.length; i++) {
                        if (nomesFuncionarios[i] != null) {
                            System.out.println(i + 1 + ". " + nomesFuncionarios[i]);
                        }
                    }
                    //pegar as posições do array que não são null
                    opt2 = sc.nextInt();
                    sc.nextLine();
                    int auxOpt;
                    auxOpt = opt2 - 1;
                    //remover da posição -> numero escolhido - 1
                    nomesFuncionarios[auxOpt] = null;
                    idFuncionario[auxOpt] = 0;
                    cargosFuncionarios[auxOpt] = null;
                    break;
            }
            System.out.println("1.Adicionar funcionário\n2.Atualizar funcionário\n3.Remover funcionário\n4.Sair");
            opt = sc.nextInt();
            sc.nextLine();
        }
    }
}

