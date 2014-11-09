package tw.idv.haocheng;

public class Tip7 {

	// selection
	public static long fibonacci(long number) {
		// Shift + Alt + Up/Down -> Select Enclosing Element
		if ((number == 0) || (number == 1)) {
			return number;
		} else {
			return fibonacci(number - 1) + fibonacci(number - 2);
		}
	}

	public static void main(String[] args) {
		for (int counter = 0; counter <= 10; counter++) {
			System.out.printf("Fibonacci of %d is: %d\n", counter,
					fibonacci(counter));
		}

		// Shift + Alt + A -> Block Selection
		String name1 = "phone1";
		String name2 = "phone2";
		String name3 = "phone3";
	}

}
