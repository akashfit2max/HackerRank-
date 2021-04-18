package Handson2;

import java.util.Scanner;

public class MagicSquae {
	public static void main(String[] args) {
//		Magin square that can be formed by using numbers from 1..9
		int[][][] magicSquares = new int[][][] { { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } },
				{ { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } }, { { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } },
				{ { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } }, { { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } },
				{ { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } }, { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } },
				{ { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } } };

		Scanner sc = new Scanner(System.in);
		int square[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				square[i][j] = sc.nextInt();
			}
		}

		int min = Integer.MAX_VALUE;
		for (int s = 0; s < 8; s++) {
			int sum = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					sum += (int) Math.abs(square[i][j] - magicSquares[s][i][j]);
				}
			}
			min = Math.min(min, sum);
		}
		System.out.println(min);
	}
}
