/**
 * 
 */
package org.dimigo.oop;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ Score
 * 
 * 1. 개요 :		
 * 2. 작성일 :		2015. 5. 12.
 * </pre>
 * 
 * @author :		이찬희
 * @version:		1.0
 *
 */
public class Score {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		
		System.out.println("수학 점수 입력 => ");
		int math = scanner.nextInt();
		
		System.out.println("영어 점수 입력 =>");
		int eng = scanner.nextInt();
		
		int total = kor + eng + math;
		float avg = total/3;
		
		StringBuilder sb = new StringBuilder("<<점수 출력>>\n\n")
					.append("국어 점수 : ").append(kor + "점\n")
					.append("수학 점수 : ").append(math + "점\n")
					.append("영어 점수 : ").append(eng + "점\n")
					.append("총점 : ").append(total + "점\n")
					.append("평균 : ").append(String.format("%.1f", avg) + "점\n");
		System.out.println(sb.toString());
		scanner.close();
		
		
		
	}
}
