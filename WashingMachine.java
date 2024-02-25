package Challenge2.Gestion_Electrodomesticos;

public class WashingMachine extends ElectricalAppliance {

    private final static int LOAD_DEFAULT = 5; // in kg

    private int _load;
    private void setLoad(int pLoad){_load = pLoad;}
    public int getLoad(){return _load;}



    // default
    public WashingMachine() {
        setLoad(LOAD_DEFAULT);
    }

    // price + weight only
    public WashingMachine(double pPrice, double pWeight){
        super(pPrice, pWeight);
        setLoad(LOAD_DEFAULT);
    }
    // normal
    public WashingMachine(double pPrice, double pWeight, String pColor, char pEnergy, int pLoad){
        super(pPrice, pWeight, pColor, pEnergy);
        setLoad(pLoad);
    }


    @Override
    public double FinalPrice(double pPrice) {
        pPrice = super.FinalPrice(pPrice);
        if (getLoad()>30){
            pPrice += 50;
        }

        return pPrice;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s", "Washing Machine: " +
                        "Price:", getPrice(),
                ", Weight: " + getWeight() +
                        ", Color: " + getColor() +
                        ", Energy Letter: " + getEnergy() +
                        " and Load: " + getLoad());
    }
}
