package tw.idv.haocheng;

public class Tip2 {

	// ctrl + 2 - quick assist
	public static void main(String[] args) {
		//  extract local var
		new String("local var");

		// extract field
		new String("field");

		// extract method
		System.out.println(" extract method");

		// rename
		String wrongVar = "wrong";
		System.err.println(wrongVar);
	}

}
