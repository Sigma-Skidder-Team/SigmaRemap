// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map;

public class Class9319
{
    private static String[] field40016;
    private String field40017;
    private final Map<String, String> field40018;
    private final Set<String> field40019;
    
    public Class9319(final String field40017) {
        this.field40017 = null;
        this.field40018 = new LinkedHashMap<String, String>();
        this.field40019 = new LinkedHashSet<String>();
        this.field40017 = field40017;
    }
    
    public String method34500() {
        return this.field40017;
    }
    
    public void method34501(final String s, final String s2) {
        this.field40018.put(s, s2);
    }
    
    public void method34502(final Class9319 class9319) {
        if (class9319 != null) {
            this.field40018.putAll(class9319.field40018);
        }
    }
    
    public void method34503(final Class5601[] array) {
        for (int i = 0; i < array.length; ++i) {
            final Class5601 class5601 = array[i];
            final String s = this.field40018.get(class5601.method16860());
            if (s != null) {
                class5601.method16864(s);
            }
        }
    }
    
    public String[] method34504() {
        final Set<String> keySet = this.field40018.keySet();
        return keySet.toArray(new String[keySet.size()]);
    }
    
    public String method34505(final String s) {
        return this.field40018.get(s);
    }
    
    public void method34506(final String s) {
        this.field40019.add(s);
    }
    
    public void method34507(final String s) {
        this.field40019.remove(s);
    }
    
    public Collection<String> method34508() {
        return new LinkedHashSet<String>(this.field40019);
    }
    
    public void method34509(final Collection<String> collection) {
        this.field40019.addAll(collection);
    }
    
    public boolean method34510(final String s) {
        return this.field40019.contains(s);
    }
}
