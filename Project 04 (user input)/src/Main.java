import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		System.out.println(" How old are you? ");
		int age = scanner.nextInt();
		System.out.println(" what year is it ");
		int year = scanner.nextInt();

		scanner.nextLine();
		System.out.println("What is your favorite food?");
		String food = scanner.nextLine();

		System.out.println("Hello "+ name);
		System.out.println("You are "+age+" years old");
		System.out.println("It is "+ year);
		System.out.println("You like "+ food);
	}

}
