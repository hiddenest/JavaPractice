/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 * 		|_ Race
 * 
 * 1. 개요 :		
 * 2. 작성일 :		2015. 11. 4.
 * </pre>
 * 
 * @author :		이찬희
 * @version:		1.0
 *
 */
public class Race2 {
	public static void main(String[] args) {
		System.out.println("main thread start");
		Thread r1 = new Thread(new Runner2("정욱재"));
		Thread r2 = new Thread(new Runner2("이어진"));
		
		//우선순위 지정할 수는 있음
		//MAX_PRIORITY(10), NORM_PRIORITY(5), MIN_PRIORITY(1)
		r2.setPriority(Thread.MAX_PRIORITY);
		r1.setPriority(Thread.MIN_PRIORITY);
		
		r1.start();
		r2.start();
		
		System.out.println("main thread end");
	}
}
