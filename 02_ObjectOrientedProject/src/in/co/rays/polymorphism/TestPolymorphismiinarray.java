package in.co.rays.polymorphism;

public class TestPolymorphismiinarray {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];
		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();

		Circle c = (Circle) s[0];

		c.setRadius(9);
		Rectangle r = (Rectangle) s[1];
		r.setLength(7);
		r.setWidth(7);

		Triangle t = (Triangle) s[2];
		t.setBase(9);
		t.setHeight(9);
		
		
		for (int i = 0; i < s.length; i++) {
			
			s[i].area();
			System.out.println("=========================");
			
		}


	}

}
