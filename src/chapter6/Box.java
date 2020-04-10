package chapter6;

class Box {
	double width;
	double height;
	double depth;

	// This is the constructor for Box.

//	Box(double w, double h, double d) {
//		width = w;
//		height = h;
//		depth = d;
//	}

	// Use this to resolve name-space collisions.
	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	// This is the constructor for Box.
	Box() {
		System.out.println("Constructing Box");
		width = 10;
		height = 10;
		depth = 10;
	}

	// display volume of a box
	void volume() {
		System.out.print("Volume is ");
		System.out.println(width * height * depth);
	}

	// compute and return volume
	double volume1() {
		return width * height * depth;
	}

	// sets dimensions of box
	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

}
