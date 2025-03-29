package br.com.aula07.space_shooter.inimigo;

public class Asteroide {
    public String nome;
    public String tipoAsteroide;
    public Asteroide (String nome, String tipoAsteroide){
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
    }
    public void destruir(){
        System.out.println("Asteroide " + this.nome + " destruído");
    }
}