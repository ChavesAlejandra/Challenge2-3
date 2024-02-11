package Gestion_Electrodomesticos;

public class ElectricalAppliance {
    private double _price;
    private String _color;
    private char _energy;
    private double _weight;

    public double getPrice() {
        return _price;
    }
    private void setPrice (double pPrice) {
        _price = pPrice;
    }

    public String getColor() {
        return _color;
    }
    private void setColor (String pColor) {
        _color = pColor;
    }

    public char getEnergy() {
        return _energy;
    }
    private void setEnergy (char pEnergy) {
        _energy = pEnergy;
    }

    public double getWeight() {
        return _weight;
    }
    private void setWeight (double pWeight) {
        _weight = pWeight;
    }

    private final static double PRICE_DEFAULT = 100;
    private final static String COLOR_DEFAULT = "blanco";
    private final static char ENERGY_DEFAULT = 'F';
    private final static double WEIGHT_DEFAULT = 5;

    //constructores
    public ElectricalAppliance(double pPrice, String pColor, char pEnergy, double pWeight) {
        _price = pPrice;
        _color = pColor;
        _energy = pEnergy;
        _weight = pWeight;
    }

    public ElectricalAppliance () {
        _price = PRICE_DEFAULT;
        _color = COLOR_DEFAULT;
        _energy = ENERGY_DEFAULT;
        _weight = WEIGHT_DEFAULT;
    }

        public ElectricalAppliance (double pPrice, double pWeight ) {
        _price = pPrice;
        _color = COLOR_DEFAULT;
        _energy = ENERGY_DEFAULT;
        _weight = pWeight;

    }

    String [] arrColors = {"white", "black","red", "blue", "grey"};

}
