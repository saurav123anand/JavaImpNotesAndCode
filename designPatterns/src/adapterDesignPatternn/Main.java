package adapterDesignPatternn;

public class Main {
    public static void main(String[] args) {
//        AppleCharger appleCharger=new ChargerXYZ();
//        Iphone13 iphone13=new Iphone13(appleCharger);
//        iphone13.chargeIphone();
        // now assume apple charger is not there and we have to charge Iphone with the help of Android charger

        AppleCharger appleCharger=new AdapterCharger(new ChargerDK());
        Iphone13 iphone13=new Iphone13(appleCharger);
        iphone13.chargeIphone();
    }
}
