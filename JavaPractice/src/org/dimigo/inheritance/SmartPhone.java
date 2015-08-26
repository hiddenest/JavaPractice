/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 		|_ SmartPhone
 * 
 * 1. 개요 :		
 * 2. 작성일 :		2015. 8. 25.
 * </pre>
 * 
 * @author :		이찬희
 * @version:		1.0
 *
 */
public class SmartPhone {
	private String model; //모델
	private String company; //제조사
	private int price; //가격
	
	public SmartPhone() { //더미생성자
	}

	public SmartPhone(String model, String company, int price) {
		super();
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn() {
		System.out.println(model + "의 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println(model + "의 전원을 끕니다.");
	}
	
	public void pay() { //어차피 오버라이딩할꺼니까 비워놓고
	}
	
	/*
	public void useSpecialFunction(SmartPhone phone) {
		if (phone == null) {
			return ; //널체크
		}
		else if (phone instanceof Galaxy) {
			Galaxy g = (Galaxy) phone; //캐스팅
			g.useWirelessCharge();
		}
		else {
			IPhone i = (IPhone) phone; //캐스팅
			i.useAirDrop();
		}
	}
	*/
	
	public void useSpecialFunction() {
		if(this instanceof Galaxy) {
			Galaxy g = (Galaxy) this; //캐스팅
			g.useWirelessCharge();
		}
		else {
			IPhone i = (IPhone) this; //캐스팅
			i.useAirDrop();
		}
	}
	
	public String toString() {
		String output = new String("모델명 : " + model + ", 제조사 : " + company + ", 가격 : "); //StringBuilder 쓸걸
		output += String.format("%,1d", price) + "원";
		
		return output;
	}
	
	
}
