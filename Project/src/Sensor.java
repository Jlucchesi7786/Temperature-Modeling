import java.util.*;

public class Sensor {
	private boolean working;
	private boolean badData;
	
	private double voltage;

	public Sensor() {
		working = true;
		badData = false;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean newState) {
		working = newState;
	}

	public boolean hasBadData() {
		return badData;
	}

	public void giveBadData(boolean newState) {
		badData = newState;
	}

	public String toString() {
		return "";
	}
}
