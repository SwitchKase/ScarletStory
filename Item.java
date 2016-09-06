package Game;

public class Item {
	
	
	private String type;
	private int dmg,value,armor,keyID,healthRestore,manaRestore;
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
	
	public void doAction(int actionID){
		actions[actionID].execute(this);
	}
	public Animation getInventoryAnimation(){
		return inventoryAnimation;
	}

}
