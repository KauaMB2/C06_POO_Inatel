package Aul0a04_Intruducao.Exercicio6;

public class Main {
    public static void main(String[] args) {
        Piloto mario = new Piloto("Mario", false);
        Piloto bowser = new Piloto("Bowser", true);

        Motor motor50 = new Motor("50", 50);
        Motor motor150 = new Motor("150", 150);

        Kart kart1 = new Kart("Kart Vermelho", motor50, mario);
        Kart kart2 = new Kart("Kart Verde", motor150, bowser);

        kart1.mostrarInfo();
        kart1.pular();
        kart1.soltarTurbo();
        kart1.fazerDrift();

        System.out.println("-----------------");

        kart2.mostrarInfo();
        kart2.pular();
        kart2.soltarTurbo();
        kart2.fazerDrift();
    }
}
