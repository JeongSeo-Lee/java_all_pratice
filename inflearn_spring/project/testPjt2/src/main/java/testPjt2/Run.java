package testPjt2;

import testPjt2.vo.ChargeBattery;
import testPjt2.vo.NomalBattery;

public class Run {
	public static void main(String [] args) {
		ElectronicCarToy car1 = new ElectronicCarToy(new NomalBattery());
		ElectronicRoboyToy Roboy = new ElectronicRoboyToy();
		ElectronicRadioToy Radio = new ElectronicRadioToy(new ChargeBattery());
		
	}

}
