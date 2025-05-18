import java.util.Scanner;

public class Campeonato {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] times = new char[16];
    for (int i = 0; i < 16; i++) {
      times[i] = (char) ('A' + i);
    }

    // Oitavas de final
    char[] vencedoresOitavas = new char[8];
    for (int i = 0; i < 8; i++) {
      char time1 = times[2 * i];
      char time2 = times[2 * i + 1];
      int gols1 = -1, gols2 = -1;

      while (true) {
        try {
          System.out.print("Oitavas - " + time1 + " x " + time2 + " - Gols do " + time1 + ": ");
          gols1 = Integer.parseInt(scanner.nextLine());

          System.out.print("Oitavas - " + time1 + " x " + time2 + " - Gols do " + time2 + ": ");
          gols2 = Integer.parseInt(scanner.nextLine());

          if (gols1 < 0 || gols2 < 0) {
            System.out.println("Gols não podem ser negativos.");
            continue;
          }

          if (gols1 == gols2) {
            System.out.println("Empates não são permitidos. Tente novamente.");
            continue;
          }

          break;
        } catch (NumberFormatException e) {
          System.out.println("Entrada inválida! Digite apenas números inteiros.");
        }
      }

      vencedoresOitavas[i] = gols1 > gols2 ? time1 : time2;
    }

    // Quartas de final
    char[] vencedoresQuartas = new char[4];
    for (int i = 0; i < 4; i++) {
      char time1 = vencedoresOitavas[2 * i];
      char time2 = vencedoresOitavas[2 * i + 1];
      int gols1 = -1, gols2 = -1;

      while (true) {
        try {
          System.out.print("Quartas - " + time1 + " x " + time2 + " - Gols do " + time1 + ": ");
          gols1 = Integer.parseInt(scanner.nextLine());

          System.out.print("Quartas - " + time1 + " x " + time2 + " - Gols do " + time2 + ": ");
          gols2 = Integer.parseInt(scanner.nextLine());

          if (gols1 < 0 || gols2 < 0) {
            System.out.println("Gols não podem ser negativos.");
            continue;
          }

          if (gols1 == gols2) {
            System.out.println("Empates não são permitidos. Tente novamente.");
            continue;
          }

          break;
        } catch (NumberFormatException e) {
          System.out.println("Entrada inválida! Digite apenas números inteiros.");
        }
      }

      vencedoresQuartas[i] = gols1 > gols2 ? time1 : time2;
    }

    // Semifinais
    char[] vencedoresSemi = new char[2];
    for (int i = 0; i < 2; i++) {
      char time1 = vencedoresQuartas[2 * i];
      char time2 = vencedoresQuartas[2 * i + 1];
      int gols1 = -1, gols2 = -1;

      while (true) {
        try {
          System.out.print("Semifinal - " + time1 + " x " + time2 + " - Gols do " + time1 + ": ");
          gols1 = Integer.parseInt(scanner.nextLine());

          System.out.print("Semifinal - " + time1 + " x " + time2 + " - Gols do " + time2 + ": ");
          gols2 = Integer.parseInt(scanner.nextLine());

          if (gols1 < 0 || gols2 < 0) {
            System.out.println("Gols não podem ser negativos.");
            continue;
          }

          if (gols1 == gols2) {
            System.out.println("Empates não são permitidos. Tente novamente.");
            continue;
          }

          break;
        } catch (NumberFormatException e) {
          System.out.println("Entrada inválida! Digite apenas números inteiros.");
        }
      }

      vencedoresSemi[i] = gols1 > gols2 ? time1 : time2;
    }

    // Final
    char campeao = ' ';
    char time1 = vencedoresSemi[0];
    char time2 = vencedoresSemi[1];
    int gols1 = -1, gols2 = -1;

    while (true) {
      try {
        System.out.print("Final - " + time1 + " x " + time2 + " - Gols do " + time1 + ": ");
        gols1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Final - " + time1 + " x " + time2 + " - Gols do " + time2 + ": ");
        gols2 = Integer.parseInt(scanner.nextLine());

        if (gols1 < 0 || gols2 < 0) {
          System.out.println("Gols não podem ser negativos.");
          continue;
        }

        if (gols1 == gols2) {
          System.out.println("Empates não são permitidos. Tente novamente.");
          continue;
        }

        break;
      } catch (NumberFormatException e) {
        System.out.println("Entrada inválida! Digite apenas números inteiros.");
      }
    }

    campeao = gols1 > gols2 ? time1 : time2;
    System.out.println("Campeão do torneio: " + campeao);

    scanner.close();
  }
}