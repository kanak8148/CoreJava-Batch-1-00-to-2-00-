package in.co.rays.java08;

public class TestLambdaExpression {
	public static void main(String[] args) {

		HelloFunctionalInterface fi = () -> {
			System.out.println("hello lambda expression");
		};

		fi.say();

	}
}
