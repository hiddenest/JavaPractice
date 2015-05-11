/**
 * 
 */
package org.dimigo.oop;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ Question
 * 
 * 1. 개요 :		
 * 2. 작성일 :		2015. 5. 11.
 * </pre>
 * 
 * @author :		이찬희
 * @version:		1.0
 *
 */
public class Question {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가장 좋아하는 EDM 아티스트는?");
		String answer = scanner.nextLine();
		if ("Madeon".equalsIgnoreCase(answer)) {
			System.out.println("정답입니다!! ^^");
		}
		else {
			System.out.println("틀렸습니다!! ㅠㅠ");
		}
		System.out.println();
		
		System.out.println("느린데 많이는 쓰이는 언어는?");
		String answer2 = scanner.nextLine();
		if ("루비".equals(answer2) || "Ruby".equalsIgnoreCase(answer2)) {
			System.out.println("정답입니다!! ^^");
		}
		else {
			System.out.println("틀렸습니다!! ㅠㅠ");
		}
		System.out.println();
		
		System.out.println("가장 좋아하는 음식은?");
		String answer3 = scanner.nextLine();
		if ("치킨".equals(answer3) || "Chicken".equalsIgnoreCase(answer3)) {
			System.out.println("정답입니다!! ^^");
		}
		else {
			System.out.println("틀렸습니다!! ㅠㅠ");
		}
		
		scanner.close();
	}
}
