import java.util.Scanner;
public class Search {
Scanner scan = new Scanner(System.in);
Farmer f = new Farmer();
Consumer c = new Consumer();

	public void get_search(String topic, String key){
		System.out.print("Please enter a topic: ");
		topic = scan.next();
		if (topic.equals("farm")){
			f.view_account_by_fid();
		} else if (topic.equals("customer")){
			c.view_account(c.account);
		} else if (topic.equals("order")){
			c.view_order_by_id(c.order);
		}
		System.out.print("Please enter a keyword: ");
		key = scan.next();
		if (key.equals(null)){
			f.view_account_by_fid();
			c.view_account(c.account);
			c.view_order_by_id(c.order); 
		}
	}
}
