package br.com.aula10;

public class Boi extends Mamifero{
    public Boi(String nome, double vida){
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Boi " + this.nome + " emitiu som.");
    }
}
