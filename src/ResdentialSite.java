public class ResdentialSite extends Site {
    public ResdentialSite(double units, double rate) {
        super(units, rate);
    }

    public double getBillableAmount() {
        double base = getBaseAmount();
        double tax = getTaxAmount();
        return base + tax;
    }

    private double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }

    private double getBaseAmount() {
        return _units * _rate;
    }

}
