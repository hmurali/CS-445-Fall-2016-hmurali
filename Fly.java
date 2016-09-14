
public class Fly extends Creature implements Flyer{
	java.lang.String name;
	Fly f = new Fly(name);
	public Fly(java.lang.String name) {
		super(name);
		this.name = name;
	}
	
	public void eat(Thing aThing) {
		System.out.print(name + "has just eaten" + aThing);
	}
	
	public void fly() {
		System.out.print(super.toString() + "is buzzing around in flight.");
	}
	
	public void move() {
		boolean canMove = true;
		if(canMove) {
			f.fly();
		}
	}
	
	public void whatDidYouEat(){
	System.out.print("I ate: " + super.toString()); 
	}
}
	