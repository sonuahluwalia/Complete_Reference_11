package chapter7;

//Objects are passed through their references.

class Test2 {
	int a, b;

	Test2(int i, int j) {
		a = i;
		b = j;
	}

// pass an object
	void meth(Test2 o) {
		o.a *= 2;
		o.b /= 2;
	}
}
