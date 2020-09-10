package superthis;

public class Drink {

    String type, brand;
    int mostSugar;

    // constructor
    public Drink(String type, String brand, int mostSugar) {
        this.type = type;
        this.brand = brand;
        this.mostSugar = mostSugar;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public int getMostSugar() {
        return mostSugar;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMostSugar(int mostSugar) {
        this.mostSugar = mostSugar;
    }
}
