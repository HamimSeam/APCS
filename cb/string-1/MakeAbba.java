public class MakeAbba {
	public static String makeAbba(String a, String b) {
                return a + b + b + a;
        }

	public static void main(String[] args) {
		System.out.println("Hi, Bye: " + makeAbba("Hi", "Bye"));
                System.out.println("Yo, Alice: " + makeAbba("Yo", "Alice"));
                System.out.println("What, Up: " + makeAbba("What", "Up"));
	}
}
