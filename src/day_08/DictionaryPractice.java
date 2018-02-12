/*
 * Hacker Rank Day 8
 * Dictionary and HashMap
 */
package day_08;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {


    public static void main(String[] args) {
        // English to Spanish Dictionary
        Map<String,String> englSpanDictionary = new HashMap();
        // Putting things in the dictionary
        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Marles");
        englSpanDictionary.put("Wednesday", "Miercoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        englSpanDictionary.put("Saturday", "Sabado");
        englSpanDictionary.put("Sunday", "Domingo");
        // Retrieve things from the dictionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
        // Print out all keys
        System.out.println(englSpanDictionary.keySet());
        // Print all values
        System.out.println(englSpanDictionary.values());
        // Print out size
        System.out.println("The size of out Dictionary is "+ englSpanDictionary.size());

        System.out.println();
        System.out.println();

        // Shopping List.
        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar",false);
        // Retrieve Items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Oreos"));
        // Key-Value Pairs Pring Out
        System.out.println(shoppingList.toString());
        System.out.println(shoppingList.isEmpty());
        // Remove things
        shoppingList.remove("Eggs");
        // Replace values for a certain key
        shoppingList.replace("Bread", Boolean.FALSE);
        System.out.println(shoppingList.toString());

        // Clear out dictionary
        shoppingList.clear();
        System.out.println(shoppingList.toString());
        System.out.println(shoppingList.isEmpty());
    }
}
