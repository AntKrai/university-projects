import java.util.HashMap; 
import java.util.ArrayList;
import java.util.HashSet;


public class Tour {
    static void print_countries_cities(){
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Sweden", "Stockholm");   
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
          }
          if(capitalCities.containsKey("Sweden")){
            System.out.println("Sweden is on the list!");
        }
        System.out.println("The amount of countries and their capitals on the list is: "+ capitalCities.size());

    }

    static void print_cities(){
        ArrayList<String> cities = new ArrayList <String>();
        cities.add("Berlin");
        cities.add("London");
        cities.add("Kyiv");
        cities.add("Warsaw");
        cities.add("Parris");
        cities.add("Warsaw");
        System.out.print("Cities that we have visited are: ");
        for(String i : cities){
            System.out.print(i + " ");
        }

    }

    static void print_unique_cities(){
        HashSet<String> unique_cities = new HashSet<>();
        HashSet<String> unique = new HashSet<>();
        unique_cities.add("Rome");
        unique_cities.add("Lviv");
        unique_cities.add("London");
        unique_cities.add("Wroclaw");
        unique_cities.add("Rome");
        for (String i : unique_cities) {
            unique.add(i);
        }
        System.out.print("The list of all unique visited cities by our team");
        for(String i : unique){
            System.out.print(" " + i);
        }
        for(String i : unique){
            if(i == "Rome"){
             System.out.println("\n Rome is on the list!");
            }
        }


    }
    
    static void main(String [] args){
        //print_countries_cities();
        //print_cities();
        print_unique_cities();
    }
}
