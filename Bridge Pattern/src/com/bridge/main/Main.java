package com.bridge.main;

import com.bridge.abs.Vehicle;
import com.bridge.impl.AssembleWorkShop;
import com.bridge.impl.PaintWorkShop;
import com.bridge.impl.ProduceWorkShop;
import com.bridge.impl.RepairWorkShop;
import com.bridge.impl.TestWorkShop;
import com.bridge.vehicles.Bike;
import com.bridge.vehicles.Bus;
import com.bridge.vehicles.Car;

public class Main {
    public static void main(String[] args) {
          Vehicle bike = new Bike();
          bike.addworkshop(new ProduceWorkShop());
          bike.addworkshop(new AssembleWorkShop());
          bike.addworkshop(new TestWorkShop());
          bike.manufacture();
          Vehicle car = new Car();
          car.addworkshop(new ProduceWorkShop());
          car.addworkshop(new AssembleWorkShop());
          car.addworkshop(new PaintWorkShop());
          car.addworkshop(new TestWorkShop());
          car.manufacture();
          Vehicle bus = new Bus();
          bus.addworkshop(new RepairWorkShop());
          bus.addworkshop(new AssembleWorkShop());
          bus.addworkshop(new TestWorkShop());
          bus.manufacture();
    }
}