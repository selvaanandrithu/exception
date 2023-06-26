package exception;

public class NullException {
	public static void main(String[] args) {
		String value = null;
		try {
			System.out.println(value.toUpperCase());
		}
		catch(ArithmeticException ae) {
			System.out.println(ae+"IT IS ArithmeticException");
			ae.printStackTrace();
		}
		catch(NumberFormatException ne) {
			System.out.println(ne+"it is NumberFormatException");
			ne.printStackTrace();
		}
		catch(NullPointerException np) {
			System.out.println(np+"NullPointerException");
			np.printStackTrace();
			}
		catch(Exception e) {
			System.out.println(e+"some exception");
			e.printStackTrace();
		}
	}

}
