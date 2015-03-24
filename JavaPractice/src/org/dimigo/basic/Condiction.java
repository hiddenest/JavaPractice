package org.dimigo.basic;

public class Condiction {
	public static void main(String[] args) {
		int distance = 15;
		int defaultCharge = 0;
		String transportation = "고속버스";
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + transportation);
		
		switch(transportation) {
		case "고속버스":
			defaultCharge = 850 + ((distance-1) / 10 * 300);
			break;
		case "경차":
			defaultCharge = 300 + ((distance-1) / 10 * 200);
			break;
		default:
			defaultCharge = 600 + ((distance-1) / 10 * 200);
			break;
		}
		
		System.out.println("통행료 : " + defaultCharge +"원");
	}
}