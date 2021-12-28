package btMrThang_baiException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.Name;

import jdk.internal.org.objectweb.asm.util.CheckAnnotationAdapter;

public class TestBook {
	public static Scanner scanner = new Scanner(System.in);
	public static List<Book> bookList = new ArrayList<>();
	static {
		bookList.add(new Book(1, "Harry Potter"));
		bookList.add(new Book(2, "Life of Pi"));
		bookList.add(new Book(3, "Robinhood Course"));
		bookList.add(new Book(4, "Norwegian Wood"));
	}
	public static void search(String nameBook) {
		boolean check = true;
		for (Book book : bookList) {
			if (nameBook.equals(book.getName())) {
				System.out.println("library have this book");
				 check = true;
				break;
			}else {
				check = false;
			}
		}
		if (!check) {
			try {
				throw new BookException();
			} catch (BookException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("input name book");
		String name = scanner.nextLine();
		TestBook.search(name);
	}
}
