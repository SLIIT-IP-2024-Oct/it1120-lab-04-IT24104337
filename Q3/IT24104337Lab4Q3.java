import java.util.Scanner;
public class IT24104337Lab4Q3 {
	public static void main(String[] args) {
		System.out.println("Enter a numbber:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println(number < 0 ? "The number is Negative": number > 0 ? "The number is Positive": "The number is Zero");
		input.close();
	}
}