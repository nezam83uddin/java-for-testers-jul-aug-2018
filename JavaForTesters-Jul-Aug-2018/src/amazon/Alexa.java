package amazon;

public class Alexa{
	
	private String name = "Alexa";
	private String ownerName = null;
		
	
	

	public void playRadio() {
		System.out.println("Playing Z-100");
	}	
	
	public void playRadio(String l) {
		System.out.println("Playing "+ l);
	}
	

	public String whatIsYourName() {
		System.out.println("My name is "+name);
		return name;
	}
	
	public void changeYourName(String n) {
		System.out.println("Wow I like my new name " + n);
		name=n;
	}
		
	public void whatIsYourOwnerName() {
		
		if (ownerName!=null) {
			System.out.println("My owner name is "+ownerName);
		}else {
			System.out.println("You didn't tell me your name yet.");
		}
		
	}
	
	public void changeYourOwnerName(String n) {
		System.out.println("Nice to meet you " + n);
		ownerName=n;
	}
	
	
	
	public double convertFeetIntoIches(double feet) {
		double calculation = feet * 12;		
		System.out.println( calculation+ " inches");
		return calculation;
	}
	
	public void convertInchIntoFeet(double inch) {
		System.out.println((inch / 12) + " feet");
	}


	

}

