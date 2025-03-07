package Aula02_14_02_2025;

import java.util.Random;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(10) + 1;
        System.out.println("Entre com um número entre 1 e 10: ");
        for (int i = 0; i < 10; i++) {
            int userNumber = scanner.nextInt();
            if (userNumber == randomNumber) {
                System.out.println("Você acertou!");
                break;
            } else {
                if (userNumber < randomNumber) {
                    System.out.println("Tente novamente, o número é maior");
                } else {
                    System.out.println("Tente novamente, o número é menor");
                }
            }
        }
        scanner.close();
    }
}
