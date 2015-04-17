/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ carTest
 * 
 * 1. 개요 :		
 * 2. 작성일 :		2015. 4. 13.
 * </pre>
 * 
 * @author :		이찬희
 * @version:		1.0
 *
 */

public class Car3Test {

	public static void main(String[] args) {
		
		//차 선언 및 세팅
		Car3 hyundai = new Car3("현대", "제네시스", "검정색", 225, 50000000); 
		Car3 kia = new Car3("기아", "K7", "흰색", 246);
		Car3 samsung = new Car3("삼성", "SM7", "회색");
		

		//출력
		hyundai.printout();
		kia.printout();
		samsung.printout();
	}
}
