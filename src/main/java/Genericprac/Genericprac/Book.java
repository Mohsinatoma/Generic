package Genericprac.Genericprac;
import java.util.Arrays;

import lombok.Getter;

import lombok.Setter;


@Getter
@Setter





public class Book {
	String bookName,authorName;
	int bookId;
	public Book(int a,String b,String c) {
		this.bookId=a;
		this.bookName=b;
		this.authorName=c;
		
	}
	public Book() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", authorName=" + authorName + ", bookId=" + bookId + "]";
	}

	@Override
	public boolean equals(Object o) {
		Book b1=(Book)o;
		

		return this.bookId==b1.bookId
				&& this.authorName.equals(b1.authorName) && this.bookName.equals(b1.bookName);}
		
		
		



}


