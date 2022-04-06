package Adapter;

public class AmericanToEuropeanPlugAdapter implements EuropeanPlug {
    private AmericanPlug americanPlug;

    public AmericanToEuropeanPlugAdapter(AmericanPlug americanPlug){
        this.americanPlug = americanPlug;
    }

    @Override
    public void giveElectricity() {
        americanPlug.giveElectricity();
    }
}
