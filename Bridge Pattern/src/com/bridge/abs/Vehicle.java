package com.bridge.abs;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	protected List<Workshop> workshops = new ArrayList<>();
	
	public Vehicle() {
		super();
	}
	
	public boolean addworkshop(Workshop workshop) {
		return workshops.add(workshop);
	}
	
	public abstract void manufacture();
    public abstract int minWorkTime();
}
