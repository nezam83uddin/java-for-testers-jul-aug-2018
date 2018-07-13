package ifandswitchstatement;

public class IfStatementDemo {

	public static void main(String[] args) {
		
		String stateCode = "LA";//VA,MI
		
	
		
		
			if (stateCode.equals("NY")) {
				
				System.out.println("New York");
				
			}else if (stateCode.equals("VA")) {
				
				System.out.println("Virginia");
				
			}else if (stateCode.equals("MI")) {
				
				System.out.println("Michigan");
				
			}else if (stateCode.equals("LA")) {
				
				System.out.println("Los Angeles");
				
			}else {				
				System.out.println("Invalid state code");
			}

		
		
		

	}

}
