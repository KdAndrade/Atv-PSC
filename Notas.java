
import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nota 1: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Nota 2: ");
        int num2 = scanner.nextInt();

        double media = (num1 + num2) /2 ;
        System.out.println("A media é: " + media);

        if (media >= 7) {
            System.out.print("O aluno foi Aprovado.");
            
        } else {
            System.out.print("Aluno reprovado");
        }

        scanner.close();
    }

}