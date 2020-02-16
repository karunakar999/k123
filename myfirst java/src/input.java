import java.util.Scanner;

class input {

	public static void main (String args[]) {
		
		Scanner myinput = new Scanner(System.in);
		
		double x;
		double y;
		double z;
		
		System.out.println("enter your first number: ");
		x = myinput.nextDouble();
		
		System.out.println("enter your second number: ");
		y = myinput.nextDouble();
		
		z = x * y; 
				
	    System.out.println("result is: " +z);
				
		
	}
}
