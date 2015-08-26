/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 		|_ SmartPhoneTest
 * 
 * 1. 개요 :		
 * 2. 작성일 :		2015. 8. 25.
 * </pre>
 * 
 * @author :		이찬희
 * @version:		1.0
 *
 */
public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone i = new IPhone("iPhone 6", "애플", 700000); //사과
		SmartPhone g = new Galaxy("갤럭시 S6", "삼성", 650000); //샘숭
		
		System.out.println(i.toString()); //일단 출력
		i.turnOn(); //켜고
		i.pay(); //애플페이
		i.useSpecialFunction(); //에어드롭
		i.turnOff(); //끄고
		
		System.out.println();
		
		System.out.println(g.toString()); //출력
		g.turnOn(); //켜고
		g.pay(); //삼성페이(?)
		g.useSpecialFunction(); //무선충전(?)
		g.turnOff(); //끄고
	}
}
