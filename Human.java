public class Human extends Biped{
	
	//Constructor
	public Human(String name){
		
		super(name);
	}

	//Speak method
	public void speak(){
		
		System.out.println(super.getName() + " speaks very wittily");	
	}		
}