// Abstract class (cannot be instantiated)
abstract class Animal {
    // Abstract method (no implementation)
    abstract void makeSound();
}

// Subclass (must provide an implementation for makeSound)
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Subclass (must provide an implementation for makeSound)
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

public class abst_ract {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Output: Woof! Woof!

        Animal myCat = new Cat();
        myCat.makeSound(); // Output: Meow! Meow!
        //Animal myAnimal=newAnimal(); error becoz abstract class cannot be instatiated 
    }
}
