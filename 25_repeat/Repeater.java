/*
Hamim Seam and Vansh Saboo
APCS
HW25 -- Do I repeat myself? (While Loops and Recursion)
2021-10-26
time spent: ~0.5 hours

DISCO:
Recursion should have a recursive block of code and a line that will handle when the code reaches a certain level, stopping the recursion.

QCC:
I wanted to make fenceR run without System.out.println() in the main() menthod (like fenceW) but couldn't do it.

*/

public class Repeater {
	public static void fenceW(int numPosts) {
		int i = 1;
		String fence = "|";
		while (i < numPosts) {
		 	fence += "--|";
			i++;
		}
		System.out.println(fence);
	}

	public static String fenceR(int numPosts) {
		if (numPosts == 1) {
			return "|";
		}

		return fenceR(numPosts - 1) + "--|";
	}


	public static void main(String[] args) {
		System.out.println("While: ");
		fenceW(1);
		fenceW(2);
		fenceW(3);
		fenceW(10);

		System.out.println("\nRecursion: ");
		System.out.println(fenceR(1));
		System.out.println(fenceR(2));
		System.out.println(fenceR(3));
		System.out.println(fenceR(10));
	}
}
