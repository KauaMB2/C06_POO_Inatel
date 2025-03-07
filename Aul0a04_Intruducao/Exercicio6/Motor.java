package Aul0a04_Intruducao.Exercicio6;

class Motor {
    String cilindradas;
    float velocidadeMaxima;

    public Motor(String cilindradas, float velocidadeMaxima) {
        this.cilindradas = cilindradas;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void mostraInfo() {
        System.out.println("Motor: " + cilindradas + " cilindradas, Velocidade Máxima: " + velocidadeMaxima + " km/h");
    }
}