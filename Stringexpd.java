package exception;

public class Stringexpd {
	public static void main(String[] args) {
		String a = "SRIMAN SELVAM";
		
		try {
		System.out.println(a.charAt(17));
		}
		catch(ArrayIndexOutOfBoundsException vnr) {
			System.out.println(vnr+"it is ArrayIndexOutOfBoundsException");
			vnr.printStackTrace();
		}
		catch(StringIndexOutOfBoundsException svt) {
			System.out.println(svt+"it is StringIndexOutOfBoundsException");
			svt.printStackTrace();
		}
		finally {
			System.out.println("excecute whatever");
		}
		System.out.println("rest of code");

		
	}

}
