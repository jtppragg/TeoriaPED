
public class Singleton {
    private static Singleton instance;
    
    private Singleton() {
    }
    
    public static synchronized Singleton getInstance() {
        if( instance == null )
            instance = new Singleton();
        return instance;
    }
    
    public void whoami() {
        System.out.println(instance);
    }
}
