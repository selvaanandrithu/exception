package exception;

public class NumberNotFound {
	public static void main(String[] args) {
		String a = "gopi123";
		try {
		int b = Integer.parseInt(a);
		
		System.out.println(b);
		}
		catch(Exception ar) {
			System.out.println(ar+"its NumberFormatException ");
			ar.printStackTrace();
		}
		finally {
			System.out.println("excuted even when exception occurs or not");
		}
		
		System.out.println("rest of code");
	}

}
