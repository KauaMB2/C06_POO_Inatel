package br.com.aula07.space_shooter.jogador;

import br.com.aula07.space_shooter.inimigo.Asteroide;

public class Nave {
    public String nome;
    public double vida;
    public String tipoTiro;

    public Nave(String nome, double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroide ast) {
        if (this.vida > 0) {
            System.out.println(this.nome + " atirou em " + ast.nome);
            if (ast.tipoAsteroide.equals("Grande")) {
                if (this.tipoTiro.equals("Grande")) {
                    ast.destruir();
                } else {
                    System.out.println(this.nome + " não pode destruir " + ast.nome + " com seu tiro");
                }
            } else {
                ast.destruir();
            }
        }
    }
}

