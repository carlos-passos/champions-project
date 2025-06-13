public class PontoMedio {

    Integer x1, y1;
    Integer x2, y2;

    public PontoMedio(Integer x1, Integer y1, Integer x2, Integer y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

        System.out.println("\nCoordenadas dos pontos:");
        System.out.println("Ponto A: (" + x1 + ", " + y1 + ")");
        System.out.println("Ponto B: (" + x2 + ", " + y2 + ")");
    }

    public static void main(String[] args) {
        System.out.println("+=======================================+");
        System.out.println("| ** * Calculadora de Ponto Médio * ** |");
        System.out.println("+=======================================+");

        PontoMedio ponto = new PontoMedio(2, 3, 8, 7);

        System.out.println("\nCalculando o ponto médio...");
        Double[] resultado = ponto.calcularPontoMedio();
        System.out.println("Ponto Médio: (" + resultado[0] + ", " + resultado[1] + ")");

        System.out.println("\n+=======================================+");
    }

    public Double[] calcularPontoMedio() {
        Double xm = (x1 + x2) / 2.0;
        Double ym = (y1 + y2) / 2.0;
        return new Double[] { xm, ym };
    }
}
