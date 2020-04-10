package chapter7;
//Automatic type conversions apply to overloading.

public class OverloadDemo1 {
	void test() {
		System.out.println("No parameters");
	}

	// Overload test for two integer parameters.
	void test(int a, int b) {
		System.out.println("a and b: " + a + " " + b);
	}

	// overload test for a double parameter and return type
	void test(double a) {
		System.out.println("Inside test(double) a: " + a);
	}

}
