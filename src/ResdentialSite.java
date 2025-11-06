public class ResdentialSite extends Site {
    public ResdentialSite(double units, double rate) {
        super(units, rate);
    }


    @Override
    protected double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }

    @Override
    protected double getBaseAmount() {
        return _units * _rate;
    }

}
