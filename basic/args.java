
import java.util.*;

public class args {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

	 	System.out.println(" 1st argument: "+args[0]);
		
		System.out.println("Enter 1st value");
		int a = in.nextInt();

		System.out.println("Enter 2nd value");
		int b = in.nextInt();

		int sum = a + b;
		System.out.println("Sum of 2 values "+sum);

		System.out.println("Enter String value");
		String val = in.next();

		System.out.println("String val is "+val);

	}
}