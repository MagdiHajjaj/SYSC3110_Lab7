public class ResdentialSite extends Site {
    public ResdentialSite(double units, double rate) {
        super(units, rate);
    }

    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }

    private double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }

    private double getBaseAmount() {
        return _units * _rate;
    }

}
