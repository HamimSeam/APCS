public class Methods {

  public static boolean isDivisible(int n, int m){
    return (n % m == 0);
  }

  public static boolean isTriangle(int a, int b, int c) {
    if (a > (b + c)) {
      return false;
    } else if (b > (a + c)) {
        return false;
    } else if (c > (a + b)) {
        return false;
    } else {
      return true;
    }
  }

  public static int ack(int m, int n) {
    if (m == 0) {
      return (n + 1);
    } else if ((m > 0) && (n == 0)) {
        return ack(m - 1, 1);
    } else if ((m > 0) && (n > 0)) {
        return ack(m-1, ack(m, n-1));
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    int n = 0;
    int m = 3;
    String s;
    int a, b, c;
    a = 4;
    b = 5;
    c = 10;
    System.out.print("Exercise 2: ");
    System.out.println(isDivisible(n, m));
    System.out.print("Exercise 3: ");
    System.out.println(isTriangle(a, b, c));
    System.out.print("Exercise 8: ");
    System.out.println(ack(m, n));
    //System.out.println(s);
  }
}
