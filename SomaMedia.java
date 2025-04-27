import java.util.Scanner;

public class SomaMedia {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int soma = 0;
    int numero;
    double media;

    for (int i = 0; i < 5; i++) {
      System.out.println("Digite um número:");
      numero = scanner.nextInt();

      soma += numero;
    }

    media = (double) soma / 5;
    System.out.println("Soma: " + soma);
    System.out.println("Média: " + media);
    scanner.close();

  }
}
