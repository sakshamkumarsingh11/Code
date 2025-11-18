package logic;

class A extends Thread{
    public void run(){
        for(int i=0; i<10;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(i);
            } catch (InterruptedException e) {
                /* TODO Auto-generated catch block. we use it here to handle the exception*/
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0; i<10;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(i);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class threading {
    public static void main(String[] args) {
    A obj1 = new A();
    B obj2 = new B();
   
    obj1.start();
    System.out.println();
    obj2.start();
   
    }
}
