package Suorakulmio;

public class Testi {
	public static void main(String[] args) {
		
		Rectangle s1 = new Rectangle();
		Rectangle s2 = new Rectangle(40, 100);
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.getArea());
		System.out.println(s2.getPerimeter());
	}
}
