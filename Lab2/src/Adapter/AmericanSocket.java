package Adapter;

public class AmericanSocket {
    public void plugIn(AmericanPlug plug){
        plug.giveElectricity();
        System.out.println("American socket");
    }
}
