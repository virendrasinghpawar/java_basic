package com.psl.utility;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.psl.beans.Customer;
import com.psl.beans.OrderItem;
import com.psl.beans.PurchaseOrder;
import com.psl.beans.StockItem;

public class PurchaseOrderManagerImpl implements PurchaseOrderManager{

	@Override
	public List<Customer> populateCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StockItem> populateStoreItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createOrder(int cust_id, ArrayList<OrderItem> OrderedItems,
			Date ship_date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void storePurchaseOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shipOrders(int cust_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Void removeExpiredItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void showItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void applyDiscountOnItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Customer, ArrayList<PurchaseOrder>> getOrdersByCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void displayDiscountedItemsList() {
		// TODO Auto-generated method stub
		return null;
	}

}
