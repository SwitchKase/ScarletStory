package Game;

public class Entity{
  private int currentHealth,maxHealth,currentMana,maxMana,speed,posX,posY,vX,vY;
  private String type;
  private Animation[] animations;
  private Rectangle hitBox;
  
  public Entity(){
    currentHealth=maxHealth=100;
    currentMana=maxMana=100;
    speed=1;
    posX=posY=0;
    vX=vY=0;
    type="NULL";
    animations=new Animation[10];
    hitBox=new hitBox(0,0,0,0);
  }
  public Entity(int currentHealth,int maxHealth,int currentMana,int maxMana, int speed, int posX, int posY, int vX, int vY, int width,int height, String type, Animation[] animations){
    this.currentHealth=currentHealth;
    this.maxHealth=maxHealth;
    this.currentMana=currentMana;
    this.maxMana=maxMana;
    this.speed=speed;
    this.posX=posX;
    this.posY=posY;
    this.vX=vX;
    this.vY=vY;
    this.hitBox=new Rectangle(posX,posY,width,height);
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
  public int getVX(){
    return vX;
  }
  public int getVY(){
    return vY;
  }
  public Rectangle getHitBox(){
     return hitBox;
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
  public void setVX(int vX){
    this.vX=vX;
  }
  public void setVY(int vY){
    this.vY=vY;
  }
  public void setHitBox(int width,int height){
     hitBox=new Rectangle(posX,posY,width,height);
  }
  public void setType(String type){
    this.type=type;
  }
  public void setAnimations(Animation[] animations){
    this.animations=animations;
  }
  //end set methods

  public void doAction(Action action,Entity[] entityList){
   
    if(action.hasHitbox()){
      for(int i=0;i<entityList.length;i++){
         if(action.getHitBox(this).contains(entityList[i].getHitBox()){
           this.doAction(this,entityList[i]);
         }
      }
    }
     else
       action.execute(this);
   }
   public void doAction(Action action, Entity target){
     action.execute(this,target);
    }
}
