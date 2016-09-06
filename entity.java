package Game;

public class Entity{
  private int currentHealth,maxHealth,currentMana,maxMana,speed,posX,posY;
  private String type;
  private Animation[] animations;
  
  public Entity(){
    currentHealth=maxHealth=100;
    currentMana=maxMana=100;
    speed=1;
    posX=posY=0;
    type="NULL";
    animations=new Animation[10];
  }
  public Entity(int currentHealth,int maxHealth,int currentMana,int maxMana, int speed, int posX, int posY, String type, Animation[] animations){
    this.currentHealth=currentHealth;
    this.maxHealth=maxHealth;
    this.currentMana=currentMana;
    this.maxMana=maxMana;
    this.speed=speed;
    this.posX=posX;
    this.posY=posY;
    this.type=type;
    this.animations=animations;
  }
  //end constructors
  
  //begin get methods
  public int getCurrentHealth(){
    return currentHealth;
  }
  public int getmaxHealth(){
    return maxHealth
  }
  public int getCurrentMana(){
    return currentMana;
  }
  public int getMaxMana(){
    return maxMana;
  }
  public int getSpeed(){
    return speed;
  }
  public int getPosX(){
    return posX;
  }
  public int getPosY(){
    return posY;
  }
  public String getType(){
    return type;
  }
  public Animation[] getAnimations(){
    return animations;
  }
  //end get methods
  
  //begin set methods
  public void setCurrentHealth(int health){
    currentHealth=health;
  }
  public void setMaxHealth(int health){
    maxHealth=health;
  }
  public void setCurrentMana(int mana){
    currentMana=mana;
  }
  public void setMaxMana(int mana){
    maxMana=mana;
  }
  public void setSpeed(int speed){
    this.speed;
  }
  public void setPosX(int posX){
    this.posX=posX;
  }
  public void setposY(int posY){
    this.posY=posY
  }
  public void setType(String type){
    this.type=type;
  }
  public void setAnimations(Animation[] animations){
    this.animations=animations;
  }
  //end set methods

  public void doAction(Action action){
    action.execute(this);
  }
}
