import java.util.Random;

public class MegaSena {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[6];

        for (int i = 0; i < 6; i++) {
            numeros[i] = random.nextInt(60) + 1;
        }

        System.out.print("Números gerados: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(numeros[i]);
            if (i < 5) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
