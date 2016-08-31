package Game;

public class Player {
	 private int health,mana,dmg,crit,speed;
	 private String clas;
	 
	 public Player()
	 {
		 setHealth(100);
		 setMana(100);
	 }
	 
	 public Player(String clas)
	 {
		 switch(clas.toLowerCase())
		 {
		 case "rogue" : setHealth(20); setMana(100);
		 	break;
		 case "warrior" : setHealth(200); setMana(100);
		 	break;
		 case "elementalist" : setHealth(100); setMana(150);
		 	break;
		 case "beserker" :  setHealth(130); setMana(100);
		 	break;
		 case "beastmaster" :  setHealth(100); setMana(100);
		 	break; 
		 case "priest" :  setHealth(800); setMana(150);
		 	break;
		 
		 }
		 
	 }

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getDmg() {
		return dmg;
	}

	public void setDmg(int dmg) {
		this.dmg = dmg;
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
	 
	

}
