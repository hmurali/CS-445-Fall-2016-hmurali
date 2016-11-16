import java.util.Scanner;
public class Delivery {
Consumer c = new Consumer();
Scanner scan = new Scanner(System.in);
public String oid;
	public void update_order_by_oid(){
		System.out.print("Please enter an order id: ");
		oid = scan.next();
		if (oid.equals(c.oid)){
			c.update_order(c.order);
			c.setStatus("delivered");
		} 
	}
}
