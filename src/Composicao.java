class Motor {
    String tipo;
    double velocidade;

    void acelerar() {
        velocidade += 10;
    }
}

class Carro {
    String modelo;
    String cor;
    Motor motor; // Carro "tem um" Motor (composição)

    Carro() {
        motor = new Motor(); // motor criado junto com o carro
    }

    void acelerar() {
        motor.acelerar(); // delegação
    }
}

public class Composicao {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.modelo = "Uno com escada";
        c.cor = "vermelho";
        c.motor.tipo = "1.0 flex";

        c.acelerar();
        System.out.println(c.motor.velocidade);
    }
}