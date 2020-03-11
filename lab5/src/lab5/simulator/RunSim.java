package lab5.simulator;

public class RunSim {
	private SequenceOrder order;
	private SimState state;
	private SimView view;
	private EventQueue queue;
	
	public RunSim(SimState state, SequenceOrder order, EventQueue queue, SimView view) {
		this.state = state;
		this.order = order;
		this.queue = queue;
		this.view = view;
	}
	
	public void run() {
		view.startPrint();
		while(state.isON()) {
			Event thisEvent = queue.getFEvent();
			thisEvent.Execute(order,state);
		}
		view.lastPrint();
	}
	

}
