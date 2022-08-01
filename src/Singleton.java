
class Singleton {

    private static Singleton singletonInstance = null;

    public String string;

    private Singleton(){
        string = "Hello I am Singleton";
    }

    public static Singleton getInstance(){
        if (singletonInstance == null){
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }
}
