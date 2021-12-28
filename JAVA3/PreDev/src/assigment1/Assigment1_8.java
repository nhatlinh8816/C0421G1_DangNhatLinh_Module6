package assigment1;


import java.util.ArrayList;
import java.util.Scanner;

public class Assigment1_8 {
	public static int sumOldNumber(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2==0) {
				sum+= array[i];
			}
		}
		return sum;
	}
	
	public static void findPosition(int[] array, int k) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (k==array[i]) {
				arrayList.add(0,i);
			}
		}
		if (arrayList.isEmpty()) {
			System.out.println(k+" is not in array");
		}
		for (Integer obj : arrayList) {
			System.out.println(obj);
		}
	}
	public static int[] orderAsc(int[] array) {
		int temp = array[0];
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i]>array[j]) {
					temp = array[i];
					array[i] = array[j];
					 array[j] = temp;
				}
				
			}
		}
		return array;
	}

	public static void main(String[] args) {
		// a.Enter an array A of n elements of type int int
		int n = 0 ;
		while (n<=0) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Input array length");
			n = scanner.nextInt();
		}
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("input array index "+i+": ");
			array[i] = scanner.nextInt();
		}
		for (int i : array) {
			System.out.println(i);
		}
		//b Sum the odd numbers of the array A
		System.out.println("sumOldNumber is "+sumOldNumber(array));
		//c
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input an element: ");
		int k = scanner.nextInt();
		findPosition(array, k);
		//d
		System.out.println("Array order ASC: ");
		int[]orderArray = orderAsc(array);
		for (int i : orderArray) {
			System.out.println(i);
		}
	}

}


