// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.ArrayList;

public class Class5831
{
    private final ArrayList field23914;
    private final HashMap field23915;
    private final HashMap field23916;
    private final HashMap field23917;
    private final float field23918;
    private final float field23919;
    
    public Class5831(final float field23918, final float field23919) {
        this.field23914 = new ArrayList();
        this.field23915 = new HashMap();
        this.field23916 = new HashMap();
        this.field23917 = new HashMap();
        this.field23918 = field23918;
        this.field23919 = field23919;
    }
    
    public float method17520() {
        return this.field23918;
    }
    
    public float method17521() {
        return this.field23919;
    }
    
    public void method17522(final String key, final String value) {
        this.field23915.put(key, value);
    }
    
    public void method17523(final String key, final Class5202 value) {
        this.field23916.put(key, value);
    }
    
    public String method17524(final String key) {
        return this.field23915.get(key);
    }
    
    public Class5202 method17525(final String key) {
        return this.field23916.get(key);
    }
    
    public String[] method17526() {
        return (String[])this.field23915.keySet().toArray(new String[0]);
    }
    
    public Class7567 method17527(final String key) {
        return this.field23917.get(key);
    }
    
    public void method17528(final Class7567 class7567) {
        this.field23914.add(class7567);
        this.field23917.put(class7567.method23757().method27579("id"), class7567);
        final Class5202 method17525 = this.method17525(class7567.method23757().method27586("fill"));
        if (method17525 != null) {
            if (method17525.method16269()) {
                for (int i = 0; i < Class8812.field37020; ++i) {
                    class7567.method23756().method9550();
                }
            }
        }
    }
    
    public int method17529() {
        return this.field23914.size();
    }
    
    public Class7567 method17530(final int index) {
        return this.field23914.get(index);
    }
    
    public void method17531(final Class7567 o) {
        this.field23914.remove(o);
        this.field23917.remove(o.method23757().method27579("id"));
    }
}
