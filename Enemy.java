package Game;

public abstract class Enemy extends Entity{
  
  public Enemy(){
    super();
  }
  
  public Enemy(int currentHealth,int maxHealth,int currentMana,int maxMana,int speed,int crit,int posX,int posY, String type, Animation[] animations){
    super(currentHealth,maxHealth,currentMana,maxMana,speed,crit,posX,posY,animations,type);
  }
  
  public Enemy(int maxHealth,maxMana,int speed,int crit,int posX,int posY, String type, Animation[] animations){
    super(maxHealth,maxHealth,maxMana,maxMana,speed,crit,posX,posY,animations,type);
  }
  
  public abstract void act();

}
