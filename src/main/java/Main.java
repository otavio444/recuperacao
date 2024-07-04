import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite seu nome completo: ");
    String nome = sc.nextLine();
    System.out.println("Digite sua idade:");
    String idade = sc.nextLine();
    System.out.println("Digite seu altura:");
    Double altura = sc.nextDouble();
    System.out.println("Digite 1 se seu sexo for masculino ou 2 se seu sexo for feminino:");
    if (sc.nextInt() == 1);
    System.out.println("Ola" + " " + nome + " " + "fizemos uma breve analise das informações passadas e temos as seguintes informações a repassar:");
    System.out.println("seu peso ideal é de:");
    System.out.printf("%.2f", (72.7 * altura) - 58);
    System.out.println("");
    System.out.println("Obrigado por usar nosso aplicativo!");
    if (sc.nextInt() == 2);
    
    System.out.println("seu peso ideal é de:");
    System.out.printf(" %.2f", (62.1 * altura) - 44.7);
    System.out.println("");
   System.out.println("Obrigado por usar nosso aplicativo!");

    sc.close();

  }

}