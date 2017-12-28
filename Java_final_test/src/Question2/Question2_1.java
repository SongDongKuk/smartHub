package Question2;

import java.util.Scanner;

public class Question2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);		
		System.out.print("숫자 입력 >>");
		int input_num = scn.nextInt();
		
		if(input_num%2==0) {
			System.out.println(input_num+"짝수입니다.");
		}else
			System.out.println(input_num+"홀수입니다.");
	}

}
