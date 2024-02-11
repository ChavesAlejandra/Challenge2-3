package Gestion_Electrodomesticos;

public class Electrical_Appliance {
    private double _price;
    private String _color;
    private char _energy;
    private double _weight;

    public double getPrice() {
        return _price;
    }
    private void setPrice (double pPrice) {
        this._price = pPrice;
    }

    public String getColor() {
        return _color;
    }
    private void setColor (String pColor) {
        this._color = pColor;
    }

    public char getEnergy() {
        return _energy;
    }
    private void setEnergy (char pEnergy) {
        this._energy = pEnergy;
    }

    public double getWeight() {
        return _weight;
    }
    private void setWeight (double pWeight) {
        this._weight = pWeight;
    }

    private final static double PRICE_DEFAULT = 100;
    private final static String COLOR_DEFAULT = "blanco";
    private final static char ENERGY_DEFAULT = 'F';
    private final static double WEIGHT_DAFAULT = 5;

    //constructor
    public Electrical_Appliance(double pPrice, String pColor, char pEnergy, double pWeight) {
        this._price = pPrice;
        this._color = pColor;
        this._energy = pEnergy;
        this._weight = pWeight;
    }

    //constructor por defecto
    public Electrical_Appliance () {
        this._price = PRICE_DEFAULT;
        this._color = COLOR_DEFAULT;
        this._energy = ENERGY_DEFAULT;
        this._weight = WEIGHT_DEFAULT;
    }

}
