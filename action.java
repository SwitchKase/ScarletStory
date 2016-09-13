package game;

public class Action{
  String actionName;
  int actionStartLag, actionDuration, actionEndLag, actionDamage, actionHealing, actionManaRestore, actionManaCost, actionManaDamage;
  int selfDeltaVX, selfDeltaVY, targetDeltaVX, targetDeltaVY;
  Animation animation;
  Rectangle hitBox;
  
  public Action(){
    actionName="NONE";
    actionStartLag=0;
    actionDuration=0;
    actionEndLag=0;
    actionDamage=0;
    actionHealing=0;
    actionManaRestore=0;
    actionManaCost=0;
    actionManaDamage=0;
    selfDeltaVX=0;
    selfDeltaVY=0;
    targetDeltaVX=0;
    targetDeltaVY=0;
    animation=null;
    hitBox=null;
  }
  public Action(String actionName, int actionStartLag, int actionDuration, int actionEndLag, int actionDamage, int actionHealing, int actionManaRestore, int actionManaCost, int actionManaDamage, int sDVX, int sDVY, int tDVX, int tDVY, Rectangle hitBox, Animation animation){
    this.actionName=actionName;
    this.actionStartLag=actionStartLag;
    this.actionDuration=actionDuration;
    this.actionEndLag=actionEndlag;
    this.actionDamage=actionDamage;
    this.actionHealing=actionHealing;
    this.actionManaRestore=actionManaRestore;
    this.actionManaCost=actionManaCost;
    this.actionManaDamage=actionManaDamage;
    this.selfDeltaVX=sDVX;
    this.selfDeltaVY=sDVY;
    this.targetDeltaVX=tDVX;
    this.targetDeltaVY=tDVY;
    this.hitBox=hitBox;
    this.animation=animation;
  }
  
  public void execute(Entity me, Entity target){
    me.setCurrentHealth(me.getCurrentHealth()+actionHealing);
    me.setCurrentMana(me.getCurrentMana()-actionManaCost);
    me.setCurrentMana(me.getCurrentMana()+actionManaRestore);
    
    me.setVX(me.getVX()+selfDeltaVX);
    me.setVY(me.getVY()+selfDeltaVY);
    
    
    target.setCurrentHealth(target.getCurrentHealth()-actionDamage/target.getArmor());
    target.setCurrentMana(target.getCurrentMana()-actionManaDamage);
    
    target.setVX(target.getVX()+targetDeltaVX);
    target.setVY(target.getVX()+targetDeltaVX);
    
    animation.draw();
  }
  
  public void execute(Entity user){
    user.setHealth(user.getHealth()+actionHealing);
    user.setMana(user.getMana()+actionManaRestore);
    me.setVX(me.getVX()+selfDeltaVX);
    me.setVY(me.getVY()+selfDeltaVY);
    animation.draw();
  }
  public boolean hasHitBox(){
     if(hitBox==null){
       return false;
     }
     return true;
   }
   public Rectangle getHitBox(Entity actor){
     return new Rectangle(actor.getPosX(),actor.getPosY(),hitBox.width,hitBox.height);
     //Check if those are proper attributes
   }
