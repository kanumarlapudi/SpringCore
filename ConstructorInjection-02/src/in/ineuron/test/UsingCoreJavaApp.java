package in.ineuron.test;

import in.ineuron.comp.WishMessageGenerator;

public class UsingCoreJavaApp {

	public static void main(String[] args) {
		
		java.util.Date date = new java.util.Date();
		System.out.println("Creating an object of Dependant class using Zero param constructor :: " + date);
		
		WishMessageGenerator wmg = new WishMessageGenerator(date);
		System.out.println("creating an object of Target class using parameterized constructor " + wmg);
		
		String result = wmg.generateBusiness("Harish");
        System.out.println(result);
	}

}
