package kata2;

import java.util.HashMap;
import java.util.Map;

public class HistogramGenerator {
    int[] data;

    public HistogramGenerator(int[] data) {
        this.data = data;
        
    }

    public Map<Integer, Integer> getHistogram() {
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        for (int key : this.data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        return histogram;
    }
    
    
}