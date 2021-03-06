public class Converter {
    Double magnitude;
    String unit;

    public Converter(Double magnitude, String unit) {
        this.magnitude = Normalizer(magnitude, unit);
        this.unit = unit;
    }

    private Double Normalizer(Double magnitude, String unit) {
        if (unit.equals("F")) {
            return (magnitude - 32) * 5 / 9 + 273.15;
            // refers to the magnitude of the instance of Converter
        } else if (unit.equals("C")) {
            return magnitude + 273.15;
        } else if (unit.equals("K")) {
            return magnitude;
        } else if (unit.equals("R")) {
            return magnitude * 5 / 9;
        } else {
            return null;
        }
    }

    public Double toFahrenheit() {
        if (this.unit.equals("F")) {
            return this.magnitude;
            // refers to the magnitude of the instance of Converter
        } else if (this.unit.equals("C")) {
            return this.magnitude * 9 / 5 + 32;
        } else if (this.unit.equals("K")) {
            return (this.magnitude - 273.15) * 9 / 5 + 32;
        } else if (this.unit.equals("R")) {
            return this.magnitude - 459.67;
        } else {
            return null;
        }
    }

    public Double toCelsius() {
        if (this.unit.equals("F")) {
            return (this.magnitude - 32) * 5 / 9;
        } else if (this.unit.equals("C")) {
            return this.magnitude;
        } else if (this.unit.equals("K")) {
            return this.magnitude - 273.15;
        } else if (this.unit.equals("R")) {
            return (this.magnitude - 491.67) * 5 / 9;
        } else {
            return null;
        }
    }

    public Double toRankine() {
        if (this.unit.equals("F")) {
            return this.magnitude + 459.67;
            // refers to the magnitude of the instance of Converter
        } else if (this.unit.equals("C")) {
            return this.magnitude * 9 / 5 + 491.67;
        } else if (this.unit.equals("K")) {
            return (this.magnitude * 9 / 5);
        } else if (this.unit.equals("R")) {
            return this.magnitude;
        } else {
            return null;
        }
    }
}