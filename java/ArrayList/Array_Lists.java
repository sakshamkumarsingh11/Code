package ArrayList;          // no error found which was there earlier.

import java.util.ArrayList;
// import java.util.Scanner;
public class Array_Lists {
    public static void main(String[] args) {
        ArrayList<Integer> example = new ArrayList<Integer>();
        example.add(10);        // adding the elements in the array list bv using add() method
        example.add(20);
        example.add(30);
        example.add(40);
        example.add(50); 
        System.out.println(example); // printing the array list

        //add in between
        example.add(2,15); // adding the element at index 2
        System.out.println(example);

        //set element
        example.set(3, 35);
        System.out.println(example); 

        //remove element
        example.remove(4);
        System.out.println(example);
        //size
        System.out.println(example.size());

        //loop
        for(int i =0; i<example.size(); i++){
            System.out.println(example.get(i));
        }
    }
}   
