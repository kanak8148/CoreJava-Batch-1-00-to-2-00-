package in.co.rays.checkedException;

public class TestCheckedException {
	
	public static void main(String[] args) {
		
		try {
			dad();
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
	}

	private static void dad() throws Exception {
           mom();
	}

	private static void mom() throws Exception {
		// TODO Auto-generated method stub
		son();
		
		
	}

	private static void son() throws Exception {
		throw new Exception("Make a Mistake ");
		
	}

}
