/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 * 		|_ Movie
 * 
 * 1. 개요 :		
 * 2. 작성일 :		2015. 9. 22.
 * </pre>
 * 
 * @author :		이찬희
 * @version:		1.0
 *
 */
public class Movie extends Exception {
	private int limitAge;
	private String title;
	
	public Movie() {
	}
	
	public Movie(String title, int limitAge) {
		this.title = title;
		this.limitAge = limitAge;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getLimitAge() {
		return limitAge;
	}
	
}
