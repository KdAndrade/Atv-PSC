import java.util.Scanner;

public class Soma {



public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Escreva o primeiro numero: ");
    int num1 = scanner.nextInt();

    System.out.print("Escreva o segundo numero: ");
    int num2 = scanner.nextInt();

    int soma = (num1 + num2);
    System.out.print("A soma é:" + soma);

    scanner.close();
  }

}