package coffeemachine;

public class TestCoffeeMachine {

	public static void main(String[] args) {
		
		CoffeeMachine myCoffeeMachine = new CoffeeMachine();
		
		myCoffeeMachine.fillUpBeanCup();
		
		
		myCoffeeMachine.makeCoffee();
		myCoffeeMachine.makeCoffee();
		myCoffeeMachine.makeCoffee();
		myCoffeeMachine.makeCoffee();

		
		myCoffeeMachine.fillUpBeanCup();
		myCoffeeMachine.makeCoffee();

		
		
		

	}

}
