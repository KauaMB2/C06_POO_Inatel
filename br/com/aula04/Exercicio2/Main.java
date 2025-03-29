package br.com.aula04.Exercicio2;

public class Main {
    public static void main(String[] args) {
        Zombie z1 = new Zombie(100.0, 90, 5);
        Zombie z2 = new Zombie(80.0, 70, 3);
        System.out.println("The z1's health is: " + z1.getHealth());
        System.out.println("The z2's health is: " + z2.getHealth());
        z1.transferHealth(z2, 30);
        System.out.println("The z1's health is: " + z1.getHealth());
        System.out.println("The z2's health is: " + z2.getHealth());
    }
}
