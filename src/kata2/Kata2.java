package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int [] data = {1, 6, 2, 8, 3, 8, 2, 7, 3, 4, 2, 9, 0, 6};
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        Iterator<Map.Entry<Integer, Integer>> iteratorEntries = histogram.entrySet().iterator();
        while(iteratorEntries.hasNext()) {
            Map.Entry<Integer, Integer> entry = iteratorEntries.next();
            System.out.println(entry.getKey() + "==>" + entry.getValue());

        }
        
    }
}