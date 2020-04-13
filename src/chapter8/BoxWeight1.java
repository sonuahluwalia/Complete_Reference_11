package chapter8;

//BoxWeight now uses super to initialize its Box attributes.
class BoxWeight1 extends Box {
	double weight; // weight of box

// initialize width, height, and depth using super()
	BoxWeight1(double w, double h, double d, double m) {
		super(w, h, d); // call superclass constructor
		weight = m;
	}
}
