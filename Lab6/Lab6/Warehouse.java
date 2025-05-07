package Lab6;

import java.util.ArrayList;
import java.util.Arrays;

public class Warehouse {
    public static void main(String[] args) {
    
        Tools toolError = new Tools(); 
        Tools toolHammer = new Tools("Hammer", 1.2, "Steel", "Red"); 
        Tools toolHammerCopy = new Tools(toolHammer);

        System.out.println("\n--- Individually Created Tools ---");
        toolError.display();
        toolHammer.display();
        toolHammerCopy.display();
        
        Tools[] toolsArray = new Tools[3];
        System.out.println("\n--- Trying to display toolsArray before initialization ---");
        try {
            toolsArray[0].display();
        } catch (NullPointerException e) {
            System.out.println("toolsArray[0] is null!");
        }

        System.out.println("\n--- Filling toolsArray with default tool ---");
        Arrays.fill(toolsArray, new Tools("Wrench", 2.0, "Iron", "Gray"));

        for (Tools tool : toolsArray) {
            tool.display();
        }

        ArrayList<Tools> toolList = new ArrayList<>();
        toolList.add(new Tools());
        toolList.add(new Tools("Screwdriver", 0.5, "Aluminum", "Blue"));
        toolList.add(new Tools(toolList.get(1)));

        System.out.println("\n--- Tools in Collection ---");
        for (Tools tool : toolList) {
            tool.display();
        }

        System.out.println("\nTotal number of Tool objects created: " + Tools.getCount());
    }
}
