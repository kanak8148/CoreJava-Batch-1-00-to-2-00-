package in.co.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
	public static void main(String[] args) {

		List s = new ArrayList();

		s.add(0, 10);
		s.add(1, 2);
		s.add(2, "Ram");
		s.add(3, 2);
		s.add(4, 4.6);
		s.add(5, null);
		
		
		
		System.out.println(s.get(0));
		System.out.println(s.remove(3));
		System.out.println(s);
		System.out.println(s.set(0, "Hello"));
		System.out.println(s);
		
		

	}
}