/*
 * << 첫번째 수행평가 과제 >>
 * 내용 : 아이유 프로필 출력하기
 * 작성일자 : 2015. 03. 13
 * @author 이찬희
 * @version 1.0
 */

package org.dimigo.basic;

public class PrimitiveDataType {
	public static void main(String[] args) {
		
		// 맘같아선 그냥 출력하고 싶지만 그럴수가 없어 선언하는 변수들
		String name = "아이유";
		boolean gender = false;
		int age = 23;
		double height = 161.8d;
		float weight = 44.3f;
		char bloodtype = 'A';
		
		//그리고 출력
		
		System.out.println("<< 아이유 프로필 >>");
		System.out.println("이름 : " + name);
		
		System.out.print("성별 : ");
		if (!gender) System.out.println("여자");
		else System.out.println("남자");
		
		System.out.println("나이 : " + age + "세");
		System.out.println("키 : " + height + "cm");
		System.out.println("몸무게 : " + weight + "kg");
		System.out.println("혈액형 : " + bloodtype + "형");
	}
}
