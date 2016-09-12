package Game;

public class HauntedTree extends Enemy{
  public HauntedTree(){
    super();
  }
  
  public HauntedTree(int currentHealth,int maxHealth,int currentMana,int maxMana,int crit,int posX,int posY, Animation[] animations){
    super(currentHealth,maxHealth,currentMana,maxMana,0,crit,posX,posY,animations,"HauntedTree");
  }
  
  public void act(ArrayList<Entity> entityList){
    //has a low chance of sweeping with a branch
    if((int)(Math.random()*500==0){
      //FIX LAG NUMBERS, ADD ART TO ENTIRE CLASS
      //Check knockback for balance
      doAction(new Action("BranchSweep",0,0,0,50,0,0,5,0,0,0,dir*5,7,new Rectangle(this.getPosX(),this.getPosY(),50,100),animations[1]));
    }
    
    //has a high chance of firing a leaf in a random direction
    if((int)(30*Math.random())==0){
      //Looking to optimize, as making a new array every few frames is laggy
      Animation[] leafAnimation= new Animation[1];
      leafAnimation[1]=animations[2];
      entityList.add(new Projectile(5,5,0,0,1,Math.random()*5,Math.random()*5,5,7,"HauntedTreeLeaf",leafAnimation,this));
    }
  }
