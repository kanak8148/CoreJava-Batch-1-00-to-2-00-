package in.co.rays.uncheckedexception;

public class TestLogin {
	public static void main(String[] args) {

String login = "admin123";
		
		if(login == "admin") {
			System.out.println("user found");
		} else {
			try {
				throw new LoginException();
			} catch (LoginException e) {
			System.out.println("exception: " + e.getMessage());
		}
		}
		
	}

}

