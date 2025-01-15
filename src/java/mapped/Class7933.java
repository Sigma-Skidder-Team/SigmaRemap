// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.Map;

public class Class7933
{
    private static String[] field32597;
    private long field32598;
    private long field32599;
    private final Map<String, Class7933> field32600;
    
    private Class7933() {
        this.field32600 = Maps.newHashMap();
    }
    
    public void method25730(final Iterator<String> iterator, final long n) {
        this.field32599 += n;
        if (iterator.hasNext()) {
            this.field32600.computeIfAbsent(iterator.next(), p0 -> new Class7933()).method25730(iterator, n);
        }
        else {
            this.field32598 += n;
        }
    }
}
