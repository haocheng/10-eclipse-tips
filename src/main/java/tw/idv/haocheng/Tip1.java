package tw.idv.haocheng;


public class Tip1 {

	// ctrl + 1 - quick fix
	public static void main(String[] args) {
		// extract local var
		new String("local var");

		// extract field
		new String("field");

		// import
		// new Date();

		// try catch or throw
		// throw new IOException();

		// inline
		String shouldInline = "inline";
		System.err.println(shouldInline);
	}

}
