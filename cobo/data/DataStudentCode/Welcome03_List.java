
/*
Team BrainForked - Gloria Lee, Jack Chen, Hamim Sean
APCS
L08: America's Next Top Data Scientist
2022-04-06w
time spent: 3.5 hrs

 * Arrays of objects
 */

import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Welcome03_List {
   public static void main(String[] args) {
      DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/index.xml").load();
      ArrayList<WeatherStation> allstns = ds.fetchList("WeatherStation", "station/station_name",
             "station/station_id", "station/state",
             "station/latitude", "station/longitude");
      System.out.println("Total stations: " + allstns.size());

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a state abbreviation: ");
      String state = sc.next();
      System.out.println("Stations in " + state);
      for (WeatherStation ws : allstns) {
         if (ws.isLocatedInState(state)) {
            System.out.println("  " + ws.getId() + ": " + ws.getName());
         }
      }
      WeatherStation southern = new WeatherStation("Mon", "LLLL", 1, 1);
      for (int i = 0; i < allstns.length(); i ++) {
        if (ws.isMoreSouth(allstns.get(i))) {
          southern = allstns.get(i);
        }
      }
      System.out.println(southern);
   }
}
