package com.fdmgroup.Observer;

/**
 * 
 * Interface Observer: Updates Book Stocks in Inventory
 *
 */
public interface Observer {
	public void updateInventory(int book1, int book2, int book3);
}
