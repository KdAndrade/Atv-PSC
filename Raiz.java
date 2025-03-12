
import java.util.Scanner;

public class Raiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Calculo de raiz quadrada: ");
        Double num1 = scanner.nextDouble();

        if (num1 < 0) {
        System.out.print("É impossivel calcular a raiz quadrada desse numero.");
    }
        else {
            Math.sqrt(num1);
            double raiz = Math.sqrt(num1);
            System.out.print("A raiz" + num1 + "é:" + raiz);
        }

        scanner.close();
    }
}
