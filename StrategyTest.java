import static org.junit.Assert.*;
import org.junit.Test;

public class StrategyTest {

    @Test
    public void testConcreteStrategyA() {
        Strategy strategy = new ConcreteStrategyA();
        Context context = new Context(strategy);
        assertEquals("Exécution de la stratégie A", context.executeStrategy());
    }

    @Test
    public void testConcreteStrategyB() {
        Strategy strategy = new ConcreteStrategyB();
        Context context = new Context(strategy);
        assertEquals("Exécution de la stratégie B", context.executeStrategy());
    }

    @Test
    public void testStrategyChange() {
        Context context = new Context(new ConcreteStrategyA());
        assertEquals("Exécution de la stratégie A", context.executeStrategy());
        
        // Changement de la stratégie à exécuter
        context.setStrategy(new ConcreteStrategyB());
        assertEquals("Exécution de la stratégie B", context.executeStrategy());
    }
}
