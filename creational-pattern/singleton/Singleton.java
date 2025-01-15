package singleton;

public class Singleton {
    // single static access point
    //volatile used for thread safety
    private static volatile Singleton singleton = null;

    //constructor is private so nobody can access it
    private Singleton (){
    }

    //simple Lazy initialization can cause multiple threads to create separate objects
    //use double checking method
    public static Singleton getSingletonInstance(){
        if (null==singleton){
            synchronized (Singleton.class){
                // check again as multiple threads can reach above steps simultaneously
                if (null==singleton){
                    System.out.println("New Instance Created!!");
                    singleton = new Singleton();

                }
            }

        }
        return singleton;
    }


}
