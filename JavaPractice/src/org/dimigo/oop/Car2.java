/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.basic
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
public class Car2 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car2(String nCompany, String nModel, String nColor, int nMaxSpeed, int nPrice) {
		company = nCompany;
		model = nModel;
		color = nColor;
		maxSpeed = nMaxSpeed;
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
