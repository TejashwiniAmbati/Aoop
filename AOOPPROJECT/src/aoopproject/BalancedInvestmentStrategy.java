package aoopproject;

public class BalancedInvestmentStrategy implements InvestmentStrategy {
    @Override
    public double calculateReturn(double investmentAmount) {
        // Balanced strategy logic (e.g., moderate risk, moderate return)
        return investmentAmount * 1.05; // Example: 5% return
    }
}
