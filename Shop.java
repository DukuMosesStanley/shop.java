import java.io.*; // Is input and output.
import java.util.Scanner; // Is to allow user input.

public class Shop {
	// Declare Variables
	int Math;
	int Geographic;
	int History;
	int Science;
	int English;
	// The end of variable

	public static void main(String args[]) { // This is main method.

		Scanner S = new Scanner(System.in); // Calling user input from the keyboard

		System.out.println("This is a IUEA Grade");
		System.out.println("====================");

		System.out.println("Enter Math marks");
		int Math = S.nextInt();
		
		System.out.println("Enter Geographic marks");
		int Geographic = S.nextInt();

		System.out.println("Enter History marks");
		int History = S.nextInt();

		System.out.println("Enter Science marks");
		int Science = S.nextInt();

		System.out.println("Enter English marks");
		int English = S.nextInt();

		int Total_Marks = Math + Geographic + History + Science + English;

		System.out.println("This is the total Marks: " + " " + Total_Marks);
		System.out.println("====================");

		int Average = Total_Marks / 5;

		System.out.println("This is the total average:" + " " + Average);
		System.out.println("====================");

		if (Average>= 90) {
			System.out.println("Grade A+");
			
		} else if (Average >= 80) {
			System.out.println("Grade A");

		} else if (Average >= 75) {
			System.out.println("Grade B");

		} else if (Average >= 65) {
			System.out.println("Grade C+");

		} else if (Average >= 55) {
			System.out.println("Grade C");

		} else if (Average >= 50) {
			System.out.println("Grade D");

		} else if (Average >= 30) {
			System.out.println("Grade F");

		}else if (Average >= 30) {
			System.out.println("Grade F");

		}
	}
}
