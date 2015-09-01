/**
 * 
 */
package org.dimigo.abstractclass;

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
		
		SmartPhone[] p = {
				new IPhone("iPhone 6", "애플", 700000),
				new Galaxy("갤럭시 S6", "삼성", 650000)
		};
		
		for(SmartPhone a : p) {
			System.out.println(a.toString());
			a.turnOn();
			a.pay();
			a.useSpecialFunction();
			a.turnOff();
			System.out.println();
		}
	}
}
