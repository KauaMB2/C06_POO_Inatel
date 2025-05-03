package br.com.aula11;

public class Lontra extends Mamifero implements Aquatico {
    public Lontra(String nome, double vida){
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Lontra " + this.nome + " emitiu som.");
    }

    @Override
    public void nadar() {
        System.out.println("Lontra " + this.nome + " está nadando.");
    }
}
