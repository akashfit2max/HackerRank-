package Handson;

import java.util.ArrayList;
import java.util.Scanner;

public class SparseArays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ArrayList<String> a = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			a.add(s.next());
		}
		int q = s.nextInt();
		for (int i = 0; i < q; i++) {
			String st = s.next();
			int count = 0;
			for (int j = 0; j < a.size(); j++) {
				if (a.get(j).equals(st)) {
					count++;
				}
			}
			s.nextLine();
			System.out.println(count);
		}
	}
}