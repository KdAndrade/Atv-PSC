
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva a temperatura: ");
        int temperatura = scanner.nextInt();

        if (temperatura >= 25){
            System.out.println("A temperatura é:" + temperatura + "°C");
            System.out.print("Hoje está quente.");
        }
        else {
            System.out.println("A temperatura é:" + temperatura + "°C");
            System.out.print("Hoje está frio.");
        }


    }
    
}
