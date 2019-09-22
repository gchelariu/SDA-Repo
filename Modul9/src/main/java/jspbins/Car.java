package jspbins;

public class Car {

    String brand;
    String type;
    int year;
    double km;

    public Car(String brand, String type, int year, double km) {
        this.brand = brand;
        this.type = type;
        this.year = year;
        this.km = km;
    }

    public String toString() {
        return "Masina: - brand:" + brand + " - type:" + type + " - year:" + year + " - km:" + km;
    }
}
