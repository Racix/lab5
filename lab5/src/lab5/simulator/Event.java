package lab5.simulator;

/**
 * Abstract class that is extended by each each event.
 * 
 * @author Abboshon Hamraliev
 */
public abstract class Event {
	
	public double time;
		
	public abstract void Execute(SequenceOrder order,SimState state);
}