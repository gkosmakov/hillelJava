import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		int second = scanner.nextInt();

		int sum = first + second;
		int diff = first - second;
		int mult = first * second;
		int div = first / second;

		System.out.println("Please input first number:");
		System.out.println("Your input " + first + " as a first number.");
		System.out.println("Please input second number:");
		System.out.println("Your input " + second + " as a second number.");
		
		System.out.println("Sum is " + sum);
		System.out.println("Difference is " + diff);
		System.out.println("Multiplication is " + mult);
		System.out.println("Division is " + div);

	}
}
