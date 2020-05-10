public class Biped extends Character{
	
	//User Defined Constructor 
	public Biped(String name){
	
		super(name, 2);
	}
	
	//Eat method
	public void eat(){
		
		System.out.println(super.getName() + " eats with their hands");
	}

	//Speak method
	public void speak(){
		
		System.out.println(super.getName() + " speaks");	
	}		
}