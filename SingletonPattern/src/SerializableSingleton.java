import java.io.Serializable;

public class SerializableSingleton implements Serializable {
    private static SerializableSingleton inst = null;
    private SerializableSingleton(){

    }
    public static SerializableSingleton getInst(){
        if(inst == null)
            inst = new SerializableSingleton();
        return inst;
    }
    protected Object readResolve(){
        return inst;
    }
}
