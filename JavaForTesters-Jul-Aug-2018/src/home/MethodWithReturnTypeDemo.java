package home;

public class MethodWithReturnTypeDemo {

	public static void main(String[] args) {
		
		
		Calculator myCalc = new Calculator();
		
		int result = myCalc.addition(250, 250);
		
		System.out.println(result);	

	}

}

class Calculator{
	
	public int addition(int x , int y) {
		int r = x+y;
		return r;
	}	
	
	
}