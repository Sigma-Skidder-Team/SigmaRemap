// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import totalcross.json.JSONObject;

import java.util.Date;
import java.util.TreeMap;

public class Class8502
{
    public TreeMap<Date, String> field34902;
    
    public Class8502() {
        this.field34902 = new TreeMap<Date, String>();
        System.out.println("new");
    }
    
    public void method28415(Long value, final String value2) {
        while (this.field34902.containsKey(new Date(value))) {
            ++value;
        }
        this.field34902.put(new Date(value), value2);
    }
    
    public JSONObject method28416() {
        return new JSONObject(this.field34902);
    }
}
