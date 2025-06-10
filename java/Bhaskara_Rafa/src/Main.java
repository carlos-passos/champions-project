public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        //Bhaskara
        double bhaskara = main.bhaskara( 45, 22, 5);
        System.out.println(bhaskara);

    }

    public double bhaskara(double a, double b, double c) {
        double x = b + Math.sqrt(b * b - 4 * a * c / 2 * a) ;
        double result = a * x * x + b * x + c;
        return result;
    }
}
