package Game;

public abstract class Enemy extends Entity{
  
  public Enemy(){
    super();
  }
  
  public Enemy(int currentHealth,int maxHealth,int currentMana,int maxMana,int armor,int speed,int posX,int posY,int vx,int vy,int width, int height, String type, Animation[] animations){
    super(currentHealth,maxHealth,currentMana,maxMana,armor,speed,posX,posY,vx,vy,width,height,type,animations);
  }
  
  public Enemy(int maxHealth,int maxMana,int armor,int speed,int posX,int posY,int vx,int vy,int width, int height, String type, Animation[] animations){
    super(maxHealth,maxHealth,maxMana,maxMana,armor,speed,posX,posY,vx,vy,width,height,type,animations);
  }
  
  public abstract void act(ArrayList<Entity> entityList);

}
