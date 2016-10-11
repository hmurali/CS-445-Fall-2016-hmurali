import java.util.Scanner;

public class Store {
public String name; // store name
public String address; // store address
public String zip; // store zip code
public String phone_number; // store phone number
Scanner scan = new Scanner(System.in);

	public void setName(String name){
		System.out.print("Please enter name: ");
		name = scan.next();
	}
	
	public String getName(){
		return name; 
	}
	
	public void setAddress(String address){
		System.out.print("Please enter address: " );
		address = scan.next();
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setZip(String zip){
		System.out.print("Please enter zip: ");
		zip = scan.next();
	}
	
	public String getZip(){
		return zip;
	}
	
	public void setPhone_number(String phone_number){
		System.out.print("Please enter phone number: ");
		phone_number = scan.next();
	}
	
	public String getPhone_number(){
		return phone_number;
	}
}
