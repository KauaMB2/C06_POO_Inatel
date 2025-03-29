package br.com.aula07.arcanoide.block;

import br.com.aula07.arcanoide.player.Player;

public class Block {
    private static int blocksAmount = 0;
    private String name;
    public Block (String name) {
        this.name = name;
        blocksAmount++;
    }
    public String getName() {
        return this.name;
    }
    public static int getBlocksAmount() {
        return blocksAmount;
    }
    public static void destroyBlock(Player p) {
        if(blocksAmount > 0){
            blocksAmount--;
            p.incrementPoints();
        } else {
            System.out.println("There are no blocks to destroy.");
        }
    }
}
