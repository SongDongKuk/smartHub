package Question5;

import java.util.Scanner;

public class GreetingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String name = scan.next();
		
		GreetingProgram greeting = new GreetingProgram();
		greeting.setLanguage(new English());
		greeting.greet(name);
		
		greeting.setLanguage(new Korean());
		greeting.greet(name);
		
		greeting.setLanguage(new Japanese());
		greeting.greet(name);
		
		scan.close();
	}

}
