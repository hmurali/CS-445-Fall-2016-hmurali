import java.util.Scanner;

public class Consumer {
public String name; // consumer name
public String address; // consumer address
public String zip;
public String phone_number;
public String email; 
public String[] account = {name, address, zip, phone_number, email};
public String[] farmers;
Scanner scan = new Scanner(System.in);
Farmer f = new Farmer();

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
		account[0] = getName();
		account[1] = getAddress();
		account[2] = getZip();
		account[3] = getPhone_number();
		account[4] = getEmail();
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
	
	public void view_farmers(String[] farmers){
		for (int i = 0; i < farmers.length; i++){
			farmers[i] = f.getName();
			System.out.print("Farmers: " + farmers[i]);
		}
	}
}
