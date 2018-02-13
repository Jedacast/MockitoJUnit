package com.fdmgroup.Observer;

import java.util.ArrayList;

public class StockGrabber implements Subject{ //our subject interface

	private ArrayList<Observer> observers; // store observers in Arraylist
	
	
	private int ibmPrice;
	private int aaplPrice;
	private int googPrice;
	
public StockGrabber(){
		
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
		
		System.out.println("Observer " + (observerIndex+1) + " has been deleted");
		
		// Removes observer from the ArrayList
		
		observers.remove(observerIndex);
		
	}
	@Override
	public void notifyObserver() {
		
		// Cycle through all observers and notifies them of
		// price changes that occur
		
		for(Observer observer : observers){
			//calls the update method and automatically puts the information in for us
			observer.update(ibmPrice, aaplPrice, googPrice);
			
		}
	}
	
	// Change prices for all stocks and notifies observers of changes
	
	public void setIBMPrice(int newIBMPrice){
		
		this.ibmPrice = newIBMPrice;
		
		notifyObserver();
		
	}
	
	public void setAAPLPrice(int newAAPLPrice){
		
		this.aaplPrice = newAAPLPrice;
		
		notifyObserver();
		
	}

	public void setGOOGPrice(int newGOOGPrice){
	
		this.googPrice = newGOOGPrice;
	
		notifyObserver();
	
	}



}
