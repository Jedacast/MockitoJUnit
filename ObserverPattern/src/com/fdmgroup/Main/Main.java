package com.fdmgroup.Main;

import com.fdmgroup.Observer.InventoryGrabber;
import com.fdmgroup.Observer.InventoryObserver;


public class Main {

	public static void main(String[] args) {

		// Create the Subject object
		// It will handle updating all observers
		// as well as deleting and adding them
		InventoryGrabber inventoryGrabber = new InventoryGrabber();

		// Create an Observer that will be sent updates from Subject
		InventoryObserver observer1 = new InventoryObserver(inventoryGrabber);

		inventoryGrabber.setHellFireFury(1);
		inventoryGrabber.soldHellFireFury();
		inventoryGrabber.setAstroPhysicsOnTheGo(20);
		inventoryGrabber.setHungryCaterpillar(10);

		//Create a 2nd Observer
		InventoryObserver observer2 = new InventoryObserver(inventoryGrabber);

		inventoryGrabber.setHellFireFury(53);
		inventoryGrabber.setAstroPhysicsOnTheGo(8);
		inventoryGrabber.setHungryCaterpillar(15);

		// Delete one of the observers
		inventoryGrabber.unregister(observer2);

		inventoryGrabber.setHellFireFury(3);
		inventoryGrabber.setAstroPhysicsOnTheGo(5);
		inventoryGrabber.setHungryCaterpillar(20);

	}

}
