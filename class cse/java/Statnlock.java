import java.util.Scanner;

class Test {
    static int i;
    int j;

    static {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter value for static variable i: ");
            i = sc.nextInt();
            System.out.println("Static block executed with i = " + i);
        } finally {
            sc.close();
        }
    }

    Test() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter value for non-static variable j: ");
            j = sc.nextInt();
            System.out.println("Constructor executed with j = " + j);
        } finally {
            sc.close();
        }
    }
    
    public static void main(String[] args) {
        Test obj1 = new Test();
        Test obj2 = new Test();
    }
}
