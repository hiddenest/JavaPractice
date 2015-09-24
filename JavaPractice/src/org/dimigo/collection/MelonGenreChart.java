/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 * 		|_ MelonGenreChart
 * 
 * 1. 개요 :		
 * 2. 작성일 :		2015. 9. 24.
 * </pre>
 * 
 * @author :		이찬희
 * @version:		1.0
 *
 */
public class MelonGenreChart {
	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>();
		List<Music> balad = new ArrayList<Music>();
		balad.add(new Music("내 첫사랑", "베리굿"));
		balad.add(new Music("또 다시 사랑", "임창정"));
		balad.add(new Music("부산에 가면", "박진영"));
		
		List<Music> dance = new ArrayList<Music>();
		dance.add(new Music("커피", "유재환, 김예림"));
		dance.add(new Music("다 잘될거야", "쿨"));
		
		map.put("발라드", balad);
		map.put("댄스", dance);
		
		System.out.println("----- << 멜론 장르별 차트 >> -----");
		printMap(map);
		
		System.out.println("----- << 발라드 3위곡 변경 >> -----");
		balad.set(2, new Music("지우고 지워도", "차수경"));
		printMap(map);
		
		System.out.println("----- << 발라드 1위곡 삭제 >> -----");
		balad.remove(0);
		printMap(map);
		
		System.out.println("----- << 전체 리스트 삭제 >> -----");
		map.clear();
		balad.clear();
		dance.clear();
	}
	
	public static void printMap(Map<String, List<Music>> map) {
		for(Map.Entry<String, List<Music>> entry : map.entrySet()) {
			int i=0;
			System.out.println("[" + entry.getKey() + "]");
			for(Music a : entry.getValue()) {
				System.out.print(++i + ". ");
				System.out.println(a.toString());
			}
			i = 0;
		}
		System.out.println();
		
	}
}
