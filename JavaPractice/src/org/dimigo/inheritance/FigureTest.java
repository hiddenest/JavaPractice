/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 		|_ FigureTest
 * 
 * 1. 개요 :		
 * 2. 작성일 :		2015. 8. 12.
 * </pre>
 * 
 * @author :		이찬희
 * @version:		1.0
 *
 */
public class FigureTest {
	public static void main(String[] args) {
		//기본선언
		Circle c = new Circle(5);
		Triangle t = new Triangle(10, 10, 5, 8);
		Rectangle r = new Rectangle(20, 20, 5, 8);
		
		//넓이 출력
		System.out.println("원의 넓이 : " + String.format("%.1f",c.calcArea())); //d는 일반 상수고 f는 실수일때 사용하나보다
		System.out.println("삼각형의 넓이 : " + t.calcArea());
		System.out.println("사각형의 넓이 : " + r.calcArea());
		System.out.println();
		
		//중심출력하기
		c.printCenter();
		t.printCenter();
		r.printCenter();
		
		System.out.println("\n--중심좌표 이동 : (x,y축 5씩)\n"); //이동한다
		
		//중심축 이동시키기
		c.moveFigure(5,5);
		t.moveFigure(5,5);
		r.moveFigure(5,5);
		
		c.printCenter();
		t.printCenter();
		r.printCenter();
		
		
	}
}
