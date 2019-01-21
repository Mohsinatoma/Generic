package Genericprac.Genericprac;
import java.util.Arrays;

import lombok.Getter;

import lombok.Setter;


@Getter
@Setter





public class Book {
	String bookName,authorName;
	int bookId;
	float price;
	public Book(int a,String b,String c,float d) {
		this.bookId=a;
		this.bookName=b;
		this.authorName=c;
		this.price=d;
		
	}
	public Book() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public boolean equals(Object o) {
		Book b1=(Book)o;
		int flag=0;
		if(Math.abs(this.price)== Math.abs(b1.price)) {
			flag=1;
		}
		if(flag==1)
		{
			return this.bookId==b1.bookId
				&& this.authorName.equals(b1.authorName) && this.bookName.equals(b1.bookName) && true ;}
		  return false;
		}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", authorName=" + authorName + ", bookId=" + bookId + ", price=" + price
				+ "]";
	}
		
		
		



}


