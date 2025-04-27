import java.util.Scanner;

public class Palindromo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite uma palavra: ");
    String entrada = scanner.nextLine();

    String formatada = entrada.replaceAll("\\s+", "").toLowerCase();

    String invertida = new StringBuilder(formatada).reverse().toString();

    if (formatada.equals(invertida)) {
      System.out.println("É um palíndromo.");
    } else {
      System.out.println("Não é um palíndromo.");
    }
    scanner.close();
  }
}
