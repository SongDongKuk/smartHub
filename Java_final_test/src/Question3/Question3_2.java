package Question3;

import java.util.Scanner;

public class Question3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int num1,num2;
		System.out.print("ù ��° ����>>");
		num1 = scn.nextInt();
		System.out.print("�� ��° ����>>");
		num2 = scn.nextInt();
		
		Calulator myc = new Calulator(num1, num2);
		System.out.println("���ϱ� : " + myc.plus());
		System.out.println("���� : " + myc.minus());
		System.out.println("���ϱ� : " + myc.mul());
		System.out.println("������ : " + myc.div());
		
	}

}
