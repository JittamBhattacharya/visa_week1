package com.visa.prj.entity;


// abstract because its too generic
// You cannot go to a shop a say I shall buy a product
public abstract class Product implements Comparable<Product>{
	
	private int id;
	private String name;
	private double price;
	
	public Product() {
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	
	/*public boolean isExpensive() {
		return false;
	}*/
	
	public abstract boolean isExpensive();	// pure virtual function
	
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return Double.compare(this.price , o.price);
	}
}
