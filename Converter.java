public class Converter {
    Double magnitude;
    String unit;

    public Converter(Double magnitude, String unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    public Double toFahrenheit() {
        if (this.unit.equals("F")) {
            return this.magnitude;
        } else if (this.unit.equals("C")) {
            return this.magnitude * 9 / 5 + 32;
        } else {
            return null;
        }
    }

    public Double toCelsius() {
        if (this.unit.equals("F")) {
            return (this.magnitude - 32) * 5 / 9;
        } else if (this.unit.equals("C")) {
            return this.magnitude;
        } else {
            return null;
        }
    }
}