package GestionElectrodomesticos;

public class Television extends ElectricalAppliance {
    private final static int INCHES_DEFAULT = 20;
    private final static boolean TDT_DEFAULT = false;
    public Television () {
        setInches(INCHES_DEFAULT);
        setTdt(TDT_DEFAULT);
    }
    public Television (double pPrice, double pWeight) {
        super(pPrice, pWeight);
        setInches(INCHES_DEFAULT);
        setTdt(TDT_DEFAULT);
    }
    public Television (double pPrice, String pColor,char pEnergy, double pWeight, int pInches, boolean pTdt) {
        super(pPrice,pColor,pEnergy,pWeight);
        setInches(pInches);
        setTdt(pTdt);
    }
    private int _inches;
    private void setInches (int pInches) {
        _inches = pInches;
    }
    public int getInches () {
        return _inches;
    }
    private boolean _tdt;
    private void setTdt (boolean pTdt) {
        _tdt = pTdt;
    }
    public boolean getTdt() {
        return _tdt;
    }
    @Override
    public void finalPrice() {
        super.finalPrice();
        if (getInches()>40) {

        }
    }
}
