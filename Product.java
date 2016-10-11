import java.util.Scanner; 

public class Product {
public String product_type;
public String product_price;
public String product_name;
Scanner scan = new Scanner(System.in); 

	public void setProduct_type(String product_type){
		System.out.print("Please enter product type: ");
		product_type = scan.next();
	}
	
	public String getProduct_type(){
		return product_type;
	}
	
	public void setProduct_price(String product_price){
		System.out.print("Please enter product price: ");
		product_price = scan.next();
	}
	
	public String getProduct_price(){
		return product_price;
	}
	
	public void setProduct_name(String product_name){
		System.out.print("Please enter product name: ");
		product_name = scan.next();
	}
	
	public String getProduct_name(){
		return product_name;
	}
	
	public String updateProduct_type(String product_type){
		setProduct_type(product_type);
		this.product_type = product_type;
		return this.product_type;
	}
	
	public String updateProduct_price(String product_price){
		setProduct_price(product_price);
		this.product_price = product_price;
		return this.product_price;
	}
	
	public String updateProduct_name(String product_name){
		setProduct_name(product_name);
		this.product_name = product_name;
		return this.product_name;
	}
	
}
