/**
Hamim, Kevin, Jacob
APCS
HW34 -- A Pirate's Life for Me (Array Practice)
2021-11-12
time spent: 0.8 hours

DISCO:
The incrementation variable of a for loop exists only in the context of that loop
Arrays use length, while Strings use length()
Sometimes static variables can help keep track of recursive sequences

QCC:
Is linear search usually done with iteration?
How might one do the recursive methods without an extra counter variable?
**/


import java.util.Random;

public class Loopier {

	static int ctr = 0;

	public static String toString(int[] a) {
		String result = "{";
		for (int val: a) {
			result += val + ", ";
		}
		return result.substring(0, result.length() - 2) + "}";
	}

	public static void populate(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*100);
		}
	}

	public static int linSearch(int[] a, int target) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static int linSearchR(int[] a, int target) {
		int newCtr;
		if (a[0] == target) {
			newCtr = ctr;
			ctr = 0;
			return newCtr;
		}

		if (a.length == 1) {
			newCtr = ctr;
			ctr = 0;
			return -1;
		}
		ctr++;
		return linSearchR(cut(a), target);
	}

	public static int[] cut(int[] a) {
		int[] newA = new int[a.length - 1];
		for (int i = 1; i < a.length; i++) {
			newA[i - 1] = a[i];
		}
		return newA;
	}

	public static int freq(int[] a, int target) {
		int ctr = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) {
				ctr++;
			}
		}
		return ctr;
	}

	public static int freqR(int[] a, int target) {
		int newCtr;
		if (a[0] == target) {
			ctr++;
		}
		if (a.length == 1) {
			newCtr = ctr;
			ctr = 0;
			return newCtr;
		}
		return freqR(cut(a), target);
	}

	public static void main(String[] args) {
		int[] bob = new int[5];
		System.out.println("bob (pre populate): " + toString(bob));
		populate(bob);
		System.out.println("bob (post populate): " + toString(bob) + "\n");

		int[] joe = {3, 7, 8, 5, 7, 2, 4};
		System.out.println("joe = " + toString(joe));
		System.out.println("linSearch(joe, 7): " + linSearch(joe, 7));
		System.out.println("linSearch(joe, 4): " + linSearch(joe, 4));
		System.out.println("linSearch(joe, 1): " + linSearch(joe, 1) + "\n");

		System.out.println("linSearchR(joe, 7): " + linSearchR(joe, 7));
		System.out.println("linSearchR(joe, 4): " + linSearchR(joe, 4));
		System.out.println("linSearchR(joe, 1): " + linSearchR(joe, 1) + "\n");

		int[] dil = {4, 5, 8, 5, 6, 4, 7, 4};
		System.out.println("dil = " + toString(dil));
		System.out.println("freq(dil, 4): " + freq(dil, 4));
		System.out.println("freq(dil, 5): " + freq(dil, 5));
		System.out.println("freq(dil, 1): " + freq(dil, 1) + "\n");

		System.out.println("freqR(dil, 4): " + freqR(dil, 4));
		System.out.println("freqR(dil, 5): " + freqR(dil, 5));
		System.out.println("freqR(dil, 1): " + freqR(dil, 1) + "\n");
	}
}
