package com.fdmgroup.Observer;


/**
 * 
 * Interface Observer: Updates Book Stocks in Inventory
 *
 */
public interface Observer {
	public void update(int ibmPrice, int aaplPrice, int googPrice);
}
