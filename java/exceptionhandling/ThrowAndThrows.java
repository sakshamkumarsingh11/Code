package exceptionhandling;

public class ThrowAndThrows {
    int age;
    static void validateage(int age) throws ArithmeticException {       //this throws means ki there might be an exception present here
        if (age < 18) {
            throw new ArithmeticException("Not eligible for voting");    // this throw means ki yaha exception hai 

        } else {
            System.out.println("Eligible for voting");
        }
    }
    public static void main(String[] args) {
       try{
        validateage(16);
       }
       catch(Exception e){
        System.out.println("Exception occurred: " + e);
       }
    }
}
