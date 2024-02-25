package Challenge2.Gestion_Electrodomesticos;

public class Main {
    public static void main(String[] args) {
        ElectricalAppliance[] mainElectricalApplianceArray = new ElectricalAppliance[10];


        mainElectricalApplianceArray[0] = new ElectricalAppliance(); // by default
        mainElectricalApplianceArray[1] = new ElectricalAppliance(274.95, 3); // price + weight only
        mainElectricalApplianceArray[2] = new ElectricalAppliance(666.66, 8, "black", 'E'); // normal
        mainElectricalApplianceArray[3] = new ElectricalAppliance(999.99, 15, "grey", 'A'); // normal
        mainElectricalApplianceArray[4] = new WashingMachine(); // by default
        mainElectricalApplianceArray[5] = new WashingMachine(589.95, 69); // price + weight only
        mainElectricalApplianceArray[6] = new WashingMachine(1899.99, 120, "grey", 'A', 50); // normal
        mainElectricalApplianceArray[7] = new Television(); // by default
        mainElectricalApplianceArray[8] = new Television(599.99, 6); // price + weight only
        mainElectricalApplianceArray[9] = new Television(2499.99, 11, "black", 'C', 65, true); // normal

        double iTotalPriceEA = 0;
        double iTotalPriceWM = 0;
        double iTotalPriceT = 0;
        for (int iCount = 0; iCount<10; iCount++) {
            if (mainElectricalApplianceArray[iCount].getClass().equals(ElectricalAppliance.class)) {
                iTotalPriceEA += mainElectricalApplianceArray[iCount].FinalPrice(mainElectricalApplianceArray[iCount].getPrice());
            } else if (mainElectricalApplianceArray[iCount].getClass().equals(WashingMachine.class)) {
                iTotalPriceWM += mainElectricalApplianceArray[iCount].FinalPrice(mainElectricalApplianceArray[iCount].getPrice());
            } else if (mainElectricalApplianceArray[iCount].getClass().equals(Television.class)) {
                iTotalPriceT += mainElectricalApplianceArray[iCount].FinalPrice(mainElectricalApplianceArray[iCount].getPrice());
            }
        }
        System.out.println("The Total Price of Challenge2.Gestion_Electrodomesticos.ElectricalAppliance: " + iTotalPriceEA);
        System.out.println("The Total Price of Challenge2.Gestion_Electrodomesticos.WashingMachine: " + iTotalPriceWM);
        System.out.println("The Total Price of Challenge2.Gestion_Electrodomesticos.Television: " + iTotalPriceT);

    }
}
