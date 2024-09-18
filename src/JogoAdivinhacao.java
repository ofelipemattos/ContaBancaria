import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            int numeroRandomico = new Random().nextInt(100);
            Scanner input = new Scanner(System.in);
            System.out.println("Escolhi um número entre 0 e 100. Tente adivinhar qual é! Você tem 5 tentativas.");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Digite sua resposta: ");
                int resposta = input.nextInt();
                if (resposta == numeroRandomico) {
                    System.out.printf("VOCÊ ACERTOU! O NÚMERO QUE ESCOLHI FOI O %d!!!\n", numeroRandomico);
                    break;
                } else {
                    String maiorOuMenor = "menor";
                    if (numeroRandomico > resposta) {
                        maiorOuMenor = "maior";
                    }
                    if (i < 5) {
                        System.out.printf("Você errou, mas ainda tem %d tentativas. Dica: O número que escolhi é %s.\n", 5 - i, maiorOuMenor);
                    } else {
                        System.out.printf("Que pena! O número que escolhi foi %d. \n", numeroRandomico);
                    }
                }
            }
            System.out.println("Deseja continuar? S");
            if (!input.next().equalsIgnoreCase("S")) {
                continuar = false;
            }
        }
    }
}