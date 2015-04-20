package nl.utwente.di;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by destion on 20-4-15.
 */
public class Quoter {
    Map<String, Double> priceMap;

    public Quoter(){
        priceMap = new HashMap<>();
        this.init(priceMap);
    }

    public double getBookPrice(String name){
        if (priceMap.containsKey(name)){
            return this.priceMap.get(name);
        } else {
            return 0;
        }

    }

    public Map<String, Double> init(Map<String, Double> pm){
        pm.put("0", 0.0);
        pm.put("1", 10.0);
        pm.put("2", 45.0);
        pm.put("3", 20.0);
        pm.put("4", 35.0);
        pm.put("5", 50.0);
        return pm;
    }
}
