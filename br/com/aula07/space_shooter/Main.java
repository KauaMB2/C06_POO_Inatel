package br.com.aula07.space_shooter;

import br.com.aula07.space_shooter.inimigo.Asteroide;
import br.com.aula07.space_shooter.jogador.Nave;

public class Main{
    public static void main(String[] args) {
        Nave n1 = new Nave("Nave 1", 1000, "Pequeno");
        Asteroide a1 = new Asteroide("Asteroide 1", "Grande");
        n1.atirar(a1);
        Nave n2 = new Nave("Nave 2", 2000, "Grande");
        Asteroide a2 = new Asteroide("Asteroide 2", "Grande");
        n2.atirar(a2);
    }
    
}