public class Horseboy extends Quadruped{
	
	//Constructor
	public Horseboy(String name, Weapon weapon){
		
		super(name, weapon);
	}
	
	//Speak method
	public void speak(){
		
		System.out.println(super.getName() + " speaks and is very leggy");	
	}
}