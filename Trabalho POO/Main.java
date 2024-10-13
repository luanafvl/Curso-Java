import java.util.Scanner;

public class Main {
  public static void main(String[] args) {


      Departamento depart = new Departamento();
      Funcionario funcionario = new Funcionario(depart);

      Scanner sc = new Scanner(System.in);

      int opt;

      System.out.println("Escolha um serviço:\n0.Encerrar programa \n1.Listar funcionários\n2.Atribuir funcionário a um departamento\n3.Gerenciamento de funcionários\n4.Gerenciamento de departamentos");
      opt = sc.nextInt();
      sc.nextLine();

      while (opt >=1 && opt <= 4) {
          switch (opt) {
              case 1:
                  funcionario.listarFuncionarios();
                  break;
              case 2:
                  funcionario.atribuirFuncionarioDepartamento();
                  break;
              case 3:
                  funcionario.gerenciarFuncionarios();
                  break;
              case 4:
                  depart.gerenciarDepartamentos();
                  break;
          }
          System.out.println("Escolha um serviço:\n0.Encerrar programa \n1.Listar funcionários\n2.Atribuir funcionário a um departamento\n3.Gerenciamento de funcionários\n4.Gerenciamento de departamentos");
          opt = sc.nextInt();
          sc.nextLine();
      }
      System.out.println("Programa encerrado.");
  }
}
