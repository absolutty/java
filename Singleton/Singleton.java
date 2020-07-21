public class Singleton {
    private static final Singleton obj = new Singleton();

    private Singleton(){}
    
    static Singleton getInstance(){
        return obj;
    }
