package com.fdmgroup.Observer;


/**
 * 
 * Interface Subject: Handle adding, deleting and observing all the Observers 
 *
 */
public interface Subject {
	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObserver();
}
