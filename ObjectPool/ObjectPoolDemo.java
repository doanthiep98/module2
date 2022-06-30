package ObjectPool;

public class ObjectPoolDemo {
    public static final int NUM_OF_CLIENT = 8;
    public static void main(String[] args) {
        TaxiPool taxiPool = new TaxiPool();
        Runnable client = new TaxiThread(taxiPool);
        Thread thread = new Thread(client);
        thread.start();
    }
}
