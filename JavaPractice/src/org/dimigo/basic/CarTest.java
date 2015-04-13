/**
 * 
 */
package org.dimigo.basic;

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
public class CarTest {

	public static void main(String[] args) {
		
		//차 선언
		Car hyundai = new Car();
		Car kia = new Car();
		Car samsung = new Car();
		
		//입력_현기차
		hyundai.setCompany("현대");
		hyundai.setModel("제네시스");
		hyundai.setColor("검정색");
		hyundai.setMaxSpeed(225);
		hyundai.setPrice(50000000);
		
		
		//입력_키야차
		kia.setCompany("기아");
		kia.setModel("K7");
		kia.setColor("흰색");
		kia.setMaxSpeed(246);
		kia.setPrice(40000000);
		
		//입력_쌤숭차
		samsung.setCompany("삼성");
		samsung.setModel("SM7");
		samsung.setColor("회색");
		samsung.setMaxSpeed(200);
		samsung.setPrice(38000000);
		
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
