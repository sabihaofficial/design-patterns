package singleton;

public class SingletonMain {
    public static void main(String[] args) {
        // not allowed as constructor is private
        //Singleton s = new Singleton();

        Singleton s1 = Singleton.getSingletonInstance();
        Singleton s2 = Singleton.getSingletonInstance();
        boolean isSame = s1 == s2;
        System.out.println("is same instance : " + isSame);
    }
}
