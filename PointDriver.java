/*Driver for point code
Kyle Lowtharp
*/



public class PointDriver {
	//Give them values
	public static void main(String[] args ) {
	Point lowerLeft = new Point();
	Point upperRight = new Point();
	Point middlePoint = new Point();

	lowerLeft.x = 0.0;
	lowerLeft.y = 0.0;

	upperRight.x = 1280.0;
	upperRight.y = 1024.0;

	middlePoint.x = 640.0;
	middlePoint.y = 512.0;
	// Print one of the points
	upperRight.printPoint();
	//clear it
	upperRight.clear();
	//print the points
	upperRight.printPoint();
	}
}
