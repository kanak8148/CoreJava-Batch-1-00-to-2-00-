package Exception;

public class TestLoginException {
	public static void main(String[] args) {
		String login = "login@gmail.com";

		if (login == "admin") {
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
