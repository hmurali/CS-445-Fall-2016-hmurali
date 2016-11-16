import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestProduct {
	String product_price = "21.00";
	MessageUtil messageUtil = new MessageUtil(product_price);
	
	@Test
	public void testPrintMessage(){
		assertEquals(product_price,messageUtil.printMessage());
	}
}
