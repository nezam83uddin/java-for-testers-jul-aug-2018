package home;

import amazon.Alexa;

public class TestMyAlexa {

	public static void main(String[] args) {
		
		
		Alexa myAlexa = new Alexa();
//		
//		double inch=myAlexa.convertFeetIntoIches(1);	
//		
//		myAlexa.convertInchIntoFeet(inch);
//		
//		
		
		String alexasName=myAlexa.whatIsYourName();
		System.out.println(alexasName);

	}

}


//set 1
//My Name is Alexa
//My Name is Alexa

//set 2
//My Name is Alexa
//Alexa

//set 3
//Alexa
//My Name is Alexa

