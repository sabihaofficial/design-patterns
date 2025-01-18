package factory;

public class Auto extends Vehicle{
    int wheels;
    
    Auto(int wheels){
        this.wheels = wheels;
    }
    public void drive(){
        System.out.println("I drive with " + wheels +" wheels");
    }
    
}
