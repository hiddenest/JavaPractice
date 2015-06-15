/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ PiggyBank
 * 
 * 1. 개요 :		
 * 2. 작성일 :		2015. 6. 15.
 * </pre>
 * 
 * @author :		이찬희
 * @version:		1.0
 *
 */
public class PiggyBank {
	private static int balance; // 돼지저금통 총 금액
	
	public static void putMoney(FamilyMember member, int amount) {
		balance += amount; // 총 금액 계속해서 더해주고
		System.out.println(member.getMemberName() + " " + amount + "원 넣음"); // 누가 얼마 넣었는지 찍어주고
	}
	
	public static void steelMoney(FamilyMember member, int amount) {
		if(balance < 0) {
			System.out.println("돈이 부족합니다 -_-;;"); //돈없으면 빼갈것도 없고
		} else {
			balance -= amount; //돈 빼감
			System.out.println(member.getMemberName() + " " + amount + "원 빼감"); //나쁜놈
		}
	}
	
	public static void printBalance() {
		System.out.println("돼지저금통 총 금액 : " + balance +  "원\n"); // 총 얼마나 들어있는지 보여줌
	}
}
