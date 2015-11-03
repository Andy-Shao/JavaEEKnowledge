package predictions;

import java.util.concurrent.ConcurrentHashMap;

// In-memory data source simulating a persistent data store.
public class DataStore {
    private static final ConcurrentHashMap<String , String> map;

    static {
        map = new ConcurrentHashMap<String , String>();
        DataStore.map.put("moe" , "MoeMoeMoe");
        DataStore.map.put("curly" , "CurlyCurlyCurly");
        DataStore.map.put("larry" , "LarryLarryLarry");
    }

    public static String get(String key) {
        return DataStore.map.get(key);
    }
}