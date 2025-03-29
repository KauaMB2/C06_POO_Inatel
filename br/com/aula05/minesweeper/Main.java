package br.com.aula05.minesweeper;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player();
        int movesCounter = 0;
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int bombPosX = random.nextInt(2);
        int bombPosY = random.nextInt(2);
        Minesweeper game = new Minesweeper(bombPosX, bombPosY);
        while (true) {
            System.out.println("Movimentos disponíveis: W (Cima), A (Esquerda), S (Baixo), D (Direita)");
            System.out.print("Sua posição: (" + p1.posX + ", " + p1.posY + ")\n");
            System.out.print("Digite a direção: ");
            char move = input.next().charAt(0);

            // Realiza o movimento
            boolean validMove = false;
            switch (move) {
                case 'W': case 'w':
                    validMove = p1.moveUp();
                    break;
                case 'S': case 's':
                    validMove = p1.moveDown();
                    break;
                case 'A': case 'a':
                    validMove = p1.moveLeft();
                    break;
                case 'D': case 'd':
                    validMove = p1.moveRight();
                    break;
                default:
                    System.out.println("Movimento inválido! Use W, A, S ou D.");
                    continue;
            }
            int gameStatus = game.checkPosition(p1, movesCounter);
            if (validMove) {
                movesCounter++;
            } else {
                System.out.println("Você não pode se mover para essa direção!");
            }
            if (gameStatus == 0) {
                System.out.println("Você caiu na bomba! Fim de jogo.");
                break;
            } else if (gameStatus == 1) {
                System.out.println("Você fez 2 movimentos. Fim de jogo.");
                break;
            }
        }
        input.close();
    }
}
