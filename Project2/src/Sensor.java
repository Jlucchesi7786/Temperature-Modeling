import java.util.*;

public class Sensor {
	private boolean working;
	private boolean badData;

	private double voltage;

	public Sensor() {
		working = true;
		badData = false;
		decideVolts();
	}
	
	public void decideVolts() {
		voltage = Math.random() * 40.0;
	}

	public double getVolts() {
		if (working) {
			return voltage;
		} else if (badData) {
			return voltage / 2;
		}
		return 0;
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

	@Override
	public String toString() {
		return "";
	}
}
