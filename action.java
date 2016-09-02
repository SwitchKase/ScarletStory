package game;

public class Action{
  String actionName;
  int actionStartLag, actionDuration, actionEndLag, actionDamage, actionHealing, actionManaRestore, actionManaCost, actionManaDamage;
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
    animation=null;
  }
  public Action(String actionName, int actionStartLag, int actionDuration, int actionEndLag, int actionDamage, int actionHealing, actionManaRestore, actionManaCost, actionManaDamage, Animation animation){
    this.actionName=actionName;
    this.actionStartLag=actionStartLag;
    this.actionDuration=actionDuration;
    this.actionEndLag=actionEndlag;
    this.actionDamage=actionDamage;
    this.actionHealing=actionHealing;
    this.actionManaRestore=actionManaRestore;
    this.actionManaCost=actionManaCost;
    this.actionManaDamage=actionManaDamage;
    this.animation=animation;
  }
  
  public void execute(Entity me, Entity target){
    me.setCurrentHealth(me.getCurrentHealth()+actionHealing);
    me.setCurrentMana(me.getCurrentMana()-actionManaCost);
    me.setCurrentMana(me.getCurrentMana()+actionManaRestore);
    
    target.setCurrentHealth(target.getCurrentHealth()-actionDamage);
    target.setCurrentMana(target.getCurrentMana()-actionManaDamage);
    
    animation.draw();
  }
  
  public void execute(Item item, Entity user){
    user.setHealth(user.getHealth()+actionHealing);
    user.setMana(user.getMana()+actionManaRestore);
    animation.draw();
  }
