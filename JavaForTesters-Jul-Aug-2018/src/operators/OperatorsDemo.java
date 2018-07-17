package operators;

import amazon.Alexa;

public class OperatorsDemo {

	public static void main(String[] args) {
		
		
			
				
			
		
		
				
			//  Assignment operator [=] 
			String name = "rk reja";
			int i=100;
			boolean b=true;
			
			
			
			
			
			
			
			Alexa myalexa  = new Alexa();
			
			
			//Comparison operators:
			//[==] equal to
			System.out.println(i==10);//returns true, because i is equal to 10
			//[!=] NOT equal
			System.out.println(10!=i);//returns true, because 10 and i are not equal
			//[<] less than
			System.out.println(i<5);//returns false, because i is not less than 5
			//[>] greater than
			System.out.println(i>5);//returns true, because i is greater than 5
			//[<=] less or equal than
			System.out.println(i<=55);//returns false, beacause i is neither less nor equal to 55
			//[>=] greater or equal than
			System.out.println(i>=105);//returns true, because i is not equal to 105, but greater than i
			//[instanceof] check class of an object
			System.out.println(myalexa instanceof Alexa);//returns true, myAlexa is an object of Alexa
			
			
			//Arithmetic operators:
			//[+] for addition
			System.out.println(i+50);//Do an addition of i and 50
			//[-] for subtraction
			System.out.println(i-50);//Subtract 50 from i
			
			//[*] for Multiplication
			System.out.println(i*2);//Multiply i by 2
			
			//[/] for division
			System.out.println(i/2);//Devider i by 2
			
			//[*] for remainder
			System.out.println(i%2);//Get remainder of i when divided by 2
			
			
			
			
			//Logical operators:
			//[&&] AND
			System.out.println((i==100) && (b==true));// returns true, here we are saying check i is equal to 100 AND b is equal to true
			System.out.println((i==100) && (b==false));// returns false, since one of the condition is false
			System.out.println((i==200) && (b==false));// returns false, none of the condition is true
			
			//[||] OR
			System.out.println((i==100) || (b==true));// returns true, here we are saying check i is equal to 100 OR b is equal to true, here both are true so returns true
			System.out.println((i==100) || (b==false));// returns true, since one of the condition is true
			System.out.println((i==200) || (b==false));// returns false, none of the condition is true
			
	}

}
