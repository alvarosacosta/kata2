package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        String [] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        
        HistogramGenerator histogramGenerator = new HistogramGenerator(data);
        Map<String, Integer> histogram = histogramGenerator.getHistogram();
        
        Iterator<Map.Entry<String, Integer>> iteratorEntries = histogram.entrySet().iterator();
        while(iteratorEntries.hasNext()) {
            Map.Entry<String, Integer> entry = iteratorEntries.next();
            System.out.println(entry.getKey() + "==>" + entry.getValue());

        }
        
    }
}