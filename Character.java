public class Character{
	
	private String name;
	private int speed;
	private Weapon weapon;
	
	//Default Constructor
	public Character(){
	
	}

	//User Defined Constructor for Name
	public Character(String name){
	
		this.name = name;
	}
	
	//User Defined Constructor for Speed
	public Character(int speed){
	
		this.speed = speed;
	}
	
	//User Defined Constructor for Name, Speed & Weapon
	public Character(String name, int speed, Weapon weapon){
	
		this.name = name;
		this.speed = speed;
		this.weapon = weapon;
	}
	
	//Getter/Setter for Name
	public String getName(){

		return this.name;
	}
	
	public void setName(String name){
		
		this.name = name;
	}	
	
	//Getter/Setter for Speed
	public int getSpeed(){

		return this.speed;
	}
	
	public void setSpeed(int speed){
	
		this.speed = speed;
	}
	
	//Getter/Setter for Weapon
	public Weapon getWeapon(){
		
		return this.weapon;
	
	}
	
	public void setWeapon(Weapon weapon){
	
		this.weapon = weapon;
	}	

	//Move 
	public void move(){

		System.out.println(name + " moves at " + speed + " speed");
	}

	//Eat
	public void eat(){
		
		System.out.println(name + " eats");
	}

	//Speak
	public void speak(){
		
		System.out.println(name + " speaks");	
	}	
	
	//Hit
	public void hit(){
		
		System.out.println(name + " attacks with their " + weapon.getType() + ". It deals " + weapon.getDamage() + " damage");
	}	

}