package br.com.aula04.Exercicio4;

public class Zombie {
    private double health;
    private int speed;
    private int resistance;
    private boolean alive;

    public Zombie(double health, int speed, int resistance) {
        this.health = health;
        this.speed = speed;
        this.resistance = resistance;
        this.alive = true;
    }

    public void attack() {
        if (alive) {
            System.out.println("The zombie is attacking!");
        } else {
            System.out.println("The zombie is dead and cannot attack.");
        }
    }

    public void move() {
        if (alive) {
            System.out.println("The zombie is moving with speed " + speed);
        } else {
            System.out.println("The zombie is dead and cannot move.");
        }
    }

    public void takeDamage(int damage) {
        if (alive) {
            health -= damage;
            System.out.println("The zombie took " + damage + " damage.");
            if (health <= 0) {
                alive = false;
                System.out.println("The zombie is dead!");
            }
        } else {
            System.out.println("The zombie is dead and cannot take more damage.");
        }
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void displayStatus() {
        System.out.println("Zombie - Health: " + health + ", Speed: " + speed + ", Resistance: " + resistance + ", Alive: " + alive);
    }

    public boolean transferHealth (Zombie otherZombie, int amount) {
        if (this.isAlive() && otherZombie.isAlive()) {
            if(otherZombie.getHealth() >= amount) {
                this.health += amount;
                otherZombie.health -= amount;
                return true;
            }else{
                System.out.println("The zombie doesn't have enough health to transfer.");
                
            }
        }else{
            System.out.println("One or both zombies are dead.");
        }
        return false;
    }
}
