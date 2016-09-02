package Game;

public class Enemy extends Entity{
  
  public Enemy(){
    super();
  }
  
  public Enemy(int currentHealth,int maxHealth,int speed,int posX,int posY, String type, Animation[] animations){
    super(currentHealth,maxHealth,speed,posX,posY,animations,type);
  }
  
  public Enemy(int maxHealth,int speed,int posX,int posY, String type, Animation[] animations){
    super(maxHealth,maxHealth,speed,posX,posY,animations,type);
  }
  
  }

}
