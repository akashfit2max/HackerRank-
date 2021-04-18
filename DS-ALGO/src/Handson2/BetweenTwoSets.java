package Handson2;

import java.util.Iterator;
import java.util.Scanner;

public class BetweenTwoSets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int b[] = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		long ans = 0;
		for (int i = 1; i < 100; i++) {
			boolean f = true;
			for (int j = 0; j < n; j++) {
				if (i % a[j] != 0) {
					f = false;
					break;
				}
			}
			for (int j = 0; j < m; j++) {
				if (b[j] % i != 0) {
					f = false;
					break;
				}
			}
			if (f) {
				ans++;
			}

		}
		System.out.println(ans);
	}
}
