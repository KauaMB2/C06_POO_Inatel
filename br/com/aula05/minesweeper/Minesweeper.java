package br.com.aula05.minesweeper;

public class Minesweeper {
    public int bombPosX;
    public int bombPosY;
    public Minesweeper(int bombPosX, int bombPosY){
        this.bombPosX=bombPosX;
        this.bombPosY=bombPosY;
    }
    public int checkPosition(Player player, int movesCounter){
        if (player.posX == bombPosX && player.posY == bombPosY) {
            return 0;
        }
        if (movesCounter == 1){
            return 1;
        }
        return 2;
    }
}
