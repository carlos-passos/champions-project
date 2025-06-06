public class MainForTemperature {

    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        temperature.setCelsius(18);
        System.out.println("Agora está "+temperature.getCelsius()+" graus celsius em Campo Largo.");

        temperature.setFarenheit(64);
        System.out.println("Agora está "+temperature.getFarenheit()+" farenheit em Campo Largo");



//        ===============================================

        Temperature rioTemperature = new Temperature();
        rioTemperature.setCelsius(29);

        Conversor conversor = new Conversor();
        conversor.fromFarenheitToCelsius(rioTemperature);
        conversor.fromCelsiusToKelvin(rioTemperature);

    }


}
