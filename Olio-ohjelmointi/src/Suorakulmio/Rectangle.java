package Suorakulmio;

public class Rectangle {

	private float length = 1.0f;
	private float width = 1.0f;
	
	// konstruktori
	public Rectangle() {
		length = 0;
		width = 0;
	}
	//konstruktori
	public Rectangle(float length, float width) {
		//super(); ei tarvitse, mutta on vastaava kuin this. super() viittaa yliluokkaan.
		this.length = length;
		this.width = width;
	}
	public float getLength() {
		return this.length;
	}
	public void setLength(float uusiLength) {
		this.length = uusiLength;
	}
	public float getWidth() {
		return this.width;
	}
	public void setWeight(float uusiWidth) {
		this.width = uusiWidth;
	}
	public double getArea() {
		//return getLength() * getWidth();
		return length * width;
	}
	public double getPerimeter() {
		//return (getLength() * 2) + (getWidth() * 2);
		return length + length + width + width;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
}
