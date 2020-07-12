public class Singleton {
    public String str;
    private static final Singleton obj = new Singleton();

    private Singleton(){}
    
    static Singleton getInstance(){
        return obj;
    }
