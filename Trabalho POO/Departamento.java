import java.util.Scanner;

public class Departamento {

    private String[] departamentos = new String[100];
    private int[] idDepartamento = new int[100];
    private String[] funcionariosDepartamento = new String[100];

    private Scanner sc = new Scanner(System.in);

  
    //geranciador de departamentos
    public String[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(String[] departamentos) {
        this.departamentos = departamentos;
    }

    public int[] getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int[] idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public void gerenciarDepartamentos() {

        System.out.println("Gerenciando departamentos...\n1.Adicionar departamento\n2.Atualizar departamento\n3.Remover departamento\n4.Sair");

        int opt = sc.nextInt();
        sc.nextLine();

        while (opt >= 1 && opt <= 3) {

            switch (opt) {
                case 1:
                    addDepartamento();
                    break;
                case 2:
                    atualizarDepartamento();
                    break;
                case 3:
                    removerDepartamento();
                    break;
            }
            System.out.println("1.Adicionar departamento\n2.Atualizar departamento\n3.Remover departamento\n4.Sair");
            opt = sc.nextInt();
            sc.nextLine();
        }
    }

    public void addDepartamento() {

        System.out.println("Adicionando departamento...");

        int index = 0;
        while (index < departamentos.length && departamentos[index] != null) {
            index++;
        }

        if (departamentos[index] == null) {
            System.out.println("Nome do departamento: ");
            departamentos[index] = sc.nextLine();

            System.out.println("ID do departamento: ");
            idDepartamento[index] = Integer.parseInt(sc.nextLine());

            System.out.println("Departamentos adicionados");
            System.out.println("----------");
            for (int i = 0; i < departamentos.length; i++) {
                if (departamentos[i] != null) {
                    System.out.println("Nome: " + departamentos[i]);
                    System.out.println("ID: " + idDepartamento[i]);
                    System.out.println("----------");
                }
            }
        }
    }


    public void atualizarDepartamento() {

        System.out.println("Opção escolhida: Atualizar departamento");

        if (departsDisponiveis()) {

            int opt2 = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < departamentos.length; i++) {

                //primeira posição -> 1 - 1 == 0
                if ((opt2 - 1) == i) {
                    System.out.println("Departamento selecionado: " + departamentos[i]);
                    System.out.println("----------");

                    System.out.println("Nome do departamento: ");
                    departamentos[i] = sc.nextLine();

                    System.out.println("ID do departamento: ");
                    idDepartamento[i] = Integer.parseInt(sc.nextLine());
                }
            }
            System.out.println("----------");
        }
    }

    public void removerDepartamento() {

        int opt2;

        //remover
        System.out.println("Opção escolhida: Remover departamento");

        if (departsDisponiveis()){
            //pegar as posições do array que não são null

            opt2 = sc.nextInt();
            int auxOpt;
            auxOpt = opt2-1;
            //remover da posição -> numero escolhido - 1
            departamentos[auxOpt] = null;
            idDepartamento[auxOpt] = 0;
            funcionariosDepartamento[auxOpt] = null;
        }
    }

  
    //Serve para uniformizar o código e evitar repetiçoes
    public boolean departsDisponiveis() {

        int contagemDeparts = 0;
        boolean boleano=false;

        for (int i = 0; i < departamentos.length; i++) {
            if (departamentos[i] != null) {
                contagemDeparts++;
            }
        }
        System.out.println("Departamentos disponíveis:");

        if (contagemDeparts > 0) {
            //Verificando se existem departamentos
            for (int i = 0; i < departamentos.length; i++) {
                if (departamentos[i] != null) {
                    System.out.println(i + 1 + ". " + departamentos[i]);
                }
            }
            boleano = true;
        }
        //senão, ele sai do gerenciamento
        else if (contagemDeparts == 0) {
            System.out.println("=========");
            System.out.println("Erro: não existem departamentos dispiníveis");
            System.out.println("=========");
        }
        return boleano;
    }
}
