public class Catman extends Quadruped{
	
	//Constructor
	public Catman(String name, Weapon weapon){
		
		super(name, weapon);
	}
	
	//Speak method
	public void speak(){
		
		System.out.println(super.getName() + " speaks very sneakily");	
	}	
}