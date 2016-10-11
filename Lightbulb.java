package lightbulb;

public class Lightbulb implements Switchable{
	@Override 
	public void turnOn(){
		System.out.println("LightBulb: Bulb turned on..");
	}
	
	@Override
	public void turnOff(){
		System.out.println("LightBulb: Bulb turned off...");
	}
}
