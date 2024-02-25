package Challenge2.Gestion_Electrodomesticos;

public class ElectricalAppliance implements IPrice {
    protected final static String[] COLORS = {"white", "black","red", "blue", "grey"};
    protected final static char[] LETTERS = {'A', 'B', 'C',  'D', 'E', 'F'};

    private final static double PRICE_DEFAULT = 100; // in €
    private final static String COLOR_DEFAULT = "white";
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
        setWeight(pWeight);
        setColor(CheckColor(pColor));
        setEnergy(CheckEnergyConsumption(pEnergy));
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

    public double FinalPrice(double pPrice){
        switch (getEnergy()){
            case 'A':{
                pPrice += 100;
                break;
            }
            case 'B':{
                pPrice += 80;
                break;
            }
            case 'C':{
                pPrice += 60;
                break;
            }
            case 'D':{
                pPrice += 50;
                break;
            }
            case 'E':{
                pPrice += 30;
                break;
            }
            case 'F':{
                pPrice += 10;
                break;
            }
        }

        if (getWeight()>0 && getWeight()<19){pPrice += 30;}
        else if (getWeight()>20 && getWeight()<49){pPrice += 50;}
        else if (getWeight()>50 && getWeight()<79){pPrice += 80;}
        else if (getWeight()>80){pPrice += 100;}
        return pPrice;
    }

    @Override
    public String toString() {
        return "Electrical Appliance: " +
                "Price: " + getPrice() +
                ", Weight: " + getWeight() +
                ", Color: " + getColor() +
                " and Energy Letter: " + getEnergy();
    }
}