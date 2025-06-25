public class Carro {

    // atributos
    String nome;
    String marca;
    int ano;
    int vel;

    // métodos
    void acelerar(int aceleracao) {
        vel += aceleracao;
    }

    void frear(int reduzir) {
        vel -= reduzir;
    }

    void buzina() {
        System.out.println("bibi");
    }
}

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Carro();

        c1.nome = "uno";
        c1.marca = "fiat";
        c1.ano = 2015;
        c1.vel = 60;

        c1.acelerar(10);
        System.out.println(c1.vel);
    }
}