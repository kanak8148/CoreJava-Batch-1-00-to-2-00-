package in.co.rays.uncheckedexception;

public class TestUnCheckedExcpetion {

	public static void main(String[] args) {

		dad();

	}

	private static void dad() {

		try {
			mom();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void mom() {
		son();

	}

	private static void son() {
		throw new RuntimeException("Make a Mistake");

	}

}
