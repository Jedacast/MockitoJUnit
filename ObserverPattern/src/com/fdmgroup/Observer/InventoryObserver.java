package com.fdmgroup.Observer;

public class InventoryObserver implements Observer {

	// each observer created is going to monitor all three variables
	private int hellFireFury;
	private int astroPhysicsOnTheGo;
	private int hungryCaterpillar;

	// Static used as a counter
	private static int observerIDTracker = 0;

	// Used to track the observers

	private int observerID;

	// Will hold reference to the StockGrabber object

	private Subject inventoryGrabber;

	public InventoryObserver(Subject inventoryGrabber) {

		// Store the reference to the inventoryGrabber object so
		// I can make calls to its methods
		this.inventoryGrabber = inventoryGrabber;

		// Assign an observer ID and increment the static counter
		observerIDTracker++;
		this.observerID = observerIDTracker;

		// Message notifies user of new observer
		System.out.println("New Observer " + this.observerID);

		// Add the observer to the Subjects ArrayList
		inventoryGrabber.register(this);

	}

	// Called to update all observers

	public void updateInventory(int hellFireFury, int astroPhysicsOnTheGo, int hungryCaterpillar) {

		this.hellFireFury = hellFireFury;
		this.astroPhysicsOnTheGo = astroPhysicsOnTheGo;
		this.hungryCaterpillar = hungryCaterpillar;

		printTheInventory();

	}

	public void printTheInventory() {

		System.out.println("Observer: "+ observerID + "\nHell Fire & Fury Inventory: " + hellFireFury + "\nAstroPysicsOnTheGo Inventory: " + astroPhysicsOnTheGo + "\nHungry Caterpillar Inventory: " + hungryCaterpillar + "\n");

	}

}