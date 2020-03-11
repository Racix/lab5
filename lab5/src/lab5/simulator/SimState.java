package lab5.simulator;

import java.util.Observable;

public class SimState extends Observable{
	
	private static boolean ON = true;
	
	public boolean isON() {
		return ON;
	}
	
	public void setON2(boolean onOff) {
		ON = onOff;
	}
	
	public void observable(Event event){
		setChanged();
		notifyObservers(event);
	}

}
