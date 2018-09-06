package de.openhpi.capstone1.counter.builder;

import de.openhpi.capstone1.counter.controller.CounterControllerStrategy;
import de.openhpi.capstone1.counter.model.Counter;
import de.openhpi.capstone1.counter.view.AbstractView;
import de.openhpi.capstone1.counter.view.CounterViewColor;
import de.openhpi.capstone1.counter.view.CounterViewMove;
import de.openhpi.capstone1.counter.view.CounterViewNumber;
import processing.core.PApplet;

public class InteractiveCounter extends InteractiveComponent {
	CounterControllerStrategy counterControllerStrategy;
	Counter counter;
	
	public InteractiveCounter() {}
	
	public void addModel() {
		counter = new Counter();
	}
	
	public void createViews(PApplet applet) {
		views = new AbstractView[3];
		views[0] = new CounterViewMove(applet, counter);
		views[1] = new CounterViewColor(applet, counter);
		views[2] = new CounterViewNumber(applet, counter);
	}
	
	public void addController() {
		counterControllerStrategy = new CounterControllerStrategy(counter);
	}
	
	@Override
	public void handleEvent() {
		counterControllerStrategy.handleEvent();
	}
}
