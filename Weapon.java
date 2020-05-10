public class Weapon{
	
	private int damage;
	
	//Default Constructor
	public Weapon(){
	
	}	
	
	//User Defined Constructor
	public Weapon(int initialDamage){
	
		this.damage = initialDamage;
	}
	
	//Getter
	public int getDamage(){

		return this.damage;
	}
	
	//Setter
	public void setDamage(int initialDamage){
	
		this.damage = initialDamage;
	}	
}