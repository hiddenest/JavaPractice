/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ PiggyBankTest
 * 
 * 1. 개요 :		
 * 2. 작성일 :		2015. 6. 15.
 * </pre>
 * 
 * @author :		이찬희
 * @version:		1.0
 *
 */
public class PiggyBankTest {
	public static void main(String[] args) {
		FamilyMember father = new FamilyMember("아빠"); // 아빠용
		FamilyMember mother = new FamilyMember("엄마"); //엄마용
		FamilyMember me = new FamilyMember("나"); //개인용
		FamilyMember ybrother = new FamilyMember("남동생"); //동생용

		FamilyMember.printMemberCnt(); //몇명인지 찍고
		PiggyBank.putMoney(father, 10000); //아빠가 만원넣고
		PiggyBank.putMoney(mother, 5000); //엄마가 오천원넣고
		PiggyBank.putMoney(me, 2000); // 내가 이천원넣고
		PiggyBank.putMoney(ybrother, 1000); //동생이 천원넣고
		
		PiggyBank.printBalance(); //출력 찍고
	
		PiggyBank.putMoney(me, 1000); //내가 천원 또 넣고
		PiggyBank.printBalance(); //다시 출력 찍고
	}
}
