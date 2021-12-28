package assigment1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Assigment1_7 {
	//a.	Print to the screen  the reverse of S
	public static String stringReverse(String input) {
		String output = "";
		if (input == null) {
			return output = input;
		}else {
			for(int i = input.length()-1; i>=0;i--) {
				output = output + input.charAt(i);
			}
			return output;
		}
	}
	//b.	Convert all characters of S to capital letters
	
	public static String stringCapital(String input) {
		String output = "";
		if (input == null) {
			return output = input;
		}else {
			output = input.toUpperCase();
			return output;
		}
	}
	//c
	public static String stringLower(String input) {
		String output = "";
		if (input == null) {
			return output = input;
		}else {
			output = input.toUpperCase();
			return output;
		}
	}
	
	//d
	public static HashMap<Character, Integer> frequency(String objString) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < objString.length(); i++) {
		    char c =objString.charAt(i);
		    Integer val = map.get(c);
		    if (val != null) {
		        map.put(c, new Integer(val + 1));
		    }
		    else {
		       map.put(c, 1);
		   }
		}
		return map;
	}
	
	//e
	public static String subString(String input, int a, int b) {
		String output = "";
		output = input.substring(a-1,b);
		return output;
	}
	
	
	public static void main(String[] args) {
		String string = "Hanoi";
		Scanner scanner   = new Scanner(System.in);
		System.out.println("Please input String");
		string = scanner.nextLine();
		String stringReverse = stringReverse(string);
		System.out.println(stringReverse);
		System.out.println(stringCapital(string));
		Set set = frequency(string).keySet();
		for (Object key : set) {
			System.out.println(key + " has value: "+frequency(string).get(key));
		}
		int m = 1;
		int n = 0;
		String subString = "";
		while (m> n||n>string.length()) {
			System.out.println("Please input m");
			m = scanner.nextInt();
			System.out.println("Please input n");
			n = scanner.nextInt();
		}
		subString = subString(string, m, n);
		System.out.println(subString);
		
	}
	
}
