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
    public Television(double pPrice, String pColor, char pEnergy, double pWeight, int pInches, boolean pTdt){
        super(pPrice, pWeight, pColor, pEnergy);
        setInches(pInches);
        setTdt(pTdt);
    }


    @Override
    public void FinalPrice() {
        super.FinalPrice();
        if (_tdt){
            setPrice(getPrice()+50);
        }
        if (_inches>40){
            setPrice(getPrice()*1.3);
        }
    }
}
