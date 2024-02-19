package Challenge2.Gestion_Electrodomesticos;

public class WashingMachine extends ElectricalAppliance{

    private final static int LOAD_DEFAULT = 5; // in kg

    private int _load;
    private void setLoad(int pLoad){_load = pLoad;}
    public int getLoad(){return _load;}

    // default
    public WashingMachine() { // super();?
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
    public void FinalPrice() {
        super.FinalPrice();
        if (getLoad()>30){
            setPrice(getPrice()+50);
        }
    }
}
