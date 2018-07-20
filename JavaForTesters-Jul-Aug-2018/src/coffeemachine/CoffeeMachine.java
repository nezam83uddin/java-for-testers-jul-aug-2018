package coffeemachine;

public class CoffeeMachine {
	
	private int beanCup=0;
	
	
	
	//make coffee
	public void makeCoffee() {
		if(beanCup<=0) {
			System.out.println("Bean cup is empty");
		}else {
			System.out.println("Enjoy your coffee!");
			beanCup=beanCup-1;
			System.out.println("You can have "+beanCup+" more cup of coffee");
			
		}
	}
	
	//fill up beans
	public void fillUpBeanCup() {
		beanCup=15;
		System.out.println("Bean cup is now full");
	}
	
	
	

}
