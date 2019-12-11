

import java.util.Random;

public class Triangle {
	
	static String type = "";
	
	public Triangle() {
		super();
		
	}

	public static String checkTriangle(int side1, int side2, int side3) {

		if ((side1 + side2 > side3) && (side3 + side2 > side1) && (side1 + side3 > side2)) {
			if ((side1 != side2) && (side1 != side3) && (side2 != side3)) {
				type = "Is triangle scalene";
			} else {
				if (((side1 == side2) && (side1 != side3)) || ((side1 == side3) && (side1 != side2))							
						|| ((side2 == side3) && (side2 != side1))) {
					type = "Is triangle isosceles ";
				} else {
					type = "Is triangle equilateral ";
				}
			}
		} else {
			type = "Not a triangle";
		}
		return type;
	}


}
