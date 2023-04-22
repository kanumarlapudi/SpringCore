package in.ineuron.comp;

import java.util.Arrays;
import java.util.Random;

//TargerObject
public class FlipKart {

	//Dependent Object
	private Courier courier;
	private float discount;
	
	static {
		System.out.println("\n FlipKart.class file is loading");
	}
	
	public FlipKart() {
		System.out.println("FlipKart :: Zero param constructor");
	}
	
	public void setCourier(Courier courier ) {
		this.courier = courier;
		System.out.println("FlipKart.setCourier()");
		System.out.println(this);
	}
	
	public void setDiscount(Float discount) {
		this.discount = discount;
		System.out.println("FlipKart.setDiscount()");
		System.out.println(this);
	}
	
	//Business Logic
	public String doShopping(String[] items, float prices[]) {
		System.out.println("FlipKart.doShopping()");
		System.out.println("Implementation class is :: " + courier.getClass().getName());
		System.out.println("Discount amount is :: " + discount);
		
		int oid = 0;
		float billAmt = 0.0f;
		Random random = null;
		for(float price : prices) {
			billAmt += price;
		}
		billAmt = billAmt - (discount / 100.0f);
		random = new Random();
		oid = random.nextInt(1000);
		System.out.println("Order id is :: " + oid);
		String msg = courier.deliver(oid);
		return Arrays.toString(items) + " are purchased having prices " + Arrays.toString(prices) + " with bill amount of " + billAmt + " ----> " + msg;
	}

	@Override
	public String toString() {
		return "FlipKart [courier=" + courier + ", discount=" + discount + "]";
	}
}
