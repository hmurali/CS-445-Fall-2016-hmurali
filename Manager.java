import java.util.Scanner;

public class Manager {
public String name;
public String id; 
public String address;
public String zip;
public String phone_number;
public String email; 
public String[] account = {id, name, address, zip, phone_number, email};
Farmer f = new Farmer();
Product p = new Product();
Consumer c = new Consumer();
Catalog cat = new Catalog();
public int num_orders_placed;
public int num_orders_delivered;
public int num_orders_open;
public int num_orders_cancelled;
public boolean isValid; 
Scanner scan = new Scanner(System.in);
	public void setId(String id){
		System.out.print("Please enter manager id: ");
		id=scan.next();
	}

	public String getId(){
		return id;
	}

	public void setName(String name){
		System.out.print("Please enter name: ");
		name=scan.next();
	}
	
	public String getName(){
		return name; 
	}
	
	public String updateName(String name){
		setName(name);
		this.name = name;
		return this.name;
	} 
	
	public void setAddress(String address){
		System.out.print("Please enter address: ");
		address = scan.next();
	}
	
	public String getAddress(){
		return address;
	}
	
	public String updateAddress(String address){
		setAddress(address);
		this.address = address;
		return this.address;
	}
	
	public void setZip(String zip){
		System.out.print("Please enter zip: ");
		zip = scan.next();
	}
	
	public String getZip(){
		return zip;
	}
	
	public String updateZip(String zip){
		setZip(zip);
		this.zip = zip;
		return this.zip;
	}
	
	public void setPhone_number(String phone_number){
		System.out.print("Please enter phone number: ");
		phone_number = scan.next();
	}
	
	public String getPhone_number(){
		return phone_number;
	}
	
	public String updatePhone_number(String phone_number){
		setPhone_number(phone_number);
		this.phone_number = phone_number;
		return this.phone_number;
	}
	
	public void setEmail(String email){
		System.out.print("Please enter email: ");
		email = scan.next();
	}
	
	public String getEmail(){
		return email;
	}
	
	public String updateEmail(String email){
		setEmail(email);
		this.email = email;
		return this.email;
	}
	
	public void create_account(String[] account){
		account[0] = getId();
		account[1] = getName();
		account[2] = getAddress();
		account[3] = getZip();
		account[4] = getPhone_number();
		account[5] = getEmail();
	}
	
	public void view_account(String[] account){
		create_account(account); 
		System.out.print(account);
	}
	
	public void view_all_manager_accounts(){
		String[][] manager_accounts = new String[6][6];
		for(int i=0; i<account.length; i++){
			for(int j=0; j<account.length; j++){
				manager_accounts[i][j] = account[j];
			}
		}
		System.out.print(manager_accounts);
	}
	
	public void view_account_by_mid(){
		System.out.print("Enter an id: ");
		String mid = scan.next(); 
		this.id = getId();
		if (mid.equals(this.id)){
			view_account(account);
		} else {
			System.out.print("404: id not found, please try again");
			view_account_by_mid();
		}
	}
	
	public void view_reports(){
		String[] report_id = new String[5];
		report_id[0] = "mrid: 1" + "," + "\n" + "name: Orders placed today";
		report_id[1] = "mrid: 2" + "," + "\n" + "name: Orders places yesterday";
		report_id[2] = "mrid: 3" + "," + "\n" + "name: Revenue for previous month";
		report_id[3] = "mrid: 4" + "," + "\n" + "name: Revenue yesterday";
		report_id[4] = "mrid: 5" + "," + "\n" + "name: Revenue yesterday by zip code";
		
		System.out.print(report_id);
	}
	
	public void num_orders_placed(){
		c.create_order(c.order);
		num_orders_placed++;
	}
	
	public void num_orders_cancelled(){
		c.cancel_order(c.order);
		num_orders_cancelled++;
	}
	
	public void num_orders_open(){
		c.view_order(c.order);
		num_orders_open++;
	}
	
	public int num_orders_delivered(){
		num_orders_delivered = num_orders_placed - (num_orders_cancelled + num_orders_open);
		return num_orders_delivered; 
	}
	
	public void view_report_by_mrid(){
		System.out.print("Enter an mrid: ");
		String mrid = scan.next(); 
		if (mrid.equals("1")){
			System.out.print("mrid: 1" + "," + "\n");
			System.out.print("name: Orders placed today" + "," + "\n");
			System.out.printf("orders_placed: %d,\n", num_orders_placed);
			System.out.printf("orders_delivered: %d,\n", num_orders_delivered);
			System.out.printf("orders_open: %d,\n", num_orders_open);
			System.out.printf("orders_cancelled: %d,\n", num_orders_cancelled);
		} else if (mrid.equals("2")){
			System.out.print("mrid: 2" + "," + "\n");
			System.out.print("name: Orders placed yesterday" + "," + "\n");
			System.out.printf("orders_placed: %d,\n", num_orders_placed);
			System.out.printf("orders_delivered: %d,\n", num_orders_delivered);
			System.out.printf("orders_open: %d,\n", num_orders_open);
			System.out.printf("orders_cancelled: %d,\n", num_orders_cancelled);
		} else if (mrid.equals("3")){
			System.out.print("mrid: 3" + "," + "\n");
			System.out.print("name: Revenue for previous month" + "," + "\n");
			System.out.printf("orders_placed: %d,\n", num_orders_placed);
			System.out.printf("orders_delivered: %d,\n", num_orders_delivered);
			System.out.printf("orders_open: %d,\n", num_orders_open);
			System.out.printf("orders_cancelled: %d,\n", num_orders_cancelled);
		} else if (mrid.equals("4")){
			System.out.print("mrid: 4" + "," + "\n");
			System.out.print("name: Revenue for yesterday" + "," + "\n");
			System.out.printf("orders_placed: %d,\n", num_orders_placed);
			System.out.printf("orders_delivered: %d,\n", num_orders_delivered);
			System.out.printf("orders_open: %d,\n", num_orders_open);
			System.out.printf("orders_cancelled: %d,\n", num_orders_cancelled);
		} else if (mrid.equals("5")){
			System.out.print("mrid: 5" + "," + "\n");
			System.out.print("name: Revenue for yesterday by zip code" + "," + "\n");
			System.out.printf("orders_placed: %d,\n", num_orders_placed);
			System.out.printf("orders_delivered: %d,\n", num_orders_delivered);
			System.out.printf("orders_open: %d,\n", num_orders_open);
			System.out.printf("orders_cancelled: %d,\n", num_orders_cancelled);
		}
		
	}
	
	public void view_catalog(){
		cat.list_product_by_id();
	}
	
	public String add_product_to_catalog(String name){
		System.out.print("Please enter a product name: ");
		p.product_name = scan.next();
		System.out.print("Please enter a product id: ");
		p.product_id = scan.next();
		System.out.printf("gcpid:%s",p.product_id);
		return p.product_id;
	}
	
	public void update_catalog(String name){
		view_catalog();
		System.out.print("Please enter product id: ");
		p.product_id = scan.next();
		if ((cat.gcpid).equals(p.product_id)){
			isValid = true;
			System.out.print("Please enter product name: ");
			p.product_name = scan.next();
			System.out.print("Please enter product type: ");
			p.product_type = scan.next();
			System.out.printf("name:%s (%s)", p.product_name, p.product_type);
		} else {
			isValid = false;
			System.out.print("404: not found");
			update_catalog(name);
		}
		
	}
}
