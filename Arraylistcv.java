package exception;

public class Arraylistcv {
	public static void main(String[] args) {
		String[] a = {"selva","anand","sriman","selvam","rithu"};
		try {
		System.out.println(a[5]);
	}
		catch(StringIndexOutOfBoundsException svt) {
			System.out.println(svt+"it is StringIndexOutOfBoundsException");
			svt.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException vnr) {
			System.out.println(vnr+"it is ArrayIndexOutOfBoundsException");
			vnr.printStackTrace();
		}
		finally {
			System.out.println("excecute whatever");
		}
		System.out.println("rest of code");

}
}
