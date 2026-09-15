class Car {
    String modelo;
    String cor;
    double velocidade;

    void acelerar() {
        velocidade += 10;
    }
}
class CarroEsportivo extends Car {
    void ativarTurbo() {
        velocidade += 50;
    }
}
public class Heranca {
    public static void main(String[] args) {
        CarroEsportivo c = new CarroEsportivo();
        c.modelo = "Uno com escada";
        c.cor = "vermelho";
        c.velocidade = 0;

        c.acelerar();
        c.ativarTurbo();
        System.out.println(c.velocidade);
    }
}