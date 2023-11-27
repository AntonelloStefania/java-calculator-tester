package org.lessons.java.calculator;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private Calculator c = null;
	@BeforeEach
	public void setUp() throws Exception {
		 c = new Calculator(0f, 0f);
	}
	
	@Test
	public void getAddMethodTestWithNoError() {
		c.setNum1(5.6f);
		c.setNum2(8.4f);
		
		assertEquals(c.add(c.getNum1(),c.getNum2()), 14f, "errore di calcolo nell'addizione");
	}

	@Test
	public void getSubtractMethodTestWithNoError(){
		c.setNum1(5.6f);
		c.setNum2(2.4f);
		
		assertEquals(c.subtract(c.getNum1(),c.getNum2()), 3.2f,0.001f, "errore di calcolo nella sottrazione");
		
	}
	
	@Test
	public void getMultiplyMethodTestWithNoError(){
		c.setNum1(5.6f);
		c.setNum2(2.4f);
		
		assertEquals(c.multiply(c.getNum1(),c.getNum2()), 13.44f, 0.001f, "errore di calcolo nella moltiplicazione");
		
	}
	
	
	@Test
	public void getDivideMethodTestWithNoException() throws Exception{
		c.setNum1(6.6f);
		c.setNum2(2.2f);
		
		assertEquals(c.divide(c.getNum1(),c.getNum2()), 3f, 0.001f, "errore di calcolo nella divisione");
		
	}
	
	
	@Test
	public void getDivideMethodTestWithNoError() throws Exception{
		c.setNum1(5.6f);
		c.setNum2(2.4f);
		
		assertDoesNotThrow(()->c.divide(c.getNum1(), c.getNum2()), "nessuna eccezione attesa");
		
	}
	
	@Test
	public void getDivideMethodTestWithError() throws Exception{
		c.setNum1(5.6f);
		c.setNum2(0f);
		
		assertThrows(Exception.class, ()-> c.divide(c.getNum1(), c.getNum2()), "eccezione attesa con num2 = 0" );
		
	}

	
	
}
