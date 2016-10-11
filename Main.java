package button;

import java.awt.Button;

public class Main {
Button b = new Button();
Button pushdownbutton = new Button();
public boolean switchedOn;
public boolean switchedOff;
public boolean isOn;
public boolean isOff;

	public Button switchOn(){
		if (switchedOn == true){
			on();
			System.out.print("Button is swtiched to ON");
		}
		return b;
	}
	
	public Button switchOff(){
		if (switchedOff == true){
			off();
			System.out.print("Button is switched to OFF");
		}
		return b;
	}
	
	public void pushButton(){
		on();
		if (isOff == true){
			System.out.print("Button is switched to ON");
		} else if (isOn == true){
			System.out.print("Button is switched to OFF");
		}
	}
	
	public void on(){
		if(isOff == true){
			switchOn();
		}
	}
	
	public void off(){
		if(isOn == true){
			switchOff();
		}
	}
}
