package in.ineuron.comp;

import java.util.Date;

//Target class(userDefined=>WishMessageGenerator)
public class WishMessageGenerator {

	// Dependant class(predefined => java.util.Date)
	private Date date;
	
	static {
		System.out.println("WishMessageGenerator.class file is loading");
	}
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator object is instantiated using :: Zero param constructor");
	}
	
	public WishMessageGenerator(Date date) {
		this.date = date;
		System.out.println("WishMessageGenerator:: One param constructor");
		System.out.println(this);
	}

	public void setDate(Date date) {
		this.date = date;
		System.out.println("Setter method is called to perform setter injection..");
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}
}
