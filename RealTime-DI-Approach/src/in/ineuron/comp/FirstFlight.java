package in.ineuron.comp;

public class FirstFlight implements Courier {

	static {
		System.out.println("FirstFlight.class file is loading");
	}
	
	public FirstFlight() {
		System.out.println("FirstFlight:: Zero param constructor");
	}
	@Override
	public String deliver(int oid) {
		System.out.println("FirstFlight.delivery()");
		return "FirstFlight courier will be delivered with the order id ::" + oid + " for the ordered products"  ;
	}

}
