package Genericprac.Genericprac;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCustomList<E> {
	int length = 10;
	Object aa[] = new Object[10];
	Object aaa[] = new Object[10];
	Object aaaa[] = new Object[10];
	CustomList<Book> bookid = new CustomList(length);

	// E a;
	@SuppressWarnings("unchecked")
	@Before
	public void setUp() throws Exception {

		aa[0] = bookid.add(new Book(20151401, "River God", "Wilbar Smith"));
		aa[1] = bookid.add(new Book(20151402, "River God1", "Wilbar Smith1"));
		aa[2] = bookid.add(new Book(20151403, "River God2", "Wilbar Smith2"));
		aa[3] = bookid.add(new Book(20151404, "River God3", "Wilbar Smith3"));

	}

	@Test
	public void testAdd() {

		aaa[1] = new Object();
		aaa[1]=bookid.add(new Book(20151404, "River God3", "Wilbar Smith3"));
		assertEquals(new Book(20151404, "River God3", "Wilbar Smith3"),aaa[1]);

	}

	@Test
	public void testAddall() {

		aaa = (Object[]) bookid.addall(aa);
		assertEquals(bookid.add(new Book(20151401, "River God", "Wilbar Smith")), aaa[0]);
		assertEquals(bookid.add(new Book(20151402, "River God1", "Wilbar Smith1")), aaa[1]);
		assertEquals(bookid.add(new Book(20151403, "River God2", "Wilbar Smith2")), aaa[2]);
		assertEquals(bookid.add(new Book(20151404, "River God3", "Wilbar Smith3")), aaa[3]);
	}

	@Test
	public void testDelete() {

		bookid.addall(aa);
		aaa = (Object[]) bookid.delete((Book) aa[2]);

		assertEquals(bookid.add(new Book(20151401, "River God", "Wilbar Smith")), aaa[0]);
		assertEquals(bookid.add(new Book(20151402, "River God1", "Wilbar Smith1")), aaa[1]);
		assertEquals(bookid.add(new Book(20151404, "River God3", "Wilbar Smith3")), aaa[2]);
		assertEquals(bookid.add(null), aaa[3]);

	}
	
	



}
