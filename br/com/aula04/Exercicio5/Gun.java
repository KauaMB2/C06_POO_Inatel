package br.com.aula04.Exercicio5;

public class Gun {
    private String name;
    private int power;
    private int resistance;
    private String description;

    public Gun(String name, int power, int resistance, String description) {
        this.name = name;
        this.power = power;
        this.resistance = resistance;
        this.description = description;
    }

    public void showInfoGun() {
        System.out.println("Gun Info:");
        System.out.println("Name: " + this.name);
        System.out.println("Power: " + this.power);
        System.out.println("Resistance: " + this.resistance);
        System.out.println("Description: " + this.description);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return this.power;
    }

    public void useGun() {
        this.resistance -= 5;
        if(this.resistance < 0){
            this.resistance = 0;
        }
    }

    public int getResistance() {
        return this.resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
