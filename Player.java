package Game;

public class Player extends Entity{
	 private int currentMana,maxMana,crit;
	 private Item[] miscItems;
	 private Item[] equippedItems;
	 
	 
	 public Player()
	 {
		 super();
		 setMaxMana(100);
		 setCurrentMana(100);
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

	public int getCurrentMana() {
		return currentMana;
	}
	public int getMaxMana(){
		return maxMana;
	}

	public void setCurrentMana(int mana) {
		this.currentMana = mana;
	}
	public void setMaxMana(int mana){
		this.maxMana=mana;
	}

	public int getCrit() {
		return crit;
	}

	public void setCrit(int crit) {
		this.crit = crit;
	}

	public int getSpeed() {
		return speed;
	}
	public void spendMana(int manaCost){
		this.setCurrentMana(this.getCurrentMana()-manaCost);
	}
	

}
