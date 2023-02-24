package abstractlassesimplementingItem;

import concreteclassimplementingpacking.Wrapper;
import interfacepackage.Item;
import interfacepackage.Packing;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
