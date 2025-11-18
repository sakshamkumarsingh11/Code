package exceptionhandling;

public class except1 {

    public static void main(String[] args) {
        int a = 14; int b=0;
        // int ans = a/b; // this will cause an exception
        int ans =0; // yah par ans ko declare kiya hai but isko koi value nhi di hai toh iska default value 0 hoga
        try{
            ans = a/b;

        }
        catch (ArithmeticException e){
            System.out.println("You cannot divide by zero");
        }
        catch (Exception e){            //aise hi or bhi exception aa sakte hai

            System.out.println("Some other exception occurred");
        }
        finally {
            System.out.println("The answer is: " + ans);        // yajha par ek error aya hai ans ka it is becoz ans is declared in the try block and voh useh access nhi kar pa rha hai toh isko ek bar globally declare krna hoga
        }
        
        
    }
    
}
