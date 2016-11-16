import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestManager {
	String name = "Ayesha";
	MessageUtil messageUtil = new MessageUtil(name);
	
	@Test
	public void testPrintMessage(){
		assertEquals(name,messageUtil.printMessage());
	}
}
