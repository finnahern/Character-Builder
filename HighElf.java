public class HighElf extends Biped{
	
	//Constructor
	public HighElf(String name, Weapon weapon){
		
		super(name, weapon);
		
	}	
	
	//Speak method
	public void speak(){
		
		System.out.println(super.getName() + " speaks arrogantly");	
	}	
}