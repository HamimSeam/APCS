public class Time {

  public static void main(String[] args) {
    int hour = 13;
    int minute = 13;
    int second = 13;

    int secSinceMid = ((hour * 3600) + (minute * 60) + second);
    System.out.println("Time now: " + hour + ":" + minute + ":" + second);
    System.out.println("Seconds since midnight: " + secSinceMid);
    System.out.println("Seconds remaining in the day: " + ((24 * 3600) - secSinceMid));
    System.out.println("Percent of the day passed: "+ (secSinceMid * 100) / (24 * 3600));
    hour = 14;
    minute = 3;
    second = 1;
    int newTime = ((hour * 3600) + (minute * 60) + second);
    System.out.println(newTime - secSinceMid + " seconds have passed");
  }
}
