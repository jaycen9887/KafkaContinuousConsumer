package com.kafka.models;

public class Menu {

	private String itemName;
	private String itemDescription;
	private String itemPrice;
	private String itemQuantity;
	private String itemCategory;

	public String getItemName() {
		return itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public String getItemQuantity() {
		return itemQuantity;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	@Override
	public String toString() {
		return "Item Name: " + this.itemName + " Item Description: " + this.itemDescription + ": Item Price: "
				+ this.itemPrice + " Item Quantity: " + this.itemQuantity + " Item Category: " + this.itemCategory;
	}
}
