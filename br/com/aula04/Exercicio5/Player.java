package br.com.aula04.Exercicio5;

public class Player {
    private String name;
    private int points;
    public Player(String name, int points, int resistance) {
        this.name = name;
        this.points = points;
    }
    public void takeDamage() {
        if(this.points > 0){
            this.points -= 5;
        }
        if(this.points < 0){
            this.points = 0;
        }
    }
    public int getPoints() {
        return points;
    }
    public String getName() {
        return name;
    }
    public void useGun (Gun gun) {
        if (gun.getResistance() > 0) {
            gun.useGun();
        }else{
            System.out.println("Your gun is broken");
        }
    }
}
