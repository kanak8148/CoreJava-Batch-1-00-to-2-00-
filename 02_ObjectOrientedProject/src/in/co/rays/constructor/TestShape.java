package in.co.rays.constructor;

public class TestShape {
	
	public static void main(String[] args) {
		
		Shape s = new Shape ();
		
		Shape s1 = new Shape ("Red", 5);
		
		System.out.println(s1.getColour());
		System.out.println(s1.getBoderWidth());
		

		
		
	}

}
