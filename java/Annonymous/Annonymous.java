package Annonymous;

//public class Annonymous {
//    public void method(){
//        System.out.println("The main class is running!!");
//
//    }
//
//    public static void main(String[] args) {
//        Annonymous obj = new Annonymous();
//        obj.method();
//    }
//}
// ab yeh usual method hai now what if hume one time use wala chaiye ki class use karo and ktm
// toh we use annonymous class
public class Annonymous {
    public void method(){
        System.out.println("The main class is running!!");

    }

    public static void main(String[] args) {
        Annonymous obj = new Annonymous(){
            public void method() {
                System.out.println(" this is the annonymous class");
            }
        };
        obj.method();
    }
}