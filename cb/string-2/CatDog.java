public class CatDog {
	public static boolean catDog(String str) {
                int catCtr = 0;
                int dogCtr = 0;
                for (int i = 0; i <= str.length() - 3; i++) {
                        if (str.substring(i, i + 3).equals("cat")) {
                                catCtr++;
                        }
                        else if (str.substring(i, i + 3).equals("dog")) {
                                dogCtr++;
                        }
                }
                return catCtr == dogCtr;
        }

	public static void main(String[] args) {
		System.out.println("catdog: " + catDog("catdog"));
		System.out.println("catcat: " + catDog("catcat"));
		System.out.println("1cat1cadodog: " + catDog("1cat1cadodog"));
	}
}
