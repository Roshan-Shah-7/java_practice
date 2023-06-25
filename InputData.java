import java.util.*;//import is use to import pre-define keywords(header files)
class InputData{
public static void main(String[]args){

	try (Scanner input = new Scanner(System.in)) {
		System.out.print("Enter a number: ");
		int x=input.nextInt();

		System.out.print("Enter a Floating number: ");
		float y=input.nextFloat();
		

		System.out.println("Value of x = "+x);

		System.out.println("Value of y = "+y);
	}

	
}
}
