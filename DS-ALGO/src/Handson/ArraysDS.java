package Handson;

import java.util.Scanner;

public class ArraysDS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of terms");
		int n = sc.nextInt();

		System.out.println("Enter the terms");

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("reversed array");

		for (int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
