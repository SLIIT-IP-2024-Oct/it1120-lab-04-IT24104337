import java.util.Scanner;
public class IT24104337Lab4Q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number =  input.nextInt();
		if (number<0) {
			System.out.println("The number is Negative");
		}else if (number>0) {
			System.out.println("The number is Positive");
		}else {
			System.out.println("The number is Zero");
		}
		input.close();
	}
}