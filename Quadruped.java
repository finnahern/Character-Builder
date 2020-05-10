public class Quadruped extends Character{
	
	//User Defined Constructor 
	public Quadruped(String name){
	
		super(name, 4);
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