package in.ineuron.beans;

public class CreditCardPay implements IPay {

	public CreditCardPay() {
		System.out.println("Credit card object is created by IOC");
	}
	public boolean payBill(double amt) {
		System.out.println("Paying Bill through Credit Card");
		return true;
	}

}
