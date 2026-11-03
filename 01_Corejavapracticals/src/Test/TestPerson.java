package Test;

public class TestPerson {
public static void main(String[]args) {
	Person p1 = new Student();
	System.out.println(p1.getName());
	System.out.println(p1.age());
	System.out.println("--------------------");
	
	Person p2 = new Teacher();
	System.out.println(p2.getName());
	System.out.println(p2.age());
	System.out.println("-------------");
	}
}

