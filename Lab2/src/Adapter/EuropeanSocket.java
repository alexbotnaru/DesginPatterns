package Adapter;

public class EuropeanSocket {
    public void plugIn(EuropeanPlug plug){
        plug.giveElectricity();
        System.out.println("European socket");
    }
}
