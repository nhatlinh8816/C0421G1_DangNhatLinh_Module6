package assigment1;

import java.util.Scanner;

public class DrawTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		    int hight;
		    System.out.printf("Nhap chieu cao");
		    hight = sc.nextInt();
		    for (int i = 1; i <= hight; ++i) {
		      for (int j = 1; j <= i; ++j) {
		        System.out.print("* ");
		      }
		      System.out.println();
		    }
		 
	}

}
