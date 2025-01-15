// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;
import java.util.TreeMap;

public class Class6086 implements Class6091
{
    private byte[] field24699;
    private TreeMap<String, String> field24700;
    
    public Class6086() {
        this.field24700 = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
    }
    
    @Override
    public Iterator<String> method18144() {
        return Collections.unmodifiableSet((Set<? extends String>)this.field24700.keySet()).iterator();
    }
    
    @Override
    public String method18145(final String key) {
        final String s = this.field24700.get(key);
        if (s != null) {
            return s;
        }
        return "";
    }
    
    @Override
    public byte[] method18146() {
        return this.field24699;
    }
    
    @Override
    public void method18147(final byte[] field24699) {
        this.field24699 = field24699;
    }
    
    @Override
    public void method18148(final String key, final String value) {
        this.field24700.put(key, value);
    }
    
    @Override
    public boolean method18149(final String key) {
        return this.field24700.containsKey(key);
    }
}
