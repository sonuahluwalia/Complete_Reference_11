package chapter7;

//A simple example of recursion.
class Factorial {
// this is a recursive function
	int fact(int n) {
		int result;

		if (n == 1)
			return 1;
		result = fact(n - 1) * n;
		return result;
	}
}
