public class Dogman extends Quadruped{
	
	//Constructor
	public Dogman(String name){
		
		super(name);
	}
	
	//Speak method
	public void speak(){
		
		System.out.println(super.getName() + " speaks in a friendly manner");	
	}	
}