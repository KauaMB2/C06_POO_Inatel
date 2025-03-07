package Aul0a04_Intruducao.Exercicio5;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("João", 25, 10);
        System.out.println("p1's points : " + p1.getPoints());
        p1.takeDamage();
        System.out.println("p1's points : " + p1.getPoints());
        Gun g1 = new Gun("AK 47", 5, 30, "DESCRIÇÃO");
        System.out.println("g1's resistance : " + g1.getResistance());
        p1.useGun(g1);
        System.out.println("g1's resistance : " + g1.getResistance());
    }
}
