public class DividendStock extends Stock{
    private double dividends;

    public DividendStock(String symbol) {
        super(symbol);
        this.dividends = 0.0;
    }

    // returns the total profit or loss earned on this stock
    public double getProfit(double currentPrice) {
        return super.getProfit(currentPrice) + dividends;
    }

    public void payDividend(double amountPerShare) {
        dividends += amountPerShare * getTotalShares();
    }
}
