public class CountHi {
	public static int countHi(String str) {
                int ctr = 0;
                for (int i = 0; i <= str.length() - 2; i++) {
                        if (str.substring(i, i + 2).equals("hi")) {
                                ctr++;
                        }
                }
                return ctr;
        }

	public static void main(String[] args) {
		System.out.println("abc hi ho: " + countHi("abc hi ho"));
                System.out.println("ABChi hi: " + countHi("ABChi hi"));
                System.out.println("hihi: " + countHi("hihi"));
	}
}
