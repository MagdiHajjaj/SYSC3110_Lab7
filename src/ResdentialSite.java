public class ResdentialSite extends Site {
    public ResdentialSite(double units, double rate) {
        super(units, rate);
    }

    public double getBillableAmount() {
        double base = getBaseAmount();
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }

    private double getBaseAmount() {
        double base = _units * _rate;
        return base;
    }

}
