/*
Hamim Seam
APCS
HW 23 -- What Does Equality Look Like? (Coins, Preconditions and Postconditions)
2021-10-24
time spent: ~0.5 hours

DISCO:
When connecting two comparative statements in an if argument, you must enclose both statements in parentheses.
If I remember correctly, this wasn't the case in Python.
For example:
((upFace = "heads") or (upFace = "tails"))
and not...
(upFace = "heads" or upFace = "tails")
When I put an if else statement within another if statement, I had to make a return line for the big statement even though the if-else one already both gave outputs.


QCC:
Should you give instance variables default values in a default constructor, or when they are initizalized, and leaving the default constructor empty?
When we get to arrays, we most likely be more able to limit what values a method can take without breaking it.
(i.e. when assigning a name we need to manually )
What does it really mean for an object to be "null"? Does it have to be missing some attributes? All of them?
(In the end I assumed in this case it referred to upFace)
Note to self: || and &&, not "or" and "and"

*/

public class Coin {

  int value = 1;
  String upFace = "heads";
  String name = "penny";
  int flipCtr = 0;
  int headsCtr = 1;
  int tailsCtr = 0;
  double bias = 0.5;

  public Coin() {

  }

  public Coin( String s ) {
    name = s;
  }

  public Coin( String s, String nowFace ) {
    name = s;
    upFace = nowFace;
  }

  public String getUpFace() {
    return upFace;
  }

  public int getFlipCtr() {
    return flipCtr;
  }

  public double getValue() {
    return value;
  }

  public int getHeadsCtr() {
    return headsCtr;
  }

  public int getTailsCtr() {
    return tailsCtr;
  }

  private double assignValue( String s ) {
    if (name == "penny") {
      value = 1;
      return value;
    }
    else if (name == "nickel") {
      value = 5;
      return value;
    }
    else if (name == "dime") {
      value = 10;
      return value;
    }
    else if (name == "quarter") {
      value = 25;
      return value;
    }
    else if (name == "half dollar") {
      value = 50;
      return value;
    }
    else {
      value = 100;
      return value;
    }
  }

  public void reset( String s, double d ) {
    if (((s == "heads") || (s == "tails")) && (d >= 0.0) && (d <= 1.0)) {
      int value = 1;
      String upFace = "heads";
      String name = "penny";
      int flipCtr = 0;
      int headsCtr = 1;
      int tailsCtr = 0;
      double bias = 0.5;
    }
  }

  public String flip() {
    if (bias >= 0.0 && bias <= 1.0) {
      if (Math.random() < bias) {
        upFace = "heads";
        flipCtr++;
        headsCtr++;
      }
      else {
        upFace = "tails";
        flipCtr++;
        tailsCtr++;
      }
    }
    return upFace;
  }

  public boolean equals( Coin other ) {
    if (other.upFace != "null") {
      if (upFace == other.upFace) {
        return true;
      }
      else {
        return false;
      }
    }
    return false;
  }

  public String toString() {
    return name + ": " + upFace;
  }

}
