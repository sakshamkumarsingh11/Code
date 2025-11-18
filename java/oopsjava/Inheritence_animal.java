 class animal {
    public void display(){
        System.out.println("This is animal");       // super class
    }    
}
 class  dog extends animal{
    public void identify(){
        System.out.println("This animal barks");         //child class
    }
}
    
public class Inheritence_animal{
    public static void main(String[] args) {
        dog animal = new dog();
        animal.display();
        animal.identify();   
    }
    
}
