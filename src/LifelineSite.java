public class LifelineSite extends Site {
    public LifelineSite(double units, double rate) {
        super(units, rate);
    }

    public double getBillableAmount() {
        double base = getBaseAmount();
        double tax = getTaxAmount();
        return base + tax;
    }

    private double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE * 0.2;
    }

    private double getBaseAmount() {
        return _units * _rate * 0.5;
    }
}
