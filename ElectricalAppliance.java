package GestionElectrodomesticos;
public class ElectricalAppliance {
    private final static String[] COLORS = {"white", "black", "red", "blue", "grey"};
    private final static char[] LETTERS = {'A', 'B', 'C', 'D', 'E', 'F'};
    private final static double PRICE_DEFAULT = 100;
    private final static String COLOR_DEFAULT = "blanco";
    private final static char ENERGY_DEFAULT = 'F';
    private final static double WEIGHT_DEFAULT = 5;
    private double _price;

    public double getPrice() {
        return _price;
    }

    private void setPrice(double pPrice) {
        _price = pPrice;
    }

    public String getColor() {
        return _color;
    }

    private String _color;

    private void setColor(String pColor) {
        _color = pColor;
    }

    private char _energy;

    public char getEnergy() {
        return _energy;
    }

    private void setEnergy(char pEnergy) {
        _energy = pEnergy;
    }

    private double _weight;

    public double getWeight() {
        return _weight;
    }

    private void setWeight(double pWeight) {
        _weight = pWeight;
    }

    public char checkEnergyConsumption(char letter) {
        boolean bLetterFound = false;
        for (int iCount = 0; iCount < LETTERS.length && !bLetterFound; iCount++) {
            bLetterFound = letter == LETTERS[iCount];
            if (iCount == LETTERS.length - 1) {
                letter = ENERGY_DEFAULT;
            }
        }
        return letter;
    }

    public String checkColor(String color) {
        boolean bColorFound = false;
        for (int iCount = 0; iCount < COLORS.length && !bColorFound; iCount++) {
            bColorFound = color.equals(COLORS[iCount]);
            if (iCount == COLORS.length - 1) {
                color = COLOR_DEFAULT;
            }
        }
        return color;
    }

    public void finalPrice () {
        switch (getEnergy()){
            case 'A':{
                setPrice(PRICE_DEFAULT+100);
            }
            case 'B':{
                setPrice(PRICE_DEFAULT+80);
            }
            case 'C':{
                setPrice(PRICE_DEFAULT+60);
            }
            case 'D':{
                setPrice(PRICE_DEFAULT+50);
            }
            case 'E':{
                setPrice(PRICE_DEFAULT+30);
            }
            case 'F':{
                setPrice(PRICE_DEFAULT+10);
            }
        }
        if (_weight>0 && _weight<19){setPrice(_price+30);}
        else if (_weight>20 && _weight<49){setPrice(_price+50);}
        else if (_weight>50 && _weight<79){setPrice(_price+80);}
        else if (_weight>80){setPrice(_price+100);}
    }


    //builders
    //by default
    public ElectricalAppliance() {
        setPrice(PRICE_DEFAULT);
        setColor(COLOR_DEFAULT);
        setEnergy(ENERGY_DEFAULT);
        setWeight(WEIGHT_DEFAULT);
    }
    //price and weight
    public ElectricalAppliance( double pPrice, double pWeight ){
        setPrice(pPrice);
        setColor(COLOR_DEFAULT);
        setEnergy(ENERGY_DEFAULT);
        setWeight(pWeight);

    }
    //normal
    public ElectricalAppliance( double pPrice, String pColor,char pEnergy, double pWeight){
        setPrice(pPrice);
        setColor(pColor);
        setEnergy(pEnergy);
        setWeight(pWeight);
    }

}


