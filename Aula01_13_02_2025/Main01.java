package Aula01_13_02_2025;
import java.util.Scanner;

class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número de lanches comidos na primeira hora: ");
        int xBurger1 = scanner.nextInt();
        System.out.println("Digite o número de lanches comidos na segunda hora: ");
        int xBurger2 = scanner.nextInt();
        System.out.println("Digite o número de lanches comidos na terceira hora: ");
        int xBurger3 = scanner.nextInt();
        int xBurguerTotal = xBurger1 + xBurger2 + xBurger3;
        System.out.println("O número total de lanches comidos foi: " + xBurguerTotal);
        float media = xBurguerTotal/3.0F;
        System.out.println("A média de lanches comidos por hora foi: " + media);
        scanner.close();
    }
}