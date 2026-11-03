package in.co.rays.inheritance;

public class TestShape {
	public static void main(String[] args) {

		Circle c = new Circle();

		c.setBoderWidth(89);
		c.setColor("red");
		c.setRadius(89);

		System.out.println("Circle color is " + c.getColor());
		System.out.println("Circle border width is " + c.getBoderWidth());
		System.out.println("Circle radius is " + c.getRadius());
		
		System.out.println("-----------------------------------");

		Rectangle r = new Rectangle();

		r.setBoderWidth(90);
		r.setColor("blue");
		r.setLength(90);
		System.out.println("Rectangle color is " + r.getColor());
		System.out.println("Rectangle border width is " + r.getBoderWidth());
		System.out.println("Rectangle length is " + r.getLength());
		System.out.println("-----------------------------------");

		Triangle t = new Triangle();
		t.setBoderWidth(100);
		t.setColor("green");
		t.setBase(100);
		System.out.println("Triangle color is " + t.getColor());
		System.out.println("Triangle border width is " + t.getBoderWidth());
		System.out.println("Triangle base is " + t.getBase());

	}

}
