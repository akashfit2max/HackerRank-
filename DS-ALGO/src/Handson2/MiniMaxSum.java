package Handson2;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, max = 0, min = 1000000000;
		long sum = 0;
		int x = 0;
		for (i = 0; i < 5; i++) {
			x = in.nextInt();
			sum = sum + x;
			if (x > max) {
				max = x;
			}
			if (x < min) {
				min = x;
			}
		}
		System.out.println((sum - max) + " " + (sum - min));

	}
}
