package com.fdmgroup.Observer;

import java.util.ArrayList;

public class InventoryGrabber implements Subject { 

	private ArrayList<Observer> observers; // store observers in Arraylist

	private int hellFireFury;
	private int astroPhysicsOnTheGo;
	private int hungryCaterpillar;

	public InventoryGrabber() {

		// Creates an ArrayList to hold all observers

		observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer newObserver) {

		// Adds a new observer to the ArrayList

		observers.add(newObserver);

	}

	/**
	 * 
	 */
	@Override
	public void unregister(Observer deleteObserver) {

		// Get the index of the observer to delete

		int observerIndex = observers.indexOf(deleteObserver);

		// Print out message (Have to increment index to match)

		System.out.println("Observer " + (observerIndex + 1) + " has been deleted");

		// Removes observer from the ArrayList

		observers.remove(observerIndex);

	}

	@Override
	public void notifyObserver() {

		// Cycle through all observers and notifies them of
		// price changes that occur

		for (Observer observer : observers) {
			// calls the update method and automatically puts the information in
			// for us
			observer.updateInventory(hellFireFury, astroPhysicsOnTheGo, hungryCaterpillar);

		}
	}

	// Change prices for all stocks and notifies observers of changes

	public void setHellFireFury(int newHellFireFury) {

		this.hellFireFury = newHellFireFury;

		notifyObserver();

	}
	
	public void soldHellFireFury() {

		this.hellFireFury--;

		notifyObserver();

	}

	public void setAstroPhysicsOnTheGo(int newAstroPhysicsOnTheGo) {

		this.astroPhysicsOnTheGo = newAstroPhysicsOnTheGo;

		notifyObserver();

	}

	public void setHungryCaterpillar(int newHungryCaterpillar) {

		this.hungryCaterpillar = newHungryCaterpillar;

		notifyObserver();

	}

}
