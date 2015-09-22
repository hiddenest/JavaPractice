/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 * 		|_ AgeCheckException
 * 
 * 1. 개요 :		
 * 2. 작성일 :		2015. 9. 22.
 * </pre>
 * 
 * @author :		이찬희
 * @version:		1.0
 *
 */
public class AgeCheckException extends Exception{
	public AgeCheckException() {
	}
	
	public AgeCheckException(Movie movie) throws Exception {
		super(movie.getTitle() + "은/는 " + movie.getLimitAge() + "세 이상 관람가입니다.");
	}
}
