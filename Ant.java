
public class Ant extends Creature {
	java.lang.String name;
	Ant a = new Ant(name);
	public Ant(java.lang.String name) {
		super(name);
		this.name = name;
	}
	
	public void move() {
	System.out.print(super.toString() + "is crawling around.");
	}
	
	public void eat(Thing aThing) {
		System.out.print(name + "has just eaten" + aThing);
	}
	
	public void whatDidYouEat(){
	System.out.print("I ate: " + super.toString()); 
	}
}