// tough hai to understand but dekh hume yeh krna hai isme
// Given the series, write a program which uses a recursive function to find approximate value of e^x by taking first 20 terms of the series. ‘x’ has to be taken as input from the user.
// e^x = 1 + x + x^2/2! + x^3/3! + x^4/4! + ................


import java.util.*;
public class Expo{
    int n;
    double x;
    public  Expo(double x, int n ){         // constructor
        this.x=x;   
        this.n=n;
    }

    public static double fact ( int n ){        //factorial function
        if(n==0||n==1){             //base case 
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public  double  expression(double x, int n){              //expression function
        if (n==1){
            return 1;
        }
        else{
            return  ((Math.pow(x,n)/ fact (n))+  expression(x, n-1));       //expression
        }
            
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");         // x ka input liya 
        double x = sc.nextDouble();
        int term = 20;                      //yeh given tha
      
        Expo obj= new Expo(x, term);            // object of the class
        System.out.println("The demanded answer is "+   obj.expression(x, term)); //output
        sc.close();
    }
}
