import java.util.Locale;


public class Main {
   public static void main(String[] args) {


       //Declaracao de variaveis
       String product1 = "Computer";
       String product2 = "Office desk";
       int age = 30;
       int code = 5290;
       char gender = 'F';
       double price1 = 2100.0;
       double price2 = 650.0;
       double measure = 53.234567;


       //Saidas: texto + variaveis
       System.out.println("Produtos:");
       System.out.println(product1 + ": " + price1);
       System.out.println(product2 + ": " + price2);
       System.out.println("Registro: " + age + " anos\nCódigo: " + code + "\nGênero: " + gender);
       System.out.printf("Cercado: %.3f", measure);
       //Mudando a pontuaçao para a dos EUA
       Locale.setDefault(Locale.US);
       System.out.printf("\nPonto decimal dos EUA: %.3f", measure);
   }
}
