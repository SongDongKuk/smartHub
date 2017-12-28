package Question3;

import java.util.Scanner;

public class Question3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int num1,num2;
		System.out.print("첫 번째 정수>>");
		num1 = scn.nextInt();
		System.out.print("두 번째 정수>>");
		num2 = scn.nextInt();
		
		Calulator myc = new Calulator(num1, num2);
		System.out.println("더하기 : " + myc.plus());
		System.out.println("빼기 : " + myc.minus());
		System.out.println("곱하기 : " + myc.mul());
		System.out.println("나누기 : " + myc.div());
		
	}

}
