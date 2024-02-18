package GestionElectrodomesticos;

public class WashingMachine extends ElectricalAppliance{

    private final static int LOAD_DEFAULT=5;
    public WashingMachine () {
        setLoad(LOAD_DEFAULT);
    }
    public WashingMachine (double pPrice, double pWeight) {
        super(pPrice, pWeight);
        setLoad(LOAD_DEFAULT);
    }
    public WashingMachine (double pPrice, String pColor,char pEnergy, double pWeight, int pLoad) {
        super(pPrice,pColor,pEnergy,pWeight);
        setLoad(pLoad);
    }
    private int _load;
    public int getLoad () {
        return _load;
    }
    private void setLoad (int pLoad) {
        _load = pLoad;
    }

    @Override
    public void finalPrice() {
        super.finalPrice();
        if (getLoad()>30) {
        }
    }
}
