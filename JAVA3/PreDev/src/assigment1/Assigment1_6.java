package assigment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assigment1_6 {
	public static void main(String[] args) {
		int a= 0;
		int b = 0;
		List<Integer>list = new ArrayList<Integer>();
		do {
			Scanner scanner   = new Scanner(System.in);
			System.out.println("Please input positive number");
			a = scanner.nextInt();
		} while (a<0);
		while (a>=1) {
			b = a%2;
			list.add(0, b);
			a = (a-b)/2;
		}
		for (Integer obj : list) {
			System.out.print(obj);
		}
		
	}
}
