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
		
		//차 선언 및 세팅 with this
		Car3 hyundai = new Car3("현대", "제네시스", "검정색", 225, 50000000); 
		Car3 kia = new Car3("기아", "K7", "흰색", 246);
		Car3 samsung = new Car3("삼성", "SM7", "회색");
		

		//출력_현기차
		System.out.println("<< 자동차 목록 >>");
		System.out.println("제조사명 : " + hyundai.getCompany() + "자동차");
		System.out.println("모델명 : " + hyundai.getModel());
		System.out.println("색상 : " + hyundai.getColor());
		System.out.println("최대속도 : " + hyundai.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", hyundai.getPrice()) + "원");
		System.out.println();
		
		//출력_키야차
		System.out.println("<< 자동차 목록 >>");
		System.out.println("제조사명 : " + kia.getCompany() + "자동차");
		System.out.println("모델명 : " + kia.getModel());
		System.out.println("색상 : " + kia.getColor());
		System.out.println("최대속도 : " + kia.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", kia.getPrice()) + "원");
		System.out.println();
		
		//출력_쌤숭차
		System.out.println("<< 자동차 목록 >>");
		System.out.println("제조사명 : " + samsung.getCompany() + "자동차");
		System.out.println("모델명 : " + samsung.getModel());
		System.out.println("색상 : " + samsung.getColor());
		System.out.println("최대속도 : " + samsung.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", samsung.getPrice()) + "원");
		System.out.println();
	}
}
