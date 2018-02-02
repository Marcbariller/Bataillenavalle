package bataillenavale;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import model.Ship;
import util.Position;

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

    private List<Position> getShipCellList(Ship[] shipList) {
        List<Position> cellList = new ArrayList<Position>();
        for (int i = 0; i < shipList.length; i++) {
            for (int j = 0; j < shipList[i].getLength(); j++) {
               
    }
}

