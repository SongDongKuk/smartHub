package Question2;

import java.util.Scanner;

public class Question2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);		
		System.out.print("���� �Է� >>");
		int input_num = scn.nextInt();
		
		if(input_num%2==0) {
			System.out.println(input_num+"¦���Դϴ�.");
		}else
			System.out.println(input_num+"Ȧ���Դϴ�.");
	}

}
