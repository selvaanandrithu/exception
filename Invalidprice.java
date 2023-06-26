package exception;

public class Invalidprice {
	public static void main(String[] args) throws InvalidPriceException {
		int price1 = 5;
		int price2= 10;
		int price3=-2;
		try {
		if(price3==0) {
			System.out.println("negative");
		}
		else {
			throw new InvalidPriceException("error");
		}
		System.out.println("offer price");
		
	}
		catch(Exception er) {
			System.out.println(er+"false");
			er.printStackTrace();
		}
		System.out.println("final price?");

}
}
