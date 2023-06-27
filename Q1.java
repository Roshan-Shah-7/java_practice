// Java program to convert Fahrenheit into Celsius
import java.util.*;
class Q1{
    public static void main(String[]args) {
        double celsius,x;
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a degree in Fahrenheit: ");
            x=in.nextDouble();
            celsius=(5.0/9)*(x-32);
            System.out.print(x+ " degree Fahrenheit is equal to " +celsius+ " in Celsius");
        }
        
    }
}