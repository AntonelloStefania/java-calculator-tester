package org.lessons.java.calculator.ticket;

public class Ticket {
	static final double PRICE = 21;
	private int finalPrice = 0;
	private int age;
	private int km;
	
	public Ticket(int age, int km) throws Exception {
		setAge(age);
		setKm(km);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception {
		if(age < 0) {
			throw new Exception("age must be >= 0");
		}
		this.age = age;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) throws Exception {
		if(km <= 0) {
			throw new Exception("km must be > 0");
		}
		this.km = km;
	}
	public int getPrice() {
		double fullPrice = getKm() * (PRICE / 100); 
		return (int) fullPrice;  
	}
	
	public double getDiscountedPrice() {
	        double discount = 0;

	        if (getAge() < 18) {
	            discount = getPrice() * 0.20;
	        } else if (getAge() > 65) {
	            discount = getPrice() * 0.40;
	        }

	        return getPrice() - discount;
	    }
}

