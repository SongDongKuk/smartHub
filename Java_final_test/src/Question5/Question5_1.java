package Question5;

import java.util.Arrays;

public class Question5_1 {
	public static void main(String[] args) {
		int[] arr = { 15, 40, 79, 26, 54 };
		System.out.print("정렬 전: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}

		int[] sort_arr = sort(arr);
		System.out.println("");
		System.out.print("정렬 후: ");
		for (int i = 0; i < sort_arr.length; i++) {
			System.out.print(sort_arr[i]);
			System.out.print(" ");
		}
	}

	public static int[] sort(int[] arr) {
		int[] sort_arr = arr;
		int min;
		int temp;
		for (int j = 0; j < arr.length; j++) {
			 min= sort_arr[j];
			for (int i = 0+j; i < arr.length; i++) {
				System.out.print("min 값 : " + min);
				System.out.println("arr[i]값 : " + sort_arr[i]);
				if (sort_arr[i+1] >= min) {
					System.out.println("if문 내부");					
					temp = sort_arr[i];
					sort_arr[i] = sort_arr[i+1];
					sort_arr[i+1] = temp;
				}
				System.out.println(Arrays.toString(sort_arr));
			}
		}
		return sort_arr;
	}
}
