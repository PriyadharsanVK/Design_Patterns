import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //exampleSerialization();
        exampleReflection();
    }

    private static void exampleSerialization() throws IOException, ClassNotFoundException{
        //Lazy Singleton
        LazySingleton lazySingleton = LazySingleton.getInst();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Object.obj"));
        objectOutputStream.writeObject(lazySingleton);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Object.obj"));
        LazySingleton deserializedLazy = (LazySingleton) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("Object 1 : "+lazySingleton.hashCode());
        System.out.println("Object 2 : "+deserializedLazy.hashCode());

        //Serialized Singleton
        SerializableSingleton serializableSingleton = SerializableSingleton.getInst();
        ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(new FileOutputStream("Object1.obj"));
        objectOutputStream1.writeObject(serializableSingleton);
        objectOutputStream1.close();

        ObjectInputStream objectInputStream1 = new ObjectInputStream(new FileInputStream("Object1.obj"));
        SerializableSingleton deserializedInstance = (SerializableSingleton) objectInputStream1.readObject();
        objectInputStream.close();

        System.out.println("Serializable Object 1 : "+serializableSingleton.hashCode());
        System.out.println("Serializable Object 2 : "+deserializedInstance.hashCode());
    }

    private static void exampleReflection() throws InvocationTargetException, InstantiationException, IllegalAccessException{
        Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);
        LazySingleton lazySingleton = (LazySingleton) constructor.newInstance();
        LazySingleton instance = LazySingleton.getInst();

        System.out.println("Reflected Singleton Hashcode : "+lazySingleton.hashCode());
        System.out.println("Singleton Instance Hashcode : "+instance.hashCode());

        //This is a Seperate Solution which always follows Singleton if Implemented
        EnumSingleton.INSTANCE.doSomething();
    }
}
