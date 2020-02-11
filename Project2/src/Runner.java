import java.util.*;

public class Runner {
	static Sensor sens1 = new Sensor();
	static Sensor sens2 = new Sensor();
	
	static CompBox box1 = new CompBox(1);
	static CompBox box2 = new CompBox(2);
	
	public static void main(String[] args) {
		box1.rcvVoltage(sens1.getVolts());
		box2.rcvVoltage(sens2.getVolts());
		line();
		box1.calcTemp();
		box2.calcTemp();
		line();
		box2.rcvTemp(box1.sendTempCalc());
		box1.rcvTemp(box2.sendTempCalc());
		line();
		box1.decideTemp();
		box2.decideTemp();
	}
	
	public static void line() {
		System.out.println();
	}
}
