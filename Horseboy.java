public class Horseboy extends Quadruped{
	
	//Constructor
	public Horseboy(String name){
		
		super(name);
	}
	
	//Speak method
	public void speak(){
		
		System.out.println(super.getName() + " speaks and is very leggy");	
	}
}