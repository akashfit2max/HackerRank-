package Handson;

import java.io.*;
import java.util.*;

public class ArrayManipulation {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int n = ss.nextInt();
		int m = ss.nextInt();
		long arr[] = new long[n + 1];

		for (int i = 0; i < m; i++) {
			int a = ss.nextInt();
			int b = ss.nextInt();
			int sum = ss.nextInt();
			arr[a] += sum;
			if (b + 1 <= n)
				arr[b + 1] -= sum;
		}
		long x = 0, max = 0;
		for (int i = 1; i <= n; i++) {
			x = x + arr[i];
			if (max < x)
				max = x;
		}
		System.out.println(max);
	}
}