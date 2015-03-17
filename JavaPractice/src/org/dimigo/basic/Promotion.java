package org.dimigo.basic;

public class Promotion {
	public static void main(String[] args) {
		
		int montly_Pay = 1700000;
		int workers = 3;
		int shop = 1500;
		long yearly_Pay = (long)montly_Pay * 12 * (long)workers * (long)shop;
		
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", montly_Pay) + "원");
		System.out.println("점포 내 직원수 : " + workers + "명");
		System.out.println("점포 수 : " + String.format("%,d", shop) + "개");
		System.out.println("");
		System.out.println("연간 인건비 : "+ String.format("%,d", yearly_Pay) + "원");
	}
}
