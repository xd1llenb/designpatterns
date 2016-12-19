package abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcreteFactory2Test {

	@Test
	public void testCreateProductB() {
	 ProductB2 	prodb2 = new ProductB2("ProductB2");
	 
	   System.out.println( "TEST" + prodb2.toString());
	   
	   assertNotNull(prodb2);
	 
	}

}
