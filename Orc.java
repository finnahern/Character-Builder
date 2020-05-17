public class Orc extends Biped{
	
	//Constructor
	public Orc(String name, Weapon weapon){
		
		super(name, weapon);
	}
	
	//Speak method
	public void speak(){
		
		System.out.println(super.getName() + " speaks angrily");	
	}
}