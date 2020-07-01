package com.bridge.impl;


import java.util.concurrent.TimeUnit;

import com.bridge.abs.Vehicle;
import com.bridge.abs.Workshop;
public class PaintWorkShop extends Workshop {
    public PaintWorkShop() {
    super();
    }
    @Override
    public void work(Vehicle vehicle) {
          System.out.print("Painting... ");
          long timeToTake = 100 * vehicle.minWorkTime();
          try {
          TimeUnit.MILLISECONDS.sleep(timeToTake); // Thread.sleep(timeToTake);
          } catch (InterruptedException exp) {
          // nothing to do for now.
          } 
          System.out.printf("(Time taken: %d millis), Done.\n", timeToTake);
    }
}
