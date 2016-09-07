package game;

public class Action{
  String actionName;
  int actionStartLag, actionDuration, actionEndLag, actionDamage, actionHealing, actionManaRestore, actionManaCost, actionManaDamage;
  int selfDeltaVX, selfDeltaVY, targetDeltaVX, targetDeltaVY;
  Animation animation;
  
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
  }
  public Action(String actionName, int actionStartLag, int actionDuration, int actionEndLag, int actionDamage, int actionHealing, int actionManaRestore, int actionManaCost, int actionManaDamage, int sDVX, int sDVY, int tDVX, int tDVY, Animation animation){
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
    this.animation=animation;
  }
  
  public void execute(Entity me, Entity target){
    me.setCurrentHealth(me.getCurrentHealth()+actionHealing);
    me.setCurrentMana(me.getCurrentMana()-actionManaCost);
    me.setCurrentMana(me.getCurrentMana()+actionManaRestore);
    
    me.setVX(me.getVX()+selfDeltaVX);
    me.setVY(me.getVY()+selfDeltaVY);
    
    
    target.setCurrentHealth(target.getCurrentHealth()-actionDamage);
    target.setCurrentMana(target.getCurrentMana()-actionManaDamage);
    
    target.setVX(target.getVX()+targetDeltaVX);
    target.setVY(target.getVX()+targetDeltaVX);
    
    animation.draw();
  }
  
  public void execute(Item item, Entity user){
    user.setHealth(user.getHealth()+actionHealing);
    user.setMana(user.getMana()+actionManaRestore);
    me.setVX(me.getVX()+selfDeltaVX);
    me.setVY(me.getVY()+selfDeltaVY);
    animation.draw();
  }
