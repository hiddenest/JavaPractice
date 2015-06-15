/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ FamilyMember
 * 
 * 1. 개요 :		
 * 2. 작성일 :		2015. 6. 15.
 * </pre>
 * 
 * @author :		이찬희
 * @version:		1.0
 *
 */
public class FamilyMember {
	private static int memberCnt; //가족 인원받기
	private String memberName; //가족 구분용 변수
	
	public FamilyMember() {
	} //더미 생성자
	
	public FamilyMember(String memberName) {
		super();
		this.memberName = memberName; // 가족 이름 받기
		memberCnt++; //가족 인원 늘리기
	}
	
	public String getMemberName() {
		return memberName; //가족 이름을 넘기기
	}
	
	public static void printMemberCnt() {
		System.out.println("가족 총 인원수 : " + memberCnt + "명\n"); // 가족 몇명인지 출력하기
	}
	
	
}
