import java.util.Scanner;

public class Consumer {
public String name; // consumer name
public String address; // consumer address
public String zip;
public String phone_number;
public String id;
public String email; 
public String cid; 
public String oid;
public String[] account = {id, name, address, zip, phone_number, email};
public String[] farmers;
public boolean isValid;
Scanner scan = new Scanner(System.in);
Farmer f = new Farmer();
Product p = new Product();
public String[] order = {p.product_name, p.product_type, p.product_price};

	public void setStatus(String status){
		if (oid.equals(p.product_id)){
			status = "delivered";
		} 
	}
	public void setId(String id){
		System.out.print("Please enter customer id: ");
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
		account[0] = getName();
		account[1] = getAddress();
		account[2] = getZip();
		account[3] = getPhone_number();
		account[4] = getEmail();
	}
	
	public void update_account(String[] account){
		account[0] = updateName(name);
		account[1] = updateAddress(address);
		account[2] = updateZip(zip);
		account[3] = updatePhone_number(phone_number);
		account[4] = updateEmail(email);
	}
	
	public void cancel_account(String[] account){
		System.out.print("Do you want to cancel your account?: ");
		String response = scan.next();
		if (response == "yes"){
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
	
	public void create_order(String[] order){
		System.out.print("Please enter customer id: ");
		cid=scan.next();
		if(cid.equals(id)){
			isValid = true;
			order[0] = p.getProduct_name();
			order[1] = p.getProduct_type();
			order[2] = p.getProduct_price();
			order[3] = p.getProduct_id();
			System.out.print("201: created");
			System.out.printf("oid: %s", p.getProduct_id());
		} else {
			isValid = false;
			System.out.print("404: cid you've entered doesn't exist");
			create_order(order);
		}
	}
	
	public void update_order(String[] order){
		order[0] = p.updateProduct_name(p.product_name);
		order[1] = p.updateProduct_type(p.product_type);
		order[2] = p.updateProduct_price(p.product_price);
	}
	
	public void cancel_order(String[] order){
		System.out.print("Do you want to cancel your order?: ");
		String response = scan.next();
		if (response == "yes") {
			for (int i = 0; i < order.length; i++){
				order[i] = null;
			}
			System.out.print("status"+":"+"cancelled");
		} else {
			// do nothing
		}
	}
	
	public void view_order(String[] order){
		System.out.print("Please enter customer id: ");
		cid = scan.next();
		if (cid.equals(id)){
			isValid = true;
			order[0] = p.getProduct_name();
			order[1] = p.getProduct_type();
			order[2] = p.getProduct_price();
			System.out.print("Order: " + order[0] + "," + order[1] + "," + order[2]);
			System.out.printf("oid: %s,\n", p.getProduct_id());
			System.out.printf("fid: %s,\n", f.getId());
		} else {
			isValid = false;
			System.out.print("404: not found");
		}
	}
	
	public void view_order_by_id(String[] order){
		System.out.print("Please enter customer id: ");
		cid = scan.next();
		System.out.print("Please enter order id: ");
		oid = scan.next();
		if (cid.equals(id) && oid.equals(p.getProduct_id())){
			isValid = true;
			order[0] = p.getProduct_name();
			order[1] = p.getProduct_type();
			order[2] = p.getProduct_price();
			System.out.print("Order: " + order[0] + "," + order[1] + "," + order[2]);
		} else {
			isValid = false;
			System.out.print("404: not found");
		}
	}
	
	public void view_farmers(String[] farmers){
		for (int i = 0; i < farmers.length; i++){
			farmers[i] = f.getName();
		}
		System.out.print("Farmers: " + farmers);
	}
	
	public void view_products_by_farmer(){
		System.out.print("Please enter farmer name: " );
		f.name = scan.next();
		if (f.name == f.getName()){
			f.get_product_inventory();
		} else {
			System.out.print("Sorry, the farmer you've requested doesn't have any products, please try again");
			view_products_by_farmer();
		}
	}
}
