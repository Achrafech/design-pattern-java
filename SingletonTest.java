import static org.junit.Assert.*;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void testSingletonInstance() {
        // Récupération de l'instance Singleton
        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();

        // Vérification que les deux instances sont identiques
        assertSame("Les deux instances doivent être les mêmes", firstInstance, secondInstance);
    }
}
