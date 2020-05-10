public class Main{
	
	public static void main(String[] args){
		
		Weapon sword = new Sword();
		Weapon axe = new Axe();
		Weapon breadRoll = new BreadRoll();
		Weapon bigMan = new BigMan();
		Weapon smallMan = new SmallMan();
		Weapon lightningMace = new LightningMace();
		
		System.out.println("Sword damage = " + sword.getDamage());
		System.out.println("Axe damage = " + axe.getDamage());
		System.out.println("Bread Roll damage = " + breadRoll.getDamage());
		System.out.println("Big Man damage = " + bigMan.getDamage());
		System.out.println("Small Man damage = " + smallMan.getDamage());
		System.out.println("Lightning Mace damage = " + lightningMace.getDamage());
		
		Character stronk = new Horseboy("Stronk");
		
		stronk.move();
		stronk.eat();
		stronk.speak();
	}
}	