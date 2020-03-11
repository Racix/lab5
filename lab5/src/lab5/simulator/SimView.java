package lab5.simulator;

import java.util.Observer;

public abstract class SimView implements Observer{
	
	SimState state;
	
	public SimView(SimState state) {
		this.state = state;
	}
	
	public abstract void startPrint();
	
	public abstract void lastPrint();

}
