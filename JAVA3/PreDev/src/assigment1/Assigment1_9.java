package assigment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Assigment1_9 {

	public static void main(String[] args) {
		//a
		int numberOfRow = 0 ;
		int numberOfColunm = 0 ;
		while (numberOfRow<=0||numberOfColunm<0) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Input number of row: ");
			numberOfRow = scanner.nextInt();
			System.out.println("Input number of column: ");
			numberOfColunm = scanner.nextInt();
		}
		int[][]array2d = new int [numberOfRow][numberOfColunm];
		for (int i = 0; i < numberOfRow; i++) {
			for (int j = 0; j < numberOfColunm; j++) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Input element of row: "+i+", column: "+j);
				array2d[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < numberOfRow; i++) {
			for (int j = 0; j < numberOfColunm; j++) {
				System.out.print(array2d[i][j] );
			}
			System.out.println("");
		}
		//b
		int multi = 1;
		for (int j = 0; j < numberOfColunm; j++) {
			 if (array2d[0][j]%3==0) {
				multi*= array2d[0][j];
			}
		}
		System.out.println
		("the product of the numbers as multiples of 3 on the first row of the matrix is: "+multi);
		//c
		ArrayList<Integer> arrayMaxArrayList = new ArrayList<Integer>();
		for (int i = 0; i < numberOfRow; i++) {
			int max = array2d[i][0];
			for (int j = 0; j < numberOfColunm; j++) {
				if (array2d[i][j]>max) {
					max = array2d[i][j];
				}
			}
			arrayMaxArrayList.add(max);
		}
		for (Integer obj : arrayMaxArrayList) {
			System.out.print(obj+" ");
		}
	}

}
