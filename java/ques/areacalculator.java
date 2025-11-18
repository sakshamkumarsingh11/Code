import java.util.Scanner;

class AreaCalculator {
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    double calculateArea(double length, double width) {         //area
        return length * width;
    }
    double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator area = new AreaCalculator();         //circle
        System.out.print("Enter r of  circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area: " + area.calculateArea(radius));
       
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();                        //rrectang;e
        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();
        System.out.println("Area : " + area.calculateArea(length, width));

        
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of  triangle: ");            //triangle
        double height = sc.nextDouble();
        System.out.println("Area : " + area.calculateArea(base, height, true));

        sc.close(); 
}
}