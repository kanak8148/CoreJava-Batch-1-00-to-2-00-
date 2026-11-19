package in.co.rays.constructor;

public class Shape {

	private String colour;
	private int boderWidth;

	public Shape() {
		System.out.println("Default constructor");
	}

	public Shape(String colour, int boderWidth) {

		this.colour = colour;
		this.boderWidth = boderWidth;
	}

	public String getColour() {
		return colour;
	}

	public int getBoderWidth() {
		return boderWidth;
	} 
}
