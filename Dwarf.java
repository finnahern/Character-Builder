public class Dwarf extends Biped{
	
	//Constructor
	public Dwarf(String name){
		
		super(name);
	}
	
	//Speak method
	public void speak(){
		
		System.out.println(super.getName() + " speaks proudly");	
	}
}