package hashmap;

import java.util.*;

public class learn_hashmap {
    static void hashmapmethods() {
        Map<String, Integer> mp = new HashMap<>();
        // adding elements
        mp.put("AKkhil", 30);
        mp.put("Rina", 60);
        mp.put("AKash", 40);
        mp.put("jack", 70);
        mp.put("mishti", 20);
        // getting value of a key from the HashMap
        System.out.println(mp.get("jack"));
        // changing value of a key
        mp.put("AKash", 25);
        // removing a pair from the hashmap
        mp.remove("mishti"); // Corrected line
        System.out.println(mp.containsKey("jack"));
    }

    public static void main(String[] args) {
        hashmapmethods();
    }
}
