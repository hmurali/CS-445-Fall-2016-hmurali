import java.util.Scanner;

public class Farmer {
public String name;
public String farm_name;
public String farm_address;
public String zip;
public String phone_number;
public String email;
public String[] account = {name, farm_name, farm_address, zip, phone_number, email};
Scanner scan = new Scanner(System.in); 
Store s = new Store();
Product p = new Product();

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
	
	public void create_store(String[] store_info){
		store_info[0] = s.getName();
		store_info[1] = s.getAddress();
		store_info[2] = s.getZip();
		store_info[3] = s.getPhone_number();
	}
	
	public void add_product_to_store(String[] store_inventory){
		store_inventory[0] = p.getProduct_type();
		store_inventory[1] = p.getProduct_name();
		store_inventory[2] = p.getProduct_price(); 
	}
	
	public void modify_product(String[] store_inventory){
		store_inventory[0] = p.updateProduct_type(p.product_type);
		store_inventory[1] = p.updateProduct_price(p.product_price);
		store_inventory[2] = p.updateProduct_name(p.product_name);
	}
}
