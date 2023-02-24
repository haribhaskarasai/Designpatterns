package concreteclassimplementingpacking;

import interfacepackage.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}

}
