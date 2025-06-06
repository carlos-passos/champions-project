import java.util.Scanner;

public class SistemaConversor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("*** Conversor de Temperatura ***");

        //temperatura
        System.out.println("Digite a temperatura: ");
        int grade = input.nextInt();

        System.out.println("Digite a opção de conversão: ");
        System.out.println("1 - Celsius;");
        System.out.println("2 - Farenheit");
        System.out.println("3 - Kelvin");
        int option = input.nextInt();
        System.out.println("** Resultado **");

        Temperature temperature = new Temperature();
        temperature.setCelsius(grade);
        Conversor conversor = new Conversor();
        if (option == 1) {
            System.out.println("Já está em Celsius.");
        } else if (option == 2) {
            conversor.fromFarenheitToCelsius(temperature);
            double farenheit = temperature.getCelsius() * 9 / 5 + 32;
            System.out.println(farenheit + " " + "Graus Farenheit");

        } else if (option == 3) {
            conversor.fromCelsiusToKelvin(temperature);
            double kelvin = temperature.getCelsius() + 273.15;
            System.out.println(kelvin + " " + "Kelvin");


        } else {
            System.out.println("Opção inválida, digite 1 para converter para Celcius, 2 para converter para Farenheit e 3 para converter para Kelvin.");
        }

    }
}
