package br.com.aula07.arcanoide;

import br.com.aula07.arcanoide.player.Player;
import br.com.aula07.arcanoide.block.Block;
import br.com.aula07.arcanoide.converter.Converter;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Player 1");
        new Block("Block 1");
        new Block("Block 2");
        System.out.println(p1.getPoints());
        Block.destroyBlock(p1);
        System.out.println(p1.getPoints());
        Block.destroyBlock(p1);
        Block.destroyBlock(p1);
        System.out.println("Player's points: " + Converter.convert(p1.getPoints()));
    }
}
