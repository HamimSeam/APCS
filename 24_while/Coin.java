public class Coin {

  int value = 1;
  String upFace = "heads";
  String name = "penny";
  int flipCtr = 0;
  int headsCtr = 0;
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
    }
    else if (name == "nickel") {
      value = 5;
    }
    else if (name == "dime") {
      value = 10;
    }
    else if (name == "quarter") {
      value = 25;
    }
    else if (name == "half dollar") {
      value = 50;
    }
    else {
      value = 100;
    }
    return value;
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
