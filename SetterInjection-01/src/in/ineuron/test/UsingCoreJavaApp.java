package in.ineuron.test;

import in.ineuron.comp.WishMessageGenerator;

public class UsingCoreJavaApp {

	public static void main(String[] args) {
		WishMessageGenerator generator = new WishMessageGenerator();
		System.out.println("Target Object Before Setter Injection is :: " + generator);
		
		java.util.Date date = new java.util.Date();
		System.out.println("Dependant Object is :: " + date);
		
		generator.setDate(date);
		
		System.out.println("Target Object after setter Injection :: " + generator);
		
		System.out.println();
		
		String result = generator.generateBusiness("Harish");
		System.out.println(result);

	}

}
