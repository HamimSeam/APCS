public class HelloName {
	 public static String helloName(String name) {
                return "Hello " + name + "!";
        }

	public static void main(String[] args) {
                System.out.println("Bob: " + helloName("Bob"));
                System.out.println("Alice: " + helloName("Alice"));
                System.out.println("X: " + helloName("X"));
	}
}
