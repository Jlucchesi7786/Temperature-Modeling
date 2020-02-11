import java.util.*;

public class CompBox {
	private int number;
	
	private boolean working;
	
	private double voltageRCV;
	
	private double tempCalc;
	private double otherTemp;
	private double decidedTemp;
	
	public CompBox() {
		working = true;
		number = 0;
	}
	
	public CompBox(int num) {
		working = true;
		number = num;
	}
	
	public void calcTemp() {
		tempCalc = voltageRCV * 10;
		System.out.println("Box " + number + " calculated a temp of " 
				+ tempCalc + " degrees Rankine.");
	}
	
	public void decideTemp() {
		if (tempCalc < otherTemp) {
			decidedTemp = otherTemp;
		} else {
			decidedTemp = tempCalc;
		}
		System.out.println("Box " + number + " has decided on the temperature of " 
				+ decidedTemp + " degrees Rankine.");
	}
	
	public void rcvVoltage(double newVoltage) {
		voltageRCV = newVoltage;
		System.out.println("Box " + number + " recieved a voltage.");
	}
	
	public double getDecidedTemp() {
		return decidedTemp;
	}
	
	public double sendTempCalc() {
		System.out.println("Box " + number + " sent a temperature to the other box.");
		return tempCalc;
	}
	
	public void rcvTemp(double otherBoxTemp) {
		otherTemp = otherBoxTemp;
		System.out.println("Box " + number + " recieved a temperature from the other box.");
	}
	
	@Override
	public String toString() {
		return "";
	}
}
