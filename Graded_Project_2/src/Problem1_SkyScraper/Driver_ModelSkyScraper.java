package Problem1_SkyScraper;

public class Driver_ModelSkyScraper {
	public static int totalFloors;

	public static int[] totalFloorSize;

	public static void main(String[] args) {
		BuildFloors objDriver = new BuildFloors();
		objDriver.userInputs();
		objDriver.orderOfConstruction(objDriver.totalFloorSize);
	}
}
