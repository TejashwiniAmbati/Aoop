package aoopproject;

public class AggressiveInvestmentStrategy implements InvestmentStrategy {
    @Override
    public double calculateReturn(double investmentAmount) {
        // Aggressive strategy logic (e.g., high risk, high return)
        return investmentAmount * 1.10; // Example: 10% return
    }
}
