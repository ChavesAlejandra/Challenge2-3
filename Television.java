package Challenge2.Gestion_Electrodomesticos;

public class Television extends ElectricalAppliance {
    private final static int INCHES_DEFAULT = 20; // in inches
    private final static boolean TDT_DEFAULT = false; // in inches

    private int _inches;
    private void setInches(int pInches){_inches = pInches;}
    public int getInches(){return _inches;}

    private boolean _tdt;
    private void setTdt(boolean pTdt){_tdt = pTdt;}
    public boolean getTdt(){return _tdt;}



    // builders
    // by default
    public Television(){}
    // price + weight only
    public Television(double pPrice, double pWeight){
        super(pPrice, pWeight);
        setInches(INCHES_DEFAULT);
        setTdt(TDT_DEFAULT);
    }
    // normal
    public Television(double pPrice, double pWeight, String pColor, char pEnergy, int pInches, boolean pTdt){
        super(pPrice, pWeight, pColor, pEnergy);
        setInches(pInches);
        setTdt(pTdt);
    }


    @Override
    public double FinalPrice(double pPrice) {
        pPrice = super.FinalPrice(pPrice);
        if (getInches()>40){
            pPrice *= 1.3;
        }
        if (getTdt()){
            pPrice += 50;
        }
        return pPrice;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s", "Challenge2.Gestion_Electrodomesticos.Television: " +
                        "Price:", getPrice(),
                ", Weight: " + getWeight() +
                        ", Color: " + getColor() +
                        ", Energy Letter: " + getEnergy() +
                        ", Inches: " + getInches() +
                        " and TDT: " + getTdt());
    }
}
