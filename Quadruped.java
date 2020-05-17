public class Quadruped extends Character{
	
	//User Defined Constructor 
	public Quadruped(String name, Weapon weapon){
	
		super(name, 4, weapon);
	}
	
	//Eat method
	public void eat(){
		
		System.out.println(super.getName() + " eats with their face");
	}

	//Speak method
	public void speak(){
		
		System.out.println(super.getName() + " speaks");	
	}	
}