package com.bridge.impl;

import java.util.concurrent.TimeUnit;

import com.bridge.abs.Vehicle;
import com.bridge.abs.Workshop;

public class AssembleWorkShop extends Workshop{
	public AssembleWorkShop() {
        super();
    }
    @Override
    public void work(Vehicle vehicle) {
        System.out.print("Assembling... ");
        long timeToTake = 200 * vehicle.minWorkTime();
        try {
        TimeUnit.MILLISECONDS.sleep(timeToTake); // Thread.sleep(timeToTake);
        } catch (InterruptedException exp) {
        // nothing to do for now.
        } 
        System.out.printf("(Time taken: %d millis), Done.\n", timeToTake);
    }
}
