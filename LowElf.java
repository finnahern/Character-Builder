public class LowElf extends Biped{
	
	//Constructor
	public LowElf(String name){
		
		super(name);
	}
	
	//Speak method
	public void speak(){
		
		System.out.println(super.getName() + " speaks and is very dirty");	
	}	
}