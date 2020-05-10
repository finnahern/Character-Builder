public class Orc extends Biped{
	
	//Constructor
	public Orc(String name){
		
		super(name);
	}
	
	//Speak method
	public void speak(){
		
		System.out.println(super.getName() + " speaks angrily");	
	}
}