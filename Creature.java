
public abstract class Creature extends Thing {
	public Creature(java.lang.String name){
	name = super.toString(); 
	}
	
	public void eat(Thing aThing){
	System.out.print(super.toString() + "has just eaten" + aThing); 
	}
	
	public abstract void move();
	
	public void whatDidYouEat(){
	System.out.print("I ate: " + super.toString()); 
	}
}