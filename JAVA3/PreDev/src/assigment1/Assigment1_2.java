package assigment1;

import java.util.Scanner;


//2.	Write a program to calculate :
//S=1+1/2+1/3+....+1/n


public class Assigment1_2 {
	public static void main(String[] args) {
		int n=0;
		float s = 0;
		while (n<=0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap n:");
			n = sc.nextInt();
			for(int i =1;i<=n;i++) {	
				s+=1.0/i	;	
			}
			System.out.println(s);
		}
		}
	}
	

