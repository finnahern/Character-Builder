public class HighElf extends Biped{
	
	//Constructor
	public HighElf(String name){
		
		super(name);
	}
	
	//Speak method
	public void speak(){
		
		System.out.println(super.getName() + " speaks arrogantly");	
	}	
}