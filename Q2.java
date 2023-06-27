// Java program to convert Inch into Meter
import java.util.*;
class Q2{
    public static void main(String[]args) {
        double meter,x;
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Input the value for inch: ");
            x=in.nextDouble();
            meter=x*0.0254;
            System.out.print(x+" inch is "+meter+" meters");
        }
    }
}