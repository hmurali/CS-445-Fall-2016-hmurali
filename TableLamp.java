package button;

public class TableLamp {
TableLamp lamp = new TableLamp();
public boolean switchedOn;
public boolean switchedOff;
public boolean isOn;
public boolean isOff;

	public TableLamp switchOn(){
		if (switchedOn == true){
			on();
			System.out.print("Table lamp is swithed to ON");
		}
		return lamp;
	}
	
	public TableLamp switchOff(){
		if (switchedOff == true){
			off();
			System.out.print("Table lamp is switched to OFF");
		}
		return lamp;
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
