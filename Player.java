package Game;

public class Player extends Entity{
	 private Item[] miscItems;
	 private Item[] equippedItems;
	 
	 
	 public Player()
	 {
		 super();
		 miscItems = new Item[10];
		 equippedItems[] = new Item[6];
		 //Slots 0-2 are armor(Head,Torso,Legs)
		 //Slots 3-4 are weapons(Left,Right)
		 //Slot 5 is usable items ex. smokebombs,scrolls
	 }
	 
	 public Player(String clas)
	 {
	 	Player();
	 	type=clas;
		 switch(type.toLowerCase())
		 {
		 case "rogue" : setMaxHealth(20); setMaxMana(100);
		 	break;
		 case "warrior" : setMaxHealth(200); setMaxMana(100);
		 	break;
		 case "elementalist" : setMaxHealth(100); setMaxMana(150);
		 	break;
		 case "beserker" :  setMaxHealth(130); setMaxMana(100);
		 	break;
		 case "beastmaster" :  setMaxHealth(100); setMaxMana(100);
		 	break; 
		 case "priest" :  setMaxHealth(80); setMaxMana(150);
		 	break;
		 
		 }
		 
	 }

}
