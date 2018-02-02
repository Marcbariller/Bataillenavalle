package bataillenavale;

import java.util.ArrayList;

public class Player {
	private String name;
	private ArrayList<Ship> shiplist;

	public String getName() {
		return name;
	}

	public ArrayList<Ship> getshiplist() {
		return shiplist;
	}
	
	public Player(ArrayList<Ship> shiplist){
		this.shiplist = shiplist;
	}

}

