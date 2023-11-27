package org.lessons.java.calculator.ticket;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



import org.junit.jupiter.api.Test;

public class TicketTest {

	
	@Test
	public void getAgeError() throws Exception {
		 
		assertThrows(Exception.class, () -> {
		        new Ticket(-1, 10);
		    }, "errore età");
	}
	
	@Test
	public void getKmError() throws Exception {
		 
		assertThrows(Exception.class, () -> {
		        new Ticket(25, -15);
		    }, "errore km");
	}
	
	@Test
	public void getNoDataError() throws Exception{
		assertDoesNotThrow(()-> {
			new Ticket(25, 400);
		}, "non ci si aspettano errori");
	}
	
	@Test
	public void getRightPrice() throws Exception {
		Ticket t = new Ticket(20, 100);
		assertEquals(21, t.getPrice());
	}
	
	@Test
	public void getRightUnderDiscount() throws Exception{
		Ticket t = new Ticket(15, 100);
		assertEquals(16.8, t.getDiscountedPrice());
	}
	
	@Test
	public void getRightOverDiscount() throws Exception{
		Ticket t = new Ticket(75, 100);
		assertEquals(12.6, t.getDiscountedPrice());
	}
	
	@Test
	public void getRightStandardDiscount() throws Exception{
		Ticket t = new Ticket(25, 100);
		assertEquals(21, t.getDiscountedPrice());
	}
}
