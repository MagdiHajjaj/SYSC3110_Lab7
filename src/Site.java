public abstract class Site {
    protected double _units;
    protected double _rate;
    public static final double TAX_RATE = 0.13;

    public Site(double units, double rate) {
        _units = units;
        _rate = rate;
    }

    public double getBillableAmount(){
        return getTaxAmount() * getBaseAmount();
    };

    protected abstract double getTaxAmount();

    protected abstract double getBaseAmount();
}
