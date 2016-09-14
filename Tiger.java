
public class Tiger extends Creature {
	java.lang.String name;
	Tiger t = new Tiger(name);
	public Tiger(java.lang.String name){
		super(name);
		this.name = name;
	}
	
	public void move() {
		System.out.print(super.toString() + "has just pounced.");
	}
	
	public void eat(Thing aThing) {
		System.out.print(name + "has just eaten" + aThing);
	}
	
	public void whatDidYouEat(){
	System.out.print("I ate: " + super.toString()); 
	}
	
}