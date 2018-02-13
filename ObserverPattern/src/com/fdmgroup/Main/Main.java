package com.fdmgroup.Main;

import com.fdmgroup.Observer.StockGrabber;
import com.fdmgroup.Observer.StockObserver;

public class Main{
	
	public static void main(String[] args){
		
		// Create the Subject object
		// It will handle updating all observers 
		// as well as deleting and adding them
		
		StockGrabber stockGrabber = new StockGrabber();
		
		// Create an Observer that will be sent updates from Subject
		
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(197);
		stockGrabber.setAAPLPrice(677);
		stockGrabber.setGOOGPrice(676);
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(197);
		stockGrabber.setAAPLPrice(677);
		stockGrabber.setGOOGPrice(676);
		
		// Delete one of the observers
		
		 stockGrabber.unregister(observer2);
		
		stockGrabber.setIBMPrice(197);
		stockGrabber.setAAPLPrice(677);
		stockGrabber.setGOOGPrice(676);
		
	
		
	}
	
}
