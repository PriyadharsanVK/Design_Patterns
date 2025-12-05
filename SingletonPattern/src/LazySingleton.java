import java.io.Serializable;

public class LazySingleton implements Serializable {
    public static LazySingleton inst = null;

    private LazySingleton(){

    }

    public static LazySingleton getInst(){
        if(inst == null)
            inst = new LazySingleton();
        return inst;
    }
}