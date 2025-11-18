// learning encapsulation  by an example '



public class encapsulation{
        private void display(){
            System.out.println("The name is saksham kumar singh");
        }
        public void hello(){
            System.out.println("He says you hello");
        }
        public static void main(String[] args) {
            encapsulation object= new encapsulation();
            object.hello();
            object.display();
        }
}

// Real-Life Example in Java:
// Imagine you have a Person who has a secret name. You can’t directly see or change the name, but the Person gives you a way to ask or set it.

// u encapsulated sab kuch in a class called encapsulation usme u made a method private.
// method ya variable private kiye jate hai taki unhe koi change na kr sake
//voh display honge but chalenge nhi.