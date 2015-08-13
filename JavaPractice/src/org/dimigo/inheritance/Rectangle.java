/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 		|_ Rectangle
 * 
 * 1. 개요 :		
 * 2. 작성일 :		2015. 8. 12.
 * </pre>
 * 
 * @author :		이찬희
 * @version:		1.0
 *
 */
public class Rectangle extends Figure {
	private int width; //기본선언
	private int height;
	/**
	 * @param width
	 * @param height
	 */
	public Rectangle(int width, int height) { //기본생성자
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY); //슈-퍼 클래스
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea() {
		return width * height; //사각형 넓이는 밑변 * 높이
	}
	
	protected void printCenter() {
		System.out.print("사각형 "); //사각형
		super.printCenter(); //상위클래스에서 뽑아오기
	}
	
	
}
