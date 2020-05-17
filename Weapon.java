public class Weapon{
	
	private int damage;
	private String type;
	
	//Default Constructor
	public Weapon(){
	
	}	
	
	//User Defined Constructor
	public Weapon(int initialDamage, String weaponType){
	
		this.damage = initialDamage;
		this.type = weaponType;
	}
	
	//Getter
	public int getDamage(){

		return this.damage;
	}
	
	//Setter
	public void setDamage(int initialDamage){
	
		this.damage = initialDamage;
	}

	//Type Getter
	public String getType(){
		
		return this.type;
	}	
}