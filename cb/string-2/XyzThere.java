public class XyzThere {
	public static boolean xyzThere(String str) {
                int xyzCtr = 0;
                int dotCtr = 0;
                for (int i = 0; i <= str.length() - 3; i++) {
                        if (str.substring(i, i + 3).equals("xyz")) {
                                xyzCtr++;
                        }
                }
                for (int i = 0; i <= str.length() - 4; i++) {
                        if (str.substring(i, i + 4).equals(".xyz")) {
                                dotCtr++;
                        }
                }
                return !(xyzCtr == dotCtr);
        }

	public static void main(String[] args) {
		System.out.println("abcxyz: " + xyzThere("abcxyz"));
                System.out.println("abc.xyz: " + xyzThere("abc.xyz"));
                System.out.println("xyz.abc: " + xyzThere("xyz.abc"));
	}
}
