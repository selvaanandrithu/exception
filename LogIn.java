package exception;

public class LogIn {
	public static void main(String[] args) throws LogInValidation {
		String username = "admin";
		String password = "abcd";
		try {
		if(username.equals("admin") && password.equals("afcd")) {
			System.out.println("Login successful");
		}
		else {
			throw new LogInValidation("Login failed");
		}
		
		System.out.println("Further Execution");
		
		}
		catch(Exception rg) {
			System.out.println(rg+"error");
			rg.printStackTrace();
		}
		System.out.println("hello");
	}

}
