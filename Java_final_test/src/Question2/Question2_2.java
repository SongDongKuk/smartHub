package Question2;

public class Question2_2 {
	public static void main(String[] args) {
				
		int sum=0;
		
		
		for (int i = 1; i <= 100; i++) {
			if((i%2==0)&&(i%3==0)&&(i%5==0)) {
				sum+=i;
			}
			
		}
		
		
		System.out.println("1~100���� ���� �� 2,3,5�� ������� ����" + sum + "�Դϴ�.");
	}
}
