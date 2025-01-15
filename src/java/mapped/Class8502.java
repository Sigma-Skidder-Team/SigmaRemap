// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
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
    
    public Class4405 method28416() {
        return new Class4405(this.field34902);
    }
}
