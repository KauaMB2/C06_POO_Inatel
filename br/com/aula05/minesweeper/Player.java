package br.com.aula05.minesweeper;

public class Player {
    public int posX;
    public int posY;
    public Player(){
        this.posX=0;
        this.posY=0;
    }
    public boolean moveUp() {
        if (posY < 1) {
            posY++;
            return true;
        }
        return false;
    }

    public boolean moveDown() {
        if (posY > 0) {
            posY--;
            return true;
        }
        return false;
    }

    public boolean moveLeft() {
        if (posX > 0) {
            posX--;
            return true;
        }
        return false;
    }

    public boolean moveRight() {
        if (posX < 1) {
            posX++;
            return true;
        }
        return false;
    }
    
    public void moveToStart(){
        this.posX = 0;
        this.posY = 0;
    }
}
