package lab5.simulator;

public class SequenceOrder {
	
	EventQueue queue;
	
	public SequenceOrder(EventQueue queue) {
		this.queue = queue;
	}
	
	public void orderEvent(Event event) {
		if(queue.getEvents().size() != 0) {
			for(int i = 0; i < queue.getEvents().size(); i++) {
				if(i != queue.getEvents().size()-1) {
					if(queue.getEvents().get(i).time > (event.time)) {
						queue.getEvents().add(i,event);
						break;
					} else {
						queue.getEvents().add(event);
						break;
					}
				}
			}
		} else {
			queue.getEvents().add(event);
		}
	}

}
