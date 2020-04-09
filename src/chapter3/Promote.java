package chapter3;

class Promote {
	public static void main(String args[]) {
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = .1234;
		double result = (f * b) + (i / c) - (d * s);
		System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
		System.out.println("result = " + result);
		
		byte b1 = 9;
		byte b2 = 9;
		byte b3 = (byte) (b1 * b2);
		
		char c1 = 'a';
		char c2 = 'a';
		char c3 = (char) (c1*c2);
		
		
		long l1 = 3;
		long l2 = 4;
		long l3 = l1*l2;
		
		float f1 = 2.3f;
		float f2 = 2.3f;
		float f3 = f1 * f2;
		
		double d1 = 3.4;
		double d2 = 3.4;
		double d3 = d1 * d2;
		
		
	}
}
