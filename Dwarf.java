public class Dwarf extends Biped{
	
	//Constructor
	public Dwarf(String name, Weapon weapon){
		
		super(name, weapon);
	}
	
	//Speak method
	public void speak(){
		
		System.out.println(super.getName() + " speaks proudly");	
	}
}