package assigment1;

import java.util.Scanner;

public class Assigment1_5 {
	public static void main(String[] args) {
		int n=0;
		int m=0;
		while (n<=0||m<=0) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Nhap n:");
			n = sc1.nextInt();
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Nhap m:");
			m = sc2.nextInt();
		}
		int ucln=1;
		int bcnn = n*m;
		for (int i = 1; i <= n && i <= m; i++) {
			if(n%i== 0 && m%i== 0) {
				ucln = i;
			}
		}
		if (n%m==0) {
			bcnn = n;
		}
		if (m%n==0) {
			bcnn = m;
		}
		System.out.println("greatest common divisor is "+ucln);
		System.out.println("the least common multiple is "+bcnn);
		
	}
}
