package exception;

public class UseAc {
	public static void main(String[] args) throws NoWarrantyException {
		Ac a1 = new Ac("sony","frt",200000,2);
		Ac a2 = new Ac("pansisonic","frt1",200000,4);
		Ac a3 = new Ac("cromo","fgrt",200000,0);
		Ac a4 = new Ac("frog","frtyy",200000,0);
		Ac a5 = new Ac("soya","frhgt",200000,2);
		try {
			if(a3.getNoOfMonthsWarranty()==2) {
				System.out.println("2 yrs warranty");
			}
			else {
				System.out.println("NoWarrantyException");
			}
		}
		finally {
			System.out.println("hello");
		}
		
		
	}

}
