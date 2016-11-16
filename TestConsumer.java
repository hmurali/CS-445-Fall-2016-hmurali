import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestConsumer {
	String name = "Virgil B.";
	MessageUtil messageUtil = new MessageUtil(name);
	
	@Test
	public void testPrintMessage(){
		assertEquals(name,messageUtil.printMessage());
	}
}
