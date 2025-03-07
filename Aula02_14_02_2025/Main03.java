package Aula02_14_02_2025;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos:");
        int studentsAmount = scanner.nextInt();
        switch (studentsAmount) {
            case 10, 20:
                System.out.println("Sala I-16");
                break;
            case 30:
                System.out.println("Sala I-22");
                break;
            default:
                System.out.println("A quantidade de alunos está fora dos valores previstos.");
                break;
        }
        scanner.close();
    }
}
