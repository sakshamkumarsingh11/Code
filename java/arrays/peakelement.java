// // problem - take array and find the peak element in it. which is greater than its neighbours.

// import java.util.*;
// public class peakelement{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt(); // input
//         }
//         //checks for the peak element
//         for(int i=0; i<n;i++){
//             if(arr[i]> arr[i-1] && arr[i]>arr[i-1]){
//                 System.out.println(i); // index of peak element

//             }
//             else if(i==0 && arr[i]>arr[i-1]){
//                 System.out.println(i);

//             }
//             else if(i==n-1 && arr[i]>arr[i-1]){
//                 System.out.println(i);
//             }
//             }
//         }
//     }
