package Aul0a04_Intruducao.Exercicio6;

class Kart {
    String nome;
    Motor motor;
    Piloto piloto;

    public Kart(String nome, Motor motor, Piloto piloto) {
        this.nome = nome;
        this.motor = motor;
        this.piloto = piloto;
    }

    public void pular() {
        System.out.println(nome + " deu um pulo!");
    }

    public void soltarTurbo() {
        System.out.println(nome + " ativou o turbo!");
    }

    public void fazerDrift() {
        System.out.println(nome + " fez um drift!");
    }

    public void mostrarInfo() {
        System.out.println("Kart: " + nome);
        piloto.soltaSuperPoder();
        motor.mostraInfo();
    }
}