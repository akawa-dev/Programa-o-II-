class Carro {
    String cor;
    String modelo;
    double velocidade;

    void acelerar() {
        velocidade += 10;
    }
}

class CarroEsportivo extends Carro {
    void ativarTurbo() {
        velocidade += 50;
    }
}

public class Main {
    public static void main(String[] args) {
        CarroEsportivo c = new CarroEsportivo();
        c.cor = "vermelho";
        c.modelo = "Fusca Turbo";
        c.velocidade = 0;

        c.acelerar();
        c.ativarTurbo();

        System.out.println(c.velocidade);
    }
}