package in.ineuron.comp;

import java.util.Date;

//Target class(userDefined=>WishMessageGenerator)
public class WishMessageGenerator {

	// Dependant class(predefined => java.util.Date)
	private Date date;
	
	static {
		System.out.println("WishMessageGenerator.class file is loading");
	}
	
	public WishMessageGenerator(Date date) {
		this.date = date;
		System.out.println("WishMessageGenerator:: One param constructor");
	}
	
	// Business Logic method => using dependent object in B.L
	
	public String generateBusiness(String userName) {
		int hour = date.getHours();  //get hour in 24 hour format
		
		if(hour<12) {
			return "Good Morning :: " + userName;
		}
		
		else if(hour<16) {
			return "Good Afternoon :: " + userName;
		}
		
		else if(hour<20) {
			return "Good Evening :: " + userName;
		}
		
		else {
			return "Good Night :: " + userName;
		}
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}
}
