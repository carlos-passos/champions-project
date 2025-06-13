public class Bhaskara {

    Integer a;
    Integer b;
    Integer c;

    public Bhaskara(Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("\n" + this.a + "x^2 " + this.b + "x " + this.c + " = 0\n");
        System.out.println("Coeficientes: a = " + this.a + ", b = " + this.b + ", c = " + this.c);
    }

    public static void main(String[] args) {
        System.out.println("+===================================+");
        System.out.println("| ** * Bhaskara Calculator * ** |");
        System.out.println("+===================================+");

        Bhaskara bhaskara = new Bhaskara(2, -16, -18); //Instanciando equação 1
//        Bhaskara bhaskara = new Bhaskara(1, 12, -13); //Instanciando equação 2


        Integer delta = bhaskara.calculateDelta();
        System.out.println("\nCalculando o ∆ (Delta)...");
        if (delta < 0) {
            System.out.println("Não existem raízes reais.");
        } else {
            System.out.println("∆ (Delta)......: " + delta);

            System.out.println("\nCalculando as raízes...");
            Integer root1 = bhaskara.calculateRoot1();
            Integer root2 = bhaskara.calculateRoot2();
            System.out.println("X'  (Raiz 1)...: " + root1);
            System.out.println("X'' (Raiz 2)...: " + root2);

        }

        System.out.println("\n+===================================+");
    }

    public Integer calculateDelta() {
        return (b * b) - (4 * a * c);
    }

    public Integer calculateRoot1() {
        return (int) ((-b + Math.sqrt(calculateDelta())) / (2 * a));
    }

    public Integer calculateRoot2() {
        return (int) ((-b - Math.sqrt(calculateDelta())) / (2 * a));
    }

}






































































































































































































































































































































































