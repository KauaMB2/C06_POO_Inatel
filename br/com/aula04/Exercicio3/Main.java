package br.com.aula04.Exercicio3;

public class Main {
    public static void main(String[] args) {
        Zombie z1 = new Zombie(100.0, 90, 5);
        Zombie z2 = new Zombie(100.0, 90, 5);
        System.out.println("The z1's health is: " + z1.getHealth());
        System.out.println("The z2's health is: " + z2.getHealth());
        z1.transferHealth(z2, 5);
        System.out.println("The z1's health is: " + z1.getHealth());
        System.out.println("The z2's health is: " + z2.getHealth());
        z1 = z2;
        z1.transferHealth(z2, 5);
        System.out.println("The z1's health is: " + z1.getHealth());
        System.out.println("The z2's health is: " + z2.getHealth());
    }
}
