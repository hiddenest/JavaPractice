/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 * 		|_ MelonChart
 * 
 * 1. 개요 :		
 * 2. 작성일 :		2015. 9. 23.
 * </pre>
 * 
 * @author :		이찬희
 * @version:		1.0
 *
 */
public class MelonChart {
	public static void main(String[] args) {
		List<Music> l = new ArrayList<Music>();
		l.add(new Music("바람이나 좀 쐐", "개리"));
		l.add(new Music("보통연애", "박경"));
		l.add(new Music("취향저격", "iKON"));
		
		System.out.println("--<< 멜론 차트 >>--");
		printList(l);
		
		System.out.println("--<< 2위 곡 추가 >>--");
		l.add(1, new Music("취향저격", "iKON"));
		printList(l);
		
		System.out.println("--<< 3위 곡 변경 >>--");
		l.set(2, new Music("맙소사", "황태지"));
		printList(l);
		
		System.out.println("--<< 4위 곡 삭제 >>--");
		printList(l);
		l.remove(3);
		
		System.out.println("--<< 전체 리스트 삭제 >>--");
		l.clear();
		
	}
	
	public static void printList(List<Music> list) {
		int i = 0;
		for(Music value : list) {
			System.out.print(i + ". ");
			System.out.println(value);
			i++;
		}
		System.out.println();
	}
}
