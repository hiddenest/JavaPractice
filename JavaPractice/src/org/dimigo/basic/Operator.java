package org.dimigo.basic;

public class Operator {
	public static void main(String[] args) {
		
		// 귀찮지만 언제나 그랬든 하는 변수 선언
		double a=9, b=10, h1=5.8, h2=5.4;
		double sq1 = (a+b)*h1/2; //사다리꼴
		double sq2 = a * h2; //평행사변형
		
		//그리고 출력
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + sq1);
		System.out.println("평행사변형 넓이 : " + sq2);
		
		//크기비교
		if (sq1 > sq2)
			System.out.println("\n사다리꼴이 평행사변형 보다 " + (sq1 - sq2) + " 더 큽니다.");
		else
			System.out.println("\n평행사변형이 사다리꼴 보다 " + (sq2 - sq1) + " 더 큽니다.");
	}
}
