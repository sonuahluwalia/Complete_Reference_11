package chapter7;

//This program will not compile.
class Outer2 {
	int outer_x = 100;
	static int outer_y = 10;
	
	void test() {
		Inner inner = new Inner();
		inner.display();
	}

// this is an inner class
	class Inner {
		int y = 10; // y is local to Inner

		void display() {
			System.out.println("display: outer_x = " + outer_x);
		}
		
	}

	static class Inner1 {
		static int x = 10;
		static void display() {
			System.out.println("display: outer_y = " + outer_y);			
		}
		
	}
	void showy() {
		//System.out.println(y); // error, y not known here!
	}
}

class InnerClassDemo1 {
	public static void main(String args[]) {
		Outer2 outer = new Outer2();
		outer.test();
		Outer2.Inner inner = outer.new Inner();
		inner.display();
		Outer2.Inner1.display();
	}
}
