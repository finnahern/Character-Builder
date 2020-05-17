import java.util.Scanner;

public class CharacterBuilder{
	
	//init method
	public void init(){
		
		CharacterBuilder characterBuilder = new CharacterBuilder();
		
		String name = characterBuilder.name();
		Weapon weapon = characterBuilder.weapon();
		Character character = characterBuilder.race(name, weapon);
		
		character.move();
		character.eat();
		character.speak();
		character.hit();
		
	}
	
	//Choose name method
	public String name(){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a name for your character:");
		String name = scanner.nextLine();
		
		return name;
		
	}	
	
	//Choose weapon method
	public Weapon weapon(){
		
		Scanner scanner = new Scanner(System.in);
		boolean validResponse = false;
		
		while(validResponse == false){
		
			System.out.println("Choose a weapon; Sword, Axe, Bread Roll, Big Man, Small Man, Lightning Mace:");
			String ans = scanner.nextLine();
			
			if(ans.equals("Sword") || ans.equals("sword")){
			
				validResponse = true;
				return new Sword();

			}else if (ans.equals("Axe") || ans.equals("axe")){
				
				validResponse = true;
				return new Axe();
			
			}else if (ans.equals("Bread Roll") || ans.equals("bread roll") || ans.equals("BreadRoll") || ans.equals("breadroll")){
				
				validResponse = true;
				return new BreadRoll();
				
			}else if (ans.equals("Big Man") || ans.equals("big man")){
				
				validResponse = true;
				return new BigMan();
				
			}else if (ans.equals("Small Man") || ans.equals("small man")){
				
				validResponse = true;
				return new SmallMan();
			
			}else if (ans.equals("Lightning Mace") || ans.equals("lightning mace")){
				
				validResponse = true;
				return new LightningMace();
				
			} else{
			
				System.out.println(ans + " is not a valid response");
				validResponse = false;
			}
		}
		return null;
	}	
	
	//Choose race method
	public Character race(String name, Weapon weapon){
	
		Scanner scanner = new Scanner(System.in);
		boolean validResponse = false;
	
		while(validResponse == false){
		
			System.out.println("Choose a race; Human, Catman, Dogman, High Elf, Low Elf, Orc, Dwarf or Horseboy:");
			String ans = scanner.nextLine();
			
			if(ans.equals("Human") || ans.equals("human")){
			
				validResponse = true;
				return new Human(name, weapon);
		
			} else if (ans.equals("Catman") || ans.equals("catman")){
				
				validResponse = true;
				return new Catman(name, weapon);
			
			} else if (ans.equals("Dogman") || ans.equals("dogman")){
				
				validResponse = true;
				return new Dogman(name, weapon);
				
			} else if (ans.equals("High Elf") || ans.equals("high elf")){
				
				validResponse = true;
				return new HighElf(name, weapon);
				
			} else if (ans.equals("Low Elf") || ans.equals("low elf")){
				
				validResponse = true;
				return new LowElf(name, weapon);
				
			} else if (ans.equals("Orc") || ans.equals("orc")){
				
				validResponse = true;
				return new Orc(name, weapon);

			} else if (ans.equals("Dwarf") || ans.equals("dwarf")){
				
				validResponse = true;
				return new Dwarf(name, weapon);
				
			} else if (ans.equals("Horseboy") || ans.equals("horseboy")){
				
				validResponse = true;
				return new Horseboy(name, weapon);
			
			} else{
			
				System.out.println(ans + " is not a valid response");
				validResponse = false;
			}
		}
		
		return null;
	}		
}