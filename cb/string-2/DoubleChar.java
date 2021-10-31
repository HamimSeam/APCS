public class DoubleChar {
	public static String doubleChar(String str) {
                String dbl = "";
                for (int i = 0; i <= str.length() - 1; i++) {
                        dbl += str.substring(i, i + 1) + str.substring(i, i + 1);
                }
                return dbl;
        }

	public static void main(String[] args) {
		System.out.println("The: " + doubleChar("The"));
                System.out.println("AAbb: " + doubleChar("AAbb"));
		System.out.println("Hi-There: " + doubleChar("Hi-There"));
	}
}
