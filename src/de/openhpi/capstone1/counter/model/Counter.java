package de.openhpi.capstone1.counter.model;

public class Counter {

	private int count = 0;

	public void updateCount(int value) {
		this.count += value;
	}
	
	public int getCount() {
		return this.count;
	}
}
