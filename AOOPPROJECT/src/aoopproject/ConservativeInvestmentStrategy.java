package aoopproject;

public class ConservativeInvestmentStrategy implements InvestmentStrategy {
    @Override
    public double calculateReturn(double investmentAmount) {
        // Conservative strategy logic (e.g., low risk, low return)
        return investmentAmount * 1.02; // Example: 2% return
    }
}

