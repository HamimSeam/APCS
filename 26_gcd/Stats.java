/**
Ocho! | Tasnim Chowdhury, Nora Miller, Hamim Seam
HW26: GCD Three Ways
Time Spent: 0.6 hr
**/

/**
DISCO:
- In brute force, it doesn't matter if you start with a or b
- recursion is cleaner and shorter
QCC:
- pros and cons of recursion vs iterative?
AlGO: Initialize g (GCD). Check if a = b, if so output a. Check if either are equal to 0,
if so output 0. If a > b, redo but with (a-b), b. If b > a, do (a,(b-a)).
**/

public class Stats {
  public int mean(int a, int b) {
    return (a+b)/2;
  }

  public double mean(double a, double b) {
    return (a+b)/2.0;
  }

  public int Max(int a, int b) {
    if (a==b) {
      return a;
    } else if (a>b){
      return a;
    } else {
      return b;
    }
  }

/**
  public int geoMean(int a, int b) {
    return (Math.sqrt(a*b);
//incompatible types: possible lossy conversion from double to int
  }
**/

  public double geoMean(double a, double b) {
    return Math.sqrt(a*b);
  }

  public static int gcd(int a, int b) {
    int i = 1;
    int g = 0;
    while (i <= a) {
      if (a%i == 0 && b%i == 0) {g = i;}
      i++;
    }
    return g;
  }

  public static int gcdER(int a, int b) {
    int g = 0;
    if (a == b) { return a;}
    else if ((a == 0) || (b == 0)) {return (a-b);}
    else {
      if (a > b) {
        return gcdER((a-b),b);
      } else {
          return gcdER(a,(b-a));
        }
    }
  }

  public static int gcdEW(int a, int b) {
    int low = a;
    int high = b;
    int inter = 0;
    if (b < a) {
      low = b;
      high = a;
    }
    while (low != high) {
      if (high - low < low) {
        inter = high - low;
        high = low;
        low = inter;
      } else {
        inter = high - low;
        high = inter;
      }
    }
    return low;
  }

public static void main(String[] args) {
  System.out.println(gcd(5,5));
  System.out.println(gcd(15,50));
  System.out.println(gcd(55,120));
  System.out.println(gcdER(5,5));
  System.out.println(gcdER(15,50));
  System.out.println(gcdER(55,120));
  System.out.println(gcdEW(5,5));
  System.out.println(gcdEW(15,50));
  System.out.println(gcdEW(55,120));
  }
}
