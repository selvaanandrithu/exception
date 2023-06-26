package exception;

public class Numbers {
	public static void main(String[] args) {
		
//		arithmeticException....
//		int num1=10;
//		int num2=0;
//		try {
//		int divide = num1/num2;
//		System.out.println(divide);
//	}
//	catch(ArithmeticException ae) {
//	System.out.println(ae+"It is arithmetic exception");
//			ae.printStackTrace();
//		}
//		finally {
//			System.out.println("Exceuted Even When exception occurs or not");
//		}
//		
//		System.out.println("Rest of the code");
//		
		
//	numbernotfound......
		String a = "gopi123";
		try {
		int b = Integer.parseInt(a);
		
		System.out.println(b);
		}
		catch(NumberFormatException ar) {
			System.out.println(ar+"its NumberFormatException ");
			ar.printStackTrace();
		}
		finally {
			System.out.println("excuted even when exception occurs or not");
		}
		
		System.out.println("rest of code");

}
}
