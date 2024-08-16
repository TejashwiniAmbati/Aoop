package aoopproject;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class InvestmentPortfolioManagerTest {

    private InvestmentPortfolioManager portfolioManager;

    @Before
    public void setUp() {
        // Initial setup with a default strategy
        portfolioManager = new InvestmentPortfolioManager(new ConservativeInvestmentStrategy());
    }

    @Test
    public void testConservativeStrategy() {
        portfolioManager.setStrategy(new ConservativeInvestmentStrategy());
        double returns = portfolioManager.applyStrategy(1000.0);
        assertEquals(1020.0, returns, 0.01);
    }

    @Test
    public void testBalancedStrategy() {
        portfolioManager.setStrategy(new BalancedInvestmentStrategy());
        double returns = portfolioManager.applyStrategy(1000.0);
        assertEquals(1050.0, returns, 0.01);
    }

    @Test
    public void testAggressiveStrategy() {
        portfolioManager.setStrategy(new AggressiveInvestmentStrategy());
        double returns = portfolioManager.applyStrategy(1000.0);
        assertEquals(1100.0, returns, 0.01);
    }
}
