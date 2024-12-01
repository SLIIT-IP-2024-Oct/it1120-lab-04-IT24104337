import java.util.Scanner;
public class IT24104337Lab4Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Pleace enter exam marks (out of 100):");
		double exam = input.nextDouble();
		if (exam <0 || exam >100 ) {
			System.out.println("Invalid input for exam marks. Terminating program");
			return;
		}
		System.out.println("Pleace enter lab submission marks (out of 100):");
		double lab = input.nextDouble();
		if (lab <0 || lab >100 ) {
			System.out.println("Invalid input for lab submission marks. Terminating program");
			return;
		}
		System.out.println("Pleace enter the percentage given for the exam:");
		double examp = input.nextDouble();
		if (examp <0 || examp >100 ) {
			System.out.println("Invalid input the percentage given for the exam. Terminating program");
			return;
		}
		System.out.println("Pleace enter the percentage given for the lab submission:");
		double labp = input.nextDouble();
		if (labp <0 || labp >100 ) {
			System.out.println("Invalid input the percentage given for the lab submission. Terminating program");
			return;
		}
		double totalp = examp + labp;
		if (totalp != 100) {
			System.out.println("The percentage must add up to 100. Terminating program");
			return;
		}
		double totalf = (exam*examp/100) + (lab*labp/100);
		System.out.println("Final Exam Mark is :" + totalf);
		input.close();
	}
}