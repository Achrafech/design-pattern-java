public class Context {
    private Strategy strategy;

    // Constructeur
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // Méthode pour exécuter la stratégie actuelle
    public String executeStrategy() {
        return strategy.execute();
    }

    // Setter pour changer la stratégie
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
