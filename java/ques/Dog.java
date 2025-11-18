import java.util.*;
public class Dog {
    int size;
    String barkSound;
    public Dog(int size) {                  //cpnstructor
        this.size = size;
    }

    public void bark(int no_of_times_bark) {
        if(size>0){
        if (size > 60) {
            barkSound = "Woof woof!";
        } else if (size > 30) {
            barkSound = "Bhow Bhow";            //sound
        } else {
            barkSound = "kih kih kih";
        }
    }else{
        System.out.println("Invalid size");
    }

        for (int i = 0; i<no_of_times_bark; i++) {          //times of sound
            System.out.println(barkSound);
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the dog: ");
        int size = sc.nextInt();
        Dog dog = new Dog(size);
        System.out.println("Enter the number of times the dog barks: ");
        int no_of_times_bark = sc.nextInt();
        dog.bark(no_of_times_bark);
        sc.close();
    }
}
