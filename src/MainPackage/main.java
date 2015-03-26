package MainPackage;

public class main {

	static char[] x = { 1, 2, 3, 4 };

	public static void main(String[] args) {
		MyInteger tester = new MyInteger(97);

		System.out.println(tester.isEven());
		System.out.println(tester.isOdd());
		System.out.println(tester.isPrime());

		System.out.println(MyInteger.isEven(41));
		System.out.println(MyInteger.isOdd(41));
		System.out.println(MyInteger.isPrime(41));

		System.out.println(MyInteger.isEven(tester));
		System.out.println(MyInteger.isOdd(tester));
		System.out.println(MyInteger.isPrime(tester));

		System.out.println(tester.equals(97));
		System.out.println(tester.equals(93));

		MyInteger tester2 = new MyInteger(93);
		System.out.println(tester.equals(tester2));

		System.out.println(MyInteger.parseInt(x));
		System.out.println(MyInteger.parseInt("1234"));
	}
}
