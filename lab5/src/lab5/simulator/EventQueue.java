package lab5.simulator;

import java.util.ArrayList;

public class EventQueue {
	
	ArrayList<Event> EQ = new ArrayList<Event>();
	
	public ArrayList<Event> getEvents() {
		return EQ;
	}
	
	public void addEvent(Event event) {
		EQ.add(event);
	}
	
	public Event getFEvent() {
		Event fEvent = EQ.get(0);
		EQ.remove(0);
		return fEvent;
	}

}
