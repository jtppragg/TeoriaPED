
public class Application {
    public static void main( String[] args ) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        
        s1.whoami();
        s2.whoami();
    }
}
