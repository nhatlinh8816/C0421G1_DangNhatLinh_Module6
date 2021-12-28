package assigment1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Assigment1_4 {
	public static void main(String[] args) {
		int n=0;
		while (n<=0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap n:");
			n = sc.nextInt();
		}
		String number = String.valueOf(n);
		String []stringNumber= number.split("");
		List<Integer> list = new ArrayList<Integer>();
		for (int j = 0; j < stringNumber.length; j++) {
			list.add(Integer.parseInt(stringNumber[j]));
		}
		int p = 0;
		int r = 1;
		for (int obj : list) {
			p+=obj;
			r*=obj;
		}
		System.out.println("Tong la "+p);
		System.out.println("Tich la "+r);
	}
}
