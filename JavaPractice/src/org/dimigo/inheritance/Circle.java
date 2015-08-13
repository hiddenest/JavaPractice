/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 		|_ Circle
 * 
 * 1. 개요 :		
 * 2. 작성일 :		2015. 8. 12.
 * </pre>
 * 
 * @author :		이찬희
 * @version:		1.0
 *
 */
public class Circle extends Figure {
	private int radius; //기본선언
	
	public Circle(int radius) { //기본생성자
		this.radius = radius;
	}
	
	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY); //슈-퍼 클래스
		this.radius = radius;
	}
	
	protected double calcArea() {
		return (radius*radius*Math.PI); //원 넓이는 (반지름)^2 * PI
	}
	
	protected void printCenter() {
		System.out.print("원 "); //원
		super.printCenter(); //상위클래스에서 뽑아옴
	}
}
