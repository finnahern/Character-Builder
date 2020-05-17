public class Human extends Biped{
	
	//Constructor
	public Human(String name, Weapon weapon){
		
		super(name, weapon);
	}

	//Speak method
	public void speak(){
		
		System.out.println(super.getName() + " speaks very wittily");	
	}		
}