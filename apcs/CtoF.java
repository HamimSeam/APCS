import java.util.Scanner;

public class CtoF{

  public static void main(String[] args){
    double celsius;
    double fahrenheit;

    final double ninfif = 1.8;
    final double c = 32;
    Scanner in = new Scanner(System.in);

    System.out.print("Enter Celsius: ");
    celsius = in.nextDouble();

    fahrenheit = ((celsius * ninfif) + c);
    System.out.printf("%.1f C = %.1f F", celsius, fahrenheit);
  }
}
