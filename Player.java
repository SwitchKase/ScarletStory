package Game;

public class Player extends Entity{
	 private Item[] miscItems;
	 private Item[] equippedItems;
	 
	 
	 public Player()
	 {
		 super();
		 miscItems = new Item[10];
		 equippedItems[] = new Item[6];
		 //Slots 0-2 are armor(Head,Torso,Legs)
		 //Slots 3-4 are weapons(Left,Right)
		 //Slot 5 is usable items ex. smokebombs,scrolls
	 }
	 
	 public Player(String clas)
	 {
	 	Player();
	 	type=clas;
		 switch(type.toLowerCase())
		 {
		 case "rogue" : setMaxHealth(20); setMaxMana(100);
		 	break;
		 case "warrior" : setMaxHealth(200); setMaxMana(100);
		 	break;
		 case "elementalist" : setMaxHealth(100); setMaxMana(150);
		 	break;
		 case "beserker" :  setMaxHealth(130); setMaxMana(100);
		 	break;
		 case "beastmaster" :  setMaxHealth(100); setMaxMana(100);
		 	break; 
		 case "priest" :  setMaxHealth(80); setMaxMana(150);
		 	break;
		 
		 }
		 
	 }
	 
	 public void displayInventory(Graphics g){
	 	int originX=this.getXPos()+32-(miscItems.length/2);
	 	int originY=this.getYPos()+25;
	 	
	 	g.drawRect(originX,originY,miscItems.length*20,20);
	 	
	 	for(int i=0;i<miscItems.length;i++){
	 		miscItems[i].getInventoryAnimation().draw(originX+20*i,originY,20,20);
	 	}
	 	//draws item inventory
	 	
	 	originX=this.getposX()+32-60;
	 	originY=this.getY()+95;
	 	
	 	g.drawRect(originX,originY,60,60);
	 	for(int i=0;i<3;i++){
	 		equippedItems[i].getInventoryAnimation.draw(originX+20,originY-20*i,20,20);
	 	}
	 	equippedItems[3].getInventoryAnimation().draw(originX,originY-20,20,20);
	 	equippedItems[4].getInventoryAnimation().draw(originX+40,originY-20,20,20);
	 	equippedItems[5].getInventoryAnimation().draw(originX+40,originY-40,20,20);
	 	//draws equipped items
	 }
	 public void useItem(int slotID,int actionID){
	 	miscItems[slotID].doAction(actionID)
	 }
	 public void attack(String dir,int attackID){
	 	int d=0;
	 	if (dir.equals("left")){
	 		d=3;
	 	}
	 	else d=4;
	 	
	 	equippedItems[d].doAction(attackID);
	 }
	 public int getArmor(){
	 	int totalArmor=super.getArmor();
	 	for(int i=0;i<equippedItems.length;i++){
	 		totalArmor+=equipppedItems[i].getArmorValue();
	 	}
	 	return totalArmor;
	 }

}
