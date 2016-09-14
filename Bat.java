
public class Bat extends Creature implements Flyer {
	java.lang.String name;
	Bat b = new Bat(name);
	public Bat(java.lang.String name){
		super(name);
		this.name = name;
	}
	
	public void eat(Thing aThing) {
		System.out.print(name + "has just eaten" + aThing);
	}
	
	public void fly() {
		System.out.print(super.toString() + "is swooping through the dark.");
	}
	
	public void move() {
		boolean canMove = true;
		if(canMove) {
			b.fly();
		}
	}
	
	public void whatDidYouEat(){
	System.out.print("I ate: " + super.toString()); 
	}
}