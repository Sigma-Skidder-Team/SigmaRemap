// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public class Class7979
{
    private static String[] field32839;
    private final List<Class7591> field32840;
    
    private Class7979() {
        this.field32840 = Lists.newArrayList();
    }
    
    public static Class7979 method26008() {
        return new Class7979();
    }
    
    public Class7979 method26009(final Class7111<?> class7111, final String s) {
        this.field32840.add(new Class7590(class7111.method21826(), s));
        return this;
    }
    
    public Class7979 method26010(final Class7111<Integer> class7111, final int i) {
        return this.method26009(class7111, Integer.toString(i));
    }
    
    public Class7979 method26011(final Class7111<Boolean> class7111, final boolean b) {
        return this.method26009(class7111, Boolean.toString(b));
    }
    
    public <T extends Comparable<T> & Class103> Class7979 method26012(final Class7111<T> class7111, final T t) {
        return this.method26009(class7111, t.method596());
    }
    
    public Class9357 method26013() {
        return new Class9357(this.field32840, null);
    }
}
