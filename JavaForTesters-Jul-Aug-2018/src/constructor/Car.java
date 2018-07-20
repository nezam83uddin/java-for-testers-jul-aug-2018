package constructor;

public class Car{
	
private String make;
	private String model;
	private String color;
	private int hp=-1;
	private boolean awd = false;
	
	
	public Car(String newMake, String newModel, String newColor, int newHp) {
		make=newMake;
		model=newModel;
		color=newColor;
		hp=newHp;
	}
	

	public Car(String newMake, String newModel, String newColor) {
		make=newMake;
		model=newModel;
		color=newColor;
	}
	
	public void setAwd(boolean b) {
		awd=b;
	}
	public boolean getAwd(){
		return awd;
	}
	
	
	
	public void drive() {
		System.out.println("You are driving "+color+" "+make+" "+model + " with AWD :"+ awd+" with horse power "+hp);
	}
	

}
