public class EagerSingleton {
    public static final EagerSingleton inst = new EagerSingleton();
    private EagerSingleton(){
    }
    public static EagerSingleton getInst(){
        return inst;
    }
}