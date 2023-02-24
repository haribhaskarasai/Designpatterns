package abstractlassesimplementingItem;

import concreteclassimplementingpacking.Bottle;
import interfacepackage.Item;
import interfacepackage.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
       return new Bottle();
	}

	@Override
	public abstract float price();

}
