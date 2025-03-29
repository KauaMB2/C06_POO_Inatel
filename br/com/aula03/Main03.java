package br.com.aula03;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe sua NPA: ");
        float NPA = scanner.nextFloat();
        if(NPA >= 60){
            System.out.println("Aprovado");
        }else{
            System.out.println("Informe sua NP3: ");
            float NP3 = scanner.nextFloat();
            float NFA = NP3 + NPA;
            System.out.println("NFA: " + NFA);
            if(NFA >= 50){
                System.out.println("Aprovado");
            }
        }

        scanner.close();
    }
}
