
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Triangle {
	static String type = "";
	static Set trace = new HashSet();
	public Triangle() {
		super();
	}

	public static java.lang.String checkTriangle( int side1, int side2, int side3 )
	{
		trace.add( new java.lang.Integer( 2 ) );
		if (side1 + side2 > side3 && side3 + side2 > side1 && side1 + side3 > side2) {
			trace.add( new java.lang.Integer( 3 ) );
			if (side1 != side2 && side1 != side3 && side2 != side3) {
				trace.add( new java.lang.Integer( 4 ) );
				type = "Is triangle scalene";
			} else {
				trace.add( new java.lang.Integer( 5 ) );
				if (side1 == side2 && side1 != side3 || side1 == side3 && side1 != side2 || side2 == side3 && side2 != side1) {
					trace.add( new java.lang.Integer( 6 ) );
					type = "Is triangle isosceles ";
				} else {
					trace.add( new java.lang.Integer( 7 ) );
					type = "Is triangle equilateral ";
				}
			}
		} else {
			trace.add( new java.lang.Integer( 8 ) );
			type = "Not a triangle";
		}
		return type;
	}

	public static void newTrace() {
		trace = new HashSet();
	}

	public static Set getTrace() {
		return trace;
	}


}
