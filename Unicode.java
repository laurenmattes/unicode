import java.util.Scanner;

public class Unicode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String string1;
		int counter = 0;
		String string2;
		int counter2 = 0;
		int result;

		System.out.println("Welcome to Unicode Calculator!");
		System.out.println("Please enter a word: ");
		string1 = scan.next();

		System.out.println("Please enter another word: ");
		string2 = scan.next();

		for (int i = 0; i < string1.length(); i++) {
			System.out.print(string1.charAt(i) + ":");
			System.out.println((int) string1.charAt(i));
			counter = counter + string1.charAt(i);
		}

		for (int i = 0; i < string2.length(); i++) {
			System.out.print(string2.charAt(i) + ":");
			System.out.println((int) string2.charAt(i));
			counter2 = counter2 + string2.charAt(i);
		}
		result = Math.abs(counter - counter2);
		System.out.println("Difference(as absolute value): " + result);
	}
}
