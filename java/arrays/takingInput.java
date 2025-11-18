import java.util.Scanner;
public class takingInput {
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        //int arr[]= {1,2,3,4,5}; this is a normal way to take direct input
        //but we can also take input from the user
        int arr[] = new int[5];
        System.out.println("Enter the elements of array one by one");
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();

        }sc.close();
        System.out.println("The array is"+ arr);
        
    }
    
}
