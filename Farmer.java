import java.util.Scanner;

public class Farmer {
public String name;
public String id;
public String farm_name;
public String farm_address;
public String zip;
public String phone_number;
public String email;
public String[] account = {name, farm_name, farm_address, zip, phone_number, email};
Scanner scan = new Scanner(System.in); 
Store s = new Store();
Product p = new Product();
Consumer c = new Consumer(); 
public String fid; 
public String oid;
public double product_price_sum;
public double delivery_charge;
public double order_total;
public String status;
public double item_price;
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
	
	public void setId(String id){
		System.out.print("Please enter farmer id: ");
		id=scan.next();
	}
	
	public String getId(){
		return id;
	}
	
	public String updateId(String id){
		setId(id);
		this.id = id;
		return this.id; 
	}
	public void setFarm_name(String farm_name){
		System.out.print("Please enter farm name: ");
		farm_name = scan.next();
	}
	
	public String getFarm_name(){
		return farm_name; 
	}
	
	public String updateFarm_name(String farm_name){
		setFarm_name(farm_name);
		this.farm_name = farm_name;
		return this.farm_name;
	}
	
	public void setFarm_address(String farm_address){
		System.out.print("Please enter farm address: ");
		farm_address = scan.next(); 
	}
	
	public String getFarm_address(){
		return farm_address;
	}
	
	public String updateFarm_address(String farm_address){
		setFarm_address(farm_address);
		this.farm_address = farm_address;
		return this.farm_address;
	}
	
	public void setZip(String zip){
		System.out.print("Please enter zip code: ");
		zip=scan.next();
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
		account[0] = getName();
		account[1] = getFarm_name();
		account[2] = getFarm_address();
		account[3] = getZip();
		account[4] = getPhone_number();
		account[5] = getEmail();
		setId(id);
		System.out.printf("fid: %s", getId());
	}
	
	public void update_account(String[] account){
		account[0] = updateName(name);
		account[1] = updateFarm_name(farm_name);
		account[2] = updateFarm_address(farm_address);
		account[3] = updateZip(zip);
		account[4] = updatePhone_number(phone_number);
		account[5] = updateEmail(email);
		
	}
	
	public void cancel_account(String[] account){
		System.out.print("Do you want to cancel your account?: ");
		String response = scan.next();
		if (response == "yes") {
			for (int i = 0; i < account.length; i++){
				account[i] = null;
			}
			System.out.print("Account successfully cancelled!!");
		} else {
			// do nothing
		}
	}
	
	public void view_account(String[] account){
		create_account(account);
		System.out.print(account);
	}
	
	public void view_account_by_fid(){
		System.out.print("Enter an id: ");
		fid = scan.next();
		this.id = getId();
		if (fid.equals(this.id)){
			view_account(account);
		} else {
			System.out.print("404: id not found, please try again");
			view_account_by_fid();
		}
	}
	
	public void create_store(String[] store_info){
		store_info[0] = s.getName();
		store_info[1] = s.getAddress();
		store_info[2] = s.getZip();
		store_info[3] = s.getPhone_number();
	}
	
	public void add_product_to_store(String[] store_inventory){
		System.out.print("Enter product id: ");
		p.product_id = scan.next();
		this.p.product_id = p.getProduct_id();
		if (p.product_id.equals(this.p.product_id)){
			store_inventory[0] = p.getProduct_type();
			store_inventory[1] = p.getProduct_name();
			store_inventory[2] = p.getProduct_price(); 
			store_inventory[3] = p.getProduct_unit();
			store_inventory[4] = p.getProduct_id();
		}
	}
	
	public void get_product_inventory(){
		System.out.print("Enter farmer id: ");
		fid = scan.next();
		 this.id = getId();
		 if (fid.equals(this.id)){
			System.out.print("Store inventory: " + p.getProduct_name() + "," + p.getProduct_type() + "," + p.getProduct_price()); 
		 } else {
			 System.out.print("404: id not found, please try again");
			 get_product_inventory();
		 }
	}
	
	public void get_product_details(){
		System.out.print("Enter farmer id: ");
		fid = scan.next();
		this.id = getId();
		System.out.print("Enter product id: ");
		p.product_id = scan.next();
		this.p.product_id = p.getProduct_id();
		if (fid.equals(this.id) && p.product_id.equals(this.p.product_id)){
			System.out.printf("fspid: %s", p.product_id);
			System.out.printf("note: %s: ", p.product_type);
			System.out.printf("price : %s", p.product_price);
			System.out.printf("product_unit: %s", p.product_unit);
		}
	}
	
	public void modify_product(String[] store_inventory){
		store_inventory[0] = p.updateProduct_type(p.product_type);
		store_inventory[1] = p.updateProduct_price(p.product_price);
		store_inventory[2] = p.updateProduct_name(p.product_name);
	}
	
	public void view_reports(){
		String[] report_id = new String[4];
		report_id[0] = "frid: 701" + "," + "\n" + "name: Orders to deliver to today";
		report_id[1] = "frid: 702" + "," + "\n" + "name: Orders to deliver tomorrow";
		report_id[2] = "frid: 703" + "," + "\n" + "name: Revenue report";
		report_id[3] = "frid: 704" + "," + "\n" + "name: Orders delivery report";
		
		System.out.print(report_id);
	}
	
	public void view_report_by_frid(){
		System.out.print("Enter a frid: ");
		String frid = scan.next(); 
		if (frid.equals("701")){
			System.out.print("frid: 701" + "," + "\n");
			System.out.print("name: Orders to deliver today" + "," + "\n");
			System.out.print("orders: [{\n");
			System.out.printf("oid: %s,\n", oid);
			System.out.printf("products_total: %f,\n", product_price_sum);
			System.out.printf("delivery_charge: %f,\n", delivery_charge);
			System.out.printf("order_total: %f,\n", order_total);
			System.out.printf("status: %s,\n", status);
			System.out.print("ordered_by: {\n");
			System.out.printf("name: %s,\n", c.name);
			System.out.printf("email: %s,\n", c.email);
			System.out.printf("phone: %s,\n", c.phone_number);
			System.out.print("},\n");
			System.out.printf("delivery_address: %s,\n", c.address);
			System.out.print("ordered_by: {\n");
			System.out.printf("fspid: %s,\n", p.product_id);
			System.out.printf("name: %s,\n", p.product_name);
			System.out.printf("order_size: %s,\n", p.product_type);
			System.out.printf("price: %s,\n", p.product_price);
			System.out.printf("list_item_total: %f,\n", item_price);
		} 
	}
	
	public double get_delivery_charge(){
		System.out.print("Please enter an amount: ");
		delivery_charge = scan.nextDouble();
		return delivery_charge;
	}
	public double modify_delivery_charge(double delivery_charge){
		delivery_charge = get_delivery_charge();
		System.out.print("Please enter a new amount: ");
		this.delivery_charge = scan.nextDouble();
		return this.delivery_charge;
	}
}
