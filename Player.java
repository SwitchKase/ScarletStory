package Game;

public class Player {
	 private int currentHealth,maxHealth,currentMana,maxMana,crit,speed,posX,posY;
	 private String clas;
	 private Item[] miscItems;
	 private Item[] equippedItems;
	 
	 
	 public Player()
	 {
		 setHealth(100);
		 setMana(100);
		 posX=0;
		 posY=0;
		 miscItems = new Item[10];
		 equippedItems[] = new Item[6];
		 //Slots 0-2 are armor(Head,Torso,Legs)
		 //Slots 3-4 are weapons(Left,Right)
		 //Slot 5 is usable items ex. smokebombs,scrolls
	 }
	 
	 public Player(String clas)
	 {
	 	Player();
	 	this.clas=clas;
		 switch(clas.toLowerCase())
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

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}
	public int getMaxHealth(){
		return maxHealth;
	}

	public void setCurrentHealth(int health) {
		this.currentHealth = health;
	}
	public void setMaxHealth(int health){
		this.maxHealth=health;
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

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void takeDamage(int dmg){
		this.setCurrentHealth(this.getCurrentHealth-dmg);
	}
	public void spendMana(int manaCost){
		this.setCurrentMana(this.getCurrentMana()-manaCost);
	}
	

}
