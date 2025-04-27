import java.util.Scanner;

public class Desconto {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o preço original do produto: ");
    double preco = scanner.nextDouble();

    System.out.print("Digite o desconto em porcentagem: ");
    double desconto = scanner.nextDouble();

    double valorDesconto = (preco * desconto) / 100;

    double valorFinal = preco - valorDesconto;

    System.out.println("O valor final do produto é: " + valorFinal);

    scanner.close();
  }
}
