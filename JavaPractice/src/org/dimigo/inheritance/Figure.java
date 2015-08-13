/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 		|_ Figure
 * 
 * 1. 개요 :		
 * 2. 작성일 :		2015. 8. 12.
 * </pre>
 * 
 * @author :		이찬희
 * @version:		1.0
 *
 */
public class Figure {
	private int centerX = 0; //기본선언
	private int centerY = 0;
	/**
	 * @param centerX
	 * @param centerY
	 */
	
	public Figure() { //기본생성자
	}
	
	public Figure(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected double calcArea() { //더미용 함수
		return 0;
		
	}
	
	protected void printCenter() { //중심좌표 출력함수
		System.out.println("중심좌표 : (" + centerX + ", " + centerY + ")");
	}
	
	protected void moveFigure(int x, int y) { //중심좌표 이동함수
		centerX += x;
		centerY += y;
	}
}
