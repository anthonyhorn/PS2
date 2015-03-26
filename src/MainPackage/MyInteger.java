package MainPackage;

public class MyInteger {

	private int value;

	public MyInteger(int a) {
		this.value = a;
	}

	public int get() {
		return value;
	}

	public boolean isEven() {
		boolean test = false;
		if (this.value % 2 == 0) {
			test = true;
		}
		return test;
	}

	public boolean isOdd() {
		boolean test = false;
		if (this.value % 2 == 1) {
			test = true;
		}
		return test;
	}

	public boolean isPrime() {
		boolean test = true;
		for (int i = 2; i < this.value / 2; i++) {
			if (this.value % i == 0) {
				test = false;
			}
		}
		return test;
	}

	public static boolean isEven(int value) {
		boolean test = false;
		if (value % 2 == 0) {
			test = true;
		}
		return test;
	}

	public static boolean isOdd(int value) {
		boolean test = false;
		if (value % 2 == 1) {
			test = true;
		}
		return test;
	}

	public static boolean isPrime(int value) {
		boolean test = true;
		for (int i = 2; i < value / 2; i++) {
			if (value % i == 0) {
				test = false;
			}
		}
		return test;
	}

	public static boolean isEven(MyInteger something) {
		boolean test = false;
		if (something.value % 2 == 0) {
			test = true;
		}
		return test;
	}

	public static boolean isOdd(MyInteger something) {
		boolean test = false;
		if (something.value % 2 == 1) {
			test = true;
		}
		return test;
	}

	public static boolean isPrime(MyInteger something) {
		boolean test = true;
		for (int i = 2; i < something.value / 2; i++) {
			if (something.value % i == 0) {
				test = false;
			}
		}
		return test;
	}

	public boolean equals(int x) {
		return (x == this.value);
	}

	public boolean equals(MyInteger x) {
		return (x.value == this.value);
	}

	public static int parseInt(char[] x) {
		int len = x.length;
		int collector = 0;
		for (int i = 0; i < len; i++) {
			collector += x[i] * Math.pow(10, len - i - 1);
		}
		return collector;
	}

	public static int parseInt(String x) {
		return Integer.parseInt(x);
	}
}
