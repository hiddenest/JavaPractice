/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 		|_ Triangle
 * 
 * 1. 개요 :		
 * 2. 작성일 :		2015. 8. 12.
 * </pre>
 * 
 * @author :		이찬희
 * @version:		1.0
 *
 */
public class Triangle extends Figure {
	private int width; //필드선언
	private int height;
	
	public Triangle(int width, int height) { //기본생성자
		this.width = width;
		this.height = height;
	}
	
	public Triangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY); //슈-퍼로 상위클래스에 던짐
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea() {
		return width*height*1/2; //삼각형 공식은 1/2 * 밑변 * 높이
	}
	
	protected void printCenter() {
		System.out.print("삼각형 "); //삼각
		super.printCenter(); //상위 클래스에서 뽑아오기
	}

}
