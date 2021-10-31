public class CountCode {
	 public static int countCode(String str) {
                int ctr = 0;
                for (int i = 0; i <= str.length() - 4; i++) {
                        if (str.substring(i, i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e")) {
                                ctr++;
                        }
                }
                return ctr;
        }

	public static void main(String[] args) {
		System.out.println("aaacodebbb: " + countCode("aaacodebbb"));
                System.out.println("codexxcode: " + countCode("codexxcode"));
                System.out.println("cozexxcope: " + countCode("cozexxcope"));
	}
}
