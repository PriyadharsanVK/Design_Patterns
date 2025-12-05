public class MultithreadSingleton {
    private static MultithreadSingleton inst = null;
    private MultithreadSingleton(){

    }
    public static MultithreadSingleton getInst(){
        if(inst == null){
            synchronized (MultithreadSingleton.class){
                if(inst == null)
                    inst = new MultithreadSingleton();
            }
        }
        return inst;
    }
}
