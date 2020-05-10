public class Catman extends Quadruped{
	
	//Constructor
	public Catman(String name){
		
		super(name);
	}
	
	//Speak method
	public void speak(){
		
		System.out.println(super.getName() + " speaks very sneakily");	
	}	
}