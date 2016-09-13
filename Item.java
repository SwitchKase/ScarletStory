package Game;

public class Item {
	
	
	private String type;
	private int value,armor,keyID;
	private Animation InventoryAnimation;
	private Action[] actions;
	
	public Item(){
		type="MISC";
		actions = actions[3];
	}
	public Item(String type, Action[] actions){
		this.type=type;
		this.actions=actions;
	}
	
	public String getType(){
		return type;
	}
	public int getValue(){
		return value;
	}
	public int getArmorValue(){
		return armor;
	}
	public int getKeyID(){
		return keyID;
	}
	
	
	public void setType(String t){
		type=t;
	}
	public void setValue(int val){
		value=val;
	}
	public void setArmor(int armorValue){
		armor=armorValue;
	}
	public void setKeyID(int keyID){
		this.keyID=keyID;
	}
	
	public void doAction(int actionID){
		actions[actionID].execute(this);
	}
	public Animation getInventoryAnimation(){
		return inventoryAnimation;
	}

}
