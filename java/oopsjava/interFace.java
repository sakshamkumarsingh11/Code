package oopsjava;// Create an interface called Vehicle with two methods:

// start(): A method to start the vehicle.
// stop(): A method to stop the vehicle.
// Then, create two classes, Car and Bike, that implement the Vehicle interface and provide their own implementations for start() and stop().

// Finally, create a Main class to test both Car and Bike.




interface Vehicle{
     void start();
     void stop();
     
     int a=10; // by default static and final 

}
 class car implements Vehicle{
    public void start(){
        System.out.println("Car is starting");

    }
    public void stop(){
        System.out.println("Car is stopping");
    }

 }
 // Bike class implements Vehicle interface
class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting with a self-start button.");
    }

    public void stop() {
        System.out.println("Bike is stopping with hand brakes.");
    }
}
public class interFace {
    public static void main(String[] args) {
        Vehicle myCar = new car();  // object bana hai refrence leke vehicle ka
        myCar.start();  // Calls Car's start method
        myCar.stop();   // Calls Car's stop method
        
        System.out.println(); // Just to separate outputs

        Vehicle myBike = new Bike();  // Creating a Bike object
        myBike.start();  // Calls Bike's start method
        myBike.stop();   // Calls Bike's stop method
    }
}
