import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculadora {
    static Scanner input = new Scanner(System.in);
    public void main(String[] args) {
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


    }
}