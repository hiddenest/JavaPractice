/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.basic
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
public class Car2Test {

	public static void main(String[] args) {
		
		//차 선언 및 세팅
		Car2 hyundai = new Car2("현대", "제네시스", "검정색", 225, 50000000); 
		Car2 kia = new Car2("기아", "K7", "흰색", 246, 40000000);
		Car2 samsung = new Car2("삼성", "SM7", "회색", 200, 38000000);
		

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
