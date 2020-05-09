import java.util.Scanner;

public class CharForDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//get radix (base of a number)
		System.out.println("Please enter a radix:");
		int radix = scanner.nextInt();
		
		System.out.printf("Please choose one: %n1 --- %s%n2 --- %s%n", 
				"Convert digit to char", "Convert char to digit");
		int choice = scanner.nextInt();
		
		switch(choice) {
		 case 1:
			 System.out.println("Enter a digit");
			 int digit = scanner.nextInt();
			 System.out.printf("Convert digit to char: %s%n", 
					 Character.forDigit(digit,radix));
			 break;
		 case 2: //convert char to digit
			 System.out.println("Enter a char");
			 char character = scanner.next().charAt(0);
			 System.out.printf("Convert digit to char: %s%n", 
					 Character.digit(character,radix));
			 break;
		}

	}

}
