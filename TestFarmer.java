import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestFarmer {
	String farm_name = "LF2U";
	MessageUtil messageUtil = new MessageUtil(farm_name);
	
	@Test
	public void testPrintMessage(){
		assertEquals(farm_name,messageUtil.printMessage());
	}
}
