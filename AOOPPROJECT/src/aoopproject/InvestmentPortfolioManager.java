package aoopproject;

public class InvestmentPortfolioManager {
    private InvestmentStrategy strategy;

    public InvestmentPortfolioManager(InvestmentStrategy strategy) {
        this.strategy = strategy;
    }

    public double applyStrategy(double investmentAmount) {
        return strategy.calculateReturn(investmentAmount);
    }

    public void setStrategy(InvestmentStrategy strategy) {
        this.strategy = strategy;
    }
}