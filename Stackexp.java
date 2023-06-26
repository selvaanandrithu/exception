package exception;

public class Stackexp {
	public void add() {
		this.sub();
	}
	public void sub() {
		this.add();
	}

}
