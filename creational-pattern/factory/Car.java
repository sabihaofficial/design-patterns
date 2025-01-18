package factory;

public class Car extends Vehicle{
     int wheels;
     Car(int wheels){
         this.wheels = wheels;
     }

    public void drive(){
        System.out.println("I drive with" +  wheels + "wheels");
    }
    

}
