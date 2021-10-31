public class EndOther {
	public static boolean endOther(String a, String b) {
                String main;
                String end;
                if (a.length() < b.length()) {
                        end = a;
                        main = b;
                }
                else {
                        end = b;
                        main = a;
                }
                if (main.substring(main.length() - end.length()).toLowerCase().equals(end.toLowerCase())) {
                        return true;
                }
                else  {
                        return false;
                }
        }

	public static void main(String[] args) {
                System.out.println("Hiabc, abc: " + endOther("Hiabc", "abc"));
                System.out.println("AbC, HiaBc: " + endOther("AbC", "HiaBc"));
                System.out.println("abc, abXabc: " + endOther("abc", "abXabc"));
	}
}
