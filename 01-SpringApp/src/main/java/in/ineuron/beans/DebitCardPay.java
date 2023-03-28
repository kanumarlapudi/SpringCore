package in.ineuron.beans;

public class DebitCardPay implements IPay {
	
	public DebitCardPay() {
		System.out.println("Debit Card Object is created by IOC");
	}

	public boolean payBill(double amt) {
		System.out.println("Paying Bill through Debit Card");
		return true;
	}

}
