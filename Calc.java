import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		/*
		System.out.println("Please input first number:");
		System.out.println("Your input " + i1 + " as a first number.");
		*/
		int i1 = scanner.nextInt();
		String operator = scanner.next();
		/*
		System.out.println("Please input second number:");
		System.out.println("Your input " + i2 + " as a second number.");
		*/
		int i2 = scanner.nextInt();

		int sum = i1 + i2;
		int diff = i1 - i2;
		int mult = i1 * i2;
		int div = i1 / i2;

		if (operator.equals("+")) {
			System.out.println("Sum is " + sum);
		} else if (operator.equals("-")) {
			System.out.println("Difference is " + diff);
		} else if (operator.equals("*")) {
			System.out.println("Multiplication is " + mult);
		} else if (operator.equals("/")) {
			System.out.println("Division is " + div);
		}

	}
}
