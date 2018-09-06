package de.openhpi.capstone1.counter.view;

import de.openhpi.capstone1.counter.model.Counter;
import processing.core.PApplet;

public abstract class AbstractCounterView extends AbstractView {

	protected Counter counter;

	public AbstractCounterView(PApplet display, Counter counter) {
		super(display);
		this.counter = counter;
	}

}