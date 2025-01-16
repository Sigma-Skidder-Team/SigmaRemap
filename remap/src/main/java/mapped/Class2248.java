// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.IdentityHashMap;
import java.util.Map;

public class Class2248<T> implements Iterable<Class9455<T>>
{
    private final Registry<T> field13785;
    private final Map<T, Class9455<T>> field13786;
    
    public Class2248(final Registry<T> field13785) {
        this.field13786 = new IdentityHashMap<T, Class9455<T>>();
        this.field13785 = field13785;
    }
    
    public boolean method8446(final T t) {
        return this.field13786.containsKey(t);
    }
    
    public Class9455<T> method8447(final T key, final Class9109 class9109) {
        return this.field13786.computeIfAbsent(key, o2 -> new Class9455((Class2248<Object>)this, o2, class9110));
    }
    
    public Registry<T> method8448() {
        return this.field13785;
    }
    
    @Override
    public Iterator<Class9455<T>> iterator() {
        return this.field13786.values().iterator();
    }
    
    public Class9455<T> method8449(final T t) {
        return this.method8447(t, Class9109.field38589);
    }
    
    public String method8450() {
        return "stat_type." + Registry.field238.getKey(this).toString().replace(':', '.');
    }
}
