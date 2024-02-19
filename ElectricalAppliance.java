package Challenge2.Gestion_Electrodomesticos;

public class ElectricalAppliance {
    private final static String[] COLORS = {"white", "black","red", "blue", "grey"};
    private final static char[] LETTERS = {'A', 'B', 'C',  'D', 'E', 'F'};

    private final static double PRICE_DEFAULT = 100; // in €
    private final static String COLOR_DEFAULT = "blanco";
    private final static char ENERGY_DEFAULT = 'F';
    private final static double WEIGHT_DEFAULT = 5; // in kg

    private double _price;
    protected void setPrice (double pPrice) {
        _price = pPrice;
    }
    public double getPrice() {
        return _price;
    }

    private String _color;
    private void setColor (String pColor) {
        _color = pColor;
    }
    public String getColor() {
        return _color;
    }

    private char _energy;
    private void setEnergy (char pEnergy) {
        _energy = pEnergy;
    }
    public char getEnergy() {
        return _energy;
    }

    private double _weight;
    private void setWeight (double pWeight) {
        _weight = pWeight;
    }
    public double getWeight() {
        return _weight;
    }

    // builders
    // by default
    public ElectricalAppliance(){
        setPrice(PRICE_DEFAULT);
        setColor(COLOR_DEFAULT);
        setEnergy(ENERGY_DEFAULT);
        setWeight(WEIGHT_DEFAULT);
    }
    // price + weight only
    public ElectricalAppliance(double pPrice, double pWeight ){
        setPrice(pPrice);
        setColor(COLOR_DEFAULT);
        setEnergy(ENERGY_DEFAULT);
        setWeight(pWeight);
    }
    // normal
    public ElectricalAppliance(double pPrice, double pWeight, String pColor, char pEnergy){
        setPrice(pPrice);
        setColor(pColor);
        setEnergy(pEnergy);
        setWeight(pWeight);
    }

    public char CheckEnergyConsumption(char letter){

        boolean bLetterFound = false;
        for (int iCount = 0; iCount<LETTERS.length && !bLetterFound; iCount++){
            bLetterFound = letter == LETTERS[iCount];
            if (iCount==LETTERS.length-1){
                letter = ENERGY_DEFAULT;
            }
        }
        return letter;
    }
    public String CheckColor(String color){

        boolean bColorFound = false;
        for (int iCount = 0; iCount<COLORS.length && !bColorFound; iCount++){
            bColorFound = color.equals(COLORS[iCount]);
            if (iCount==COLORS.length-1){
                color = COLOR_DEFAULT;
            }
        }
        return color;
    }

    public void FinalPrice(){
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

        if (getWeight()>0 && getWeight()<19){setPrice(getPrice()+30);}
        else if (getWeight()>20 && getWeight()<49){setPrice(getPrice()+50);}
        else if (getWeight()>50 && getWeight()<79){setPrice(getPrice()+80);}
        else if (getWeight()>80){setPrice(getPrice()+100);}
    }
}