import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestSearch {
	String topic = "farm";
	MessageUtil messageUtil = new MessageUtil(topic);
	
	@Test
	public void testPrintMessage(){
		assertEquals(topic,messageUtil.printMessage());
	}
}
