package kata2;

import java.util.HashMap;
import java.util.Map;

public class HistogramGenerator<T> {
    T[] data;

    public HistogramGenerator(T[] data) {
        this.data = data;
        
    }

    public Map<T, Integer> getHistogram() {
        Map<T, Integer> histogram = new HashMap<T, Integer>();
        for (T key : this.data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        return histogram;
    }
    
    
}