import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("***Calculadora***");
        System.out.println("Digite um numero: ");
        int first = input.nextInt();

        System.out.println("Digite o segundo numero: ");
        int sec = input.nextInt();

        System.out.println("Escolha a operação que deseja calcular: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        int operation = input.nextInt();

        System.out.println("** Resultado **");
        if (operation == 1) {
            Calculadora calculadora = new Calculadora();
            int sum = calculadora.sum(first, sec);
            System.out.println(sum);
        } else if (operation == 2) {
            Calculadora calculadora = new Calculadora();
            int min = calculadora.min(first, sec);
            System.out.println(min);
        } else if (operation == 3) {
            Calculadora calculadora = new Calculadora();
            int mul = calculadora.mul(first, sec);
            System.out.println(mul);
        } else if (operation == 4){
            Calculadora calculadora = new Calculadora();
            int div = calculadora.div(first, sec);
            System.out.println(div);
        } else {
            System.out.println("Opção inválida, digite 1 para soma, 2 para subtração, 3 para multiplicação e 4 para divisão.");
        }


    }

    public int sum(int first, int sec){
        int result = first + sec;
        return result;
    }
    public int min(int first, int sec){
        int result = first - sec;
        return result;
    }
    public int mul(int first, int sec){
        int result = first * sec;
        return  result;
    }
    public int div(int first, int sec){
        int result = first / sec;
        return result;
    }

}