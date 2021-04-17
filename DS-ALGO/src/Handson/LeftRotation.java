package Handson;

import java.util.Scanner;

public class LeftRotation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int d = sc.nextInt();
		int[] a = new int[N];
		int[] newa = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			int index = ((N + i - d) % N);
			newa[index] = a[i];
		}
		for (int i = 0; i < N; i++) {
			System.out.print(newa[i] + " ");
		}

	}
}