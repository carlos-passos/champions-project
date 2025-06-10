public class Conversor {

    private Temperature temperature;

    public void fromFarenheitToCelsius(Temperature temperature) {
        double farenheit = temperature.getCelsius() * 9 / 5 + 32;
        this.temperature = temperature;
        this.temperature.setFarenheit(farenheit);
    }

    public void fromCelsiusToKelvin(Temperature temperature) {
        double kelvin = temperature.getCelsius() + 273.15;
        this.temperature = temperature;
        this.temperature.setKelvin(kelvin);
    }
    public void fromCelsiusToFahrenheit(Temperature temperature) {
        double celcius = temperature.getFarenheit() / 9 * 5 - 32;
        this.temperature = temperature;
        this.temperature.setCelsius(celcius);
    }

    }

}
