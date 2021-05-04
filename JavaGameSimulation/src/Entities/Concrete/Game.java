package Entities.Concrete;

import Entities.Abstract.Entity;

public class Game implements Entity  {

	private int id;
	private String name;
	private double price;
	private double discount;
	private double campaignPrice;
	
	public Game() {
		
	}

	public Game(int id, String name, double price, double discount) {
		this();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
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

	public double getDiscount() {
		return (getPrice()*getDiscount());
	}
}
