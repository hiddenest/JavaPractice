/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 		|_ Galaxy
 * 
 * 1. 개요 :		
 * 2. 작성일 :		2015. 8. 25.
 * </pre>
 * 
 * @author :		이찬희
 * @version:		1.0
 *
 */
public class Galaxy extends SmartPhone{
	
	public Galaxy(String model, String company, int price) {
		super(model, company, price);
	}
	
	public void pay() {
		System.out.println("삼성 페이로 결제합니다.");
	}
	
	public void useWirelessCharge() {
		System.out.println("무선 충전 기능을 사용합니다.");
	}
}
