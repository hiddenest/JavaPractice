/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ Car
 * 
 * 1. 개요 :		
 * 2. 작성일 :		2015. 4. 10.
 * </pre>
 * 
 * @author :		이찬희
 * @version:		1.0
 *
 */
public class Car {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public void setCompany(String nCompany) {
		company = nCompany; 
	}
	
	public void setModel(String nModel) {
		model = nModel;
	}
	
	public void setColor(String nColor) {
		color = nColor;
	}
	
	public void setMaxSpeed(int nMaxSpeed) {
		maxSpeed = nMaxSpeed;
	}
	
	public void setPrice(int nPrice) {
		price = nPrice;
	}
	
	public String getCompany() {
		return company;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public int getPrice() {
		return price;
	}
	
}
