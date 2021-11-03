/*
Hamim Seam, Tasnim Chowdhury
APCS
HW29 -- Which Way Do You Roll?
2021-11-02
time spent: 0.75 hour
DISCO
- for (String s : args) {} parses through array and can use it to test cases in complier
- Integer.parseInt() converts String to Integer
- Integer.toString() converts Integer to String
QCC
- how do you come up with recursive functions faster?
*/

public class Commafier {
	public static String commafyF(int inp) {
		String str = Integer.toString(inp);
		String com = "";
		for (int i = 0; i < str.length(); i++) {
			if ((str.length() - i)%3 == 0 && i != 0) {
				com += ",";
			}
			com += str.charAt(i);
		}
		return com;
	}

	public static String commafyR(int inp) {
		String ans = "";
    		String s = Integer.toString(inp);
    		int sLen = s.length();
    		if (sLen <= 3) {return s;}
    		return commafyR (Integer.parseInt(s.substring(0, sLen-3))) + "," + s.substring(sLen-3);
	}

	public static void main(String[] args) {
		for (String a : args) {
			System.out.println(commafyF(Integer.parseInt(a)));
			System.out.println(commafyR(Integer.parseInt(a)));
		}
	}
}
