public class Loops{

  public static double power(double x, int n){
    double total = 1;
    for (int a=1; a<n+1; a++){
      total *= x;
    }
    return total;
  }

  public static int factorial(int input){
    int total = 1;
    for (int a=input; a>0; a--){
      total *= a;
    }
    return total;
  }
  public static void main(String args[]){
    System.out.println("Exercise 3: " + power(3, 4));
    System.out.println("Exercise 4: " + factorial(7));
  }
}
