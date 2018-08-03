package app;

import controller.WarehouseController;

/**
 *
 * @author Tabi
 */
public class Main {
	
	private static WarehouseController controller;

	public static void main(String[] args) {
		controller = new WarehouseController();
		controller.loadLayout();
	}

}
