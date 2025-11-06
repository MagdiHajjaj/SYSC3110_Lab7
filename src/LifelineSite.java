public class LifelineSite extends Site {
    public LifelineSite(double units, double rate) {
        super(units, rate);
    }

    public double getBillableAmount() {
        double base = getBaseAmount();
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }

    private double getBaseAmount() {
        double base = _units * _rate * 0.5;
        return base;
    }
}
