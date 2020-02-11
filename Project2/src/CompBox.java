import java.util.*;

public class CompBox {
	private boolean working;
	
	private double voltageRCV;
	
	private double tempCalc;
	private double otherTemp;
	private double decidedTemp;
	
	public CompBox() {
		working = true;
	}
	
	public double getTempCalc() {
		return tempCalc;
	}
	
	public void rcvTemp(double otherBoxTemp) {
		otherTemp = otherBoxTemp;
	}
	
	@Override
	public String toString() {
		return "";
	}
}
