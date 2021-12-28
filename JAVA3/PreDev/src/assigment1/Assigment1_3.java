package assigment1;

import java.util.Scanner;

public class Assigment1_3 {
	/** 
	 * @param i la tham so truyen vao
	 * @return a la giai thua cua i
	*/
	public static int giaithua(int i) {
		int a = 1;
		for (int j = i; j > 0; j--) {
			a = a * j ;
		}
		return a;
	}
	public static void main(String[] args) {
		int n=0;
		float s = 0;
		while (n<1) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap n:");
			n = sc.nextInt();
			for(int i =1;i<=n;i++) {	
				s+=1.0/giaithua(2*i-1)	;	
			}
			System.out.println(s);
		}
		
	}
}
