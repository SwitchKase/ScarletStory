package Game;

public class Projectile extends entity{
  public projectile(int currentHealth,int maxHealth,int currentMana,int maxMana, int speed, int vX, int vY, int width,int height, String type, Animation[] animations, Entity source){
    super(currentHealth, maxHealth, currentMana, maxMana, speed, source.getPosX(), source.getPosY(), vX+source.getvX(), vY+source.getvY(), width, height, type, animations);
}    
