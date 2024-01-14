
public class DataManager{
     
    private BlockingStrategyInterface blockingStrategy;

   //constructeur
    public DataManager(BlockingStrategyInterface initialStrategy) {
        this.blockingStrategy = initialStrategy;
    }

    public void setBlockingStrategy(BlockingStrategyInterface newStrategy) {
        this.blockingStrategy = newStrategy;
    }

    public void performBlocking(Data data) {
        // Appel de la méthode performBlocking de la stratégie actuelle
        blockingStrategy.performBlocking(data);
    }
}