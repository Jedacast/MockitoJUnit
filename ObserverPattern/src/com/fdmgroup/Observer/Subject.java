package com.fdmgroup.Observer;


/**
 * 
 * Interface Subject: Handle adding, deleting and observing all the Observers 
 *
 */
public interface Subject {
	void register(Observer o);
	void unregister(Observer o);
	void notifyObserver();
}
