/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 * 		|_ Runner
 * 
 * 1. 개요 :		
 * 2. 작성일 :		2015. 11. 4.
 * </pre>
 * 
 * @author :		이찬희
 * @version:		1.0
 *
 */
public class Runner2 implements Runnable {
	private String name;
	
	public Runner2() {
		
	}
	
	public Runner2(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		int n = 100;
		System.out.println(name + " 출발");
		while (n != 0) {
			System.out.println(name + " " + n +  " 미터");
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				e.printStackTrace();
			}
			n -= 10;
			
		}
		System.out.println(name + " 도착");
	}
	
}
