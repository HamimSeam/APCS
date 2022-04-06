/*
Team BrainForked - Gloria Lee, Jack Chen, Hamim Sean
APCS
L08: America's Next Top Data Scientist
2022-04-06w
time spent: 3.5 hrs
*/
import core.data.*;

public class Welcome01 {
   public static void main(String[] args) {
      String id = "KBFL";
      DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/" + id + ".xml");
      ds.setCacheTimeout(15 * 60);
      ds.load();
      //ds.printUsageString();
      float temp = ds.fetchFloat("temp_f");
      String loc = ds.fetchString("location");
      System.out.println("The temperature at " + loc + " is " + temp + "F");
   }
}
