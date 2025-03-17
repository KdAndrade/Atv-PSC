import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nota 1: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Nota 2: ");
        double num2 = scanner.nextDouble();

        System.out.print("Quantidade de faltas: ");
        int faltas = scanner.nextInt();

        double media = (num1 + num2) / 2.0; 
        System.out.println("A média é: " + media);

        if (faltas >= 10) {
            System.out.println("Aluno Reprovado por faltas.");
            scanner.close();
            return; 
        }

        if (media >= 10) {
            System.out.println("O aluno foi aprovado com excelência.");
        } else if (media >= 7) {
            System.out.println("O aluno foi Aprovado.");
        } else if (media >= 5) {
            System.out.println("Aluno de Recuperação.");
        } else {
            System.out.println("Aluno Reprovado por nota.");
        }

        scanner.close();
    }
}
