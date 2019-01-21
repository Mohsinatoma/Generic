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

		aa[0] = bookid.add(new Book(20151401, "River God", "Wilbar Smith",23.34f));
		aa[1] = bookid.add(new Book(20151402, "River God1", "Wilbar Smith1",34.23f));
		aa[2] = bookid.add(new Book(20151403, "River God2", "Wilbar Smith2",56.567f));
		aa[3] = bookid.add(new Book(20151404, "River God3", "Wilbar Smith3",45.34f));

	}

	@Test
	public void testAdd() {

		aaa[1] = new Object();
		aaa[1]=bookid.add(new Book(20151404, "River God3", "Wilbar Smith3",65.34f));
		assertEquals(new Book(20151404, "River God3", "Wilbar Smith3",65.34f),aaa[1]);

	}

	@Test
	public void testAddall() {

		aaa = (Object[]) bookid.addall(aa);
		for(int i=0;i<5;i++) {
			System.out.println(aaa[i]);
		}
		assertEquals(new Book(20151401, "River God", "Wilbar Smith",23.34f), aaa[0]);
		assertEquals(new Book(20151402, "River God1", "Wilbar Smith1",34.23f), aaa[1]);
		assertEquals(new Book(20151403, "River God2", "Wilbar Smith2",56.567f), aaa[2]);
		assertEquals(new Book(20151404, "River God3", "Wilbar Smith3",45.34f), aaa[3]);
	}

	@Test
	public void testDelete() {

		bookid.addall(aa);
		aaa = (Object[]) bookid.delete((Book) aa[2]);
		

		assertEquals(new Book(20151401, "River God", "Wilbar Smith",23.34f), aaa[0]);
		assertEquals(new Book(20151402, "River God1", "Wilbar Smith1",34.23f), aaa[1]);
		assertEquals(new Book(20151404, "River God3", "Wilbar Smith3",45.34f), aaa[2]);
		assertEquals(bookid.add(null), aaa[3]);

	}
	
	
  @Test
	public void testupdate() {

		bookid.addall(aa);
		aa[5] = new Object();
		aa[5]=bookid.add(new Book(20151405, "River God5", "Wilbar Smith5",45.34f));
		
		aaa =  (Object[]) bookid.Update((Book) aa[5],2);
		
	

		assertEquals(new Book(20151401, "River God",  "Wilbar Smith",23.34f),   aaa[0]);
		assertEquals(new Book(20151402, "River God1", "Wilbar Smith1", 34.23f), aaa[1]);
		assertEquals(new Book(20151405, "River God5", "Wilbar Smith5", 45.34f), aaa[2]);
		assertEquals(new Book(20151404, "River God3", "Wilbar Smith3", 45.34f), aaa[3]);
		
		

	}
	


}
