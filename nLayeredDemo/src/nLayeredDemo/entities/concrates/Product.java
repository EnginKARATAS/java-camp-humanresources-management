package nLayeredDemo.entities.concrates;

import nLayeredDemo.entities.abstracts.Entity;

public class Product implements Entity {
	private int id;
	private String name;
	private int CategoryId;
	private double price;
	private int unitsInStocks;
	
	public Product(){}

	public Product(int id, int categoryId, String name, double price, int unitsInStocks) {
		super();
		this.id = id;
		this.name = name;
		CategoryId = categoryId;
		this.price = price;
		this.unitsInStocks = unitsInStocks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCategory() {
		return CategoryId;
	}

	public void setCategory(int category) {
		CategoryId = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getUnitsInStocks() {
		return unitsInStocks;
	}

	public void setUnitsInStocks(int unitsInStocks) {
		this.unitsInStocks = unitsInStocks;
	}
}
