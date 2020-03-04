package lab5.simulator;

/**
 * Abstract class that is extended by each each event.
 * 
 * @author Abboshon Hamraliev
 */
public abstract class Event {
	
	public double time;
		
	public abstract void Execute(SortedOrder SortedSequence,State state);
}