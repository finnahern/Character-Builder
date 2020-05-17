public class LowElf extends Biped{
	
	//Constructor
	public LowElf(String name, Weapon weapon){
		
		super(name, weapon);
	}
	
	//Speak method
	public void speak(){
		
		System.out.println(super.getName() + " speaks and is very dirty");	
	}	
}