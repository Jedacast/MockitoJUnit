package com.fdmgroup.Observer;

public class StockObserver implements Observer {
	
	//each observer created is going to monitor all three variables
	private int ibmPrice;
	private int aaplPrice;
	private int googPrice;
	
	// Static used as a counter
	private static int observerIDTracker = 0;
	
	// Used to track the observers
	
	private int observerID;
	
	// Will hold reference to the StockGrabber object
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber){
		
		// Store the reference to the stockGrabber object so
		// I can make calls to its methods
		this.stockGrabber = stockGrabber;
		
		// Assign an observer ID and increment the static counter
		observerIDTracker++;
		this.observerID = observerIDTracker;
		
		// Message notifies user of new observer
		System.out.println("New Observer " + this.observerID);
		
		// Add the observer to the Subjects ArrayList
		stockGrabber.register(this);
		
	}
	
	// Called to update all observers
	
	public void update(int ibmPrice, int aaplPrice, int googPrice) {
		
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		
		printThePrices();
		
	}
	
	public void printThePrices(){
		
		System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " + 
				aaplPrice + "\nGOOG: " + googPrice + "\n");
		
	}
	
}