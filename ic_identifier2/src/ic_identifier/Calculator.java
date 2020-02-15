package ic_identifier;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter your IC number:");
		String icNum = input.nextLine();

		Person user1 = new Person(icNum);
		user1.getAge();
		user1.cal_gender();
		user1.get_state();

		input.close();
	}

}
