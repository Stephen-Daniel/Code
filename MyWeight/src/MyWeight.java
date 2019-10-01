import java.text.DecimalFormat;
import java.util.Scanner;

public class MyWeight {

	public static void main(String[] args) {
		// scanner is to take in a user type
		Scanner kilos = new Scanner(System.in);
		
		System.out.println("What is your weight in kilos : ");
		// nextline is to read and take the string
		String kg = kilos.nextLine();
		// convert the string to a double
		Double kilo = Double.parseDouble(kg);
		Double lbsfull = kilo*2.2;
		//decimal place of 2
		DecimalFormat df = new DecimalFormat("#.00");
		String lbs = df.format(lbsfull);
		System.out.printf("Your weight in lbs is " + lbs);
		System.out.println("");
		System.exit(0);
		
		
	}

}
