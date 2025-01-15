// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Comparator;
import java.util.Arrays;

public enum Class2141
{
    field12605(0, "small_ball"), 
    field12606(1, "large_ball"), 
    field12607(2, "star"), 
    field12608(3, "creeper"), 
    field12609(4, "burst");
    
    private static final Class2141[] field12610;
    private final int field12611;
    private final String field12612;
    
    private Class2141(final int field12611, final String field12612) {
        this.field12611 = field12611;
        this.field12612 = field12612;
    }
    
    public int method8300() {
        return this.field12611;
    }
    
    public String method8301() {
        return this.field12612;
    }
    
    public static Class2141 method8302(final int n) {
        return (n >= 0 && n < Class2141.field12610.length) ? Class2141.field12610[n] : Class2141.field12605;
    }
    
    static {
        field12610 = Arrays.stream(values()).sorted(Comparator.comparingInt(class2141 -> class2141.field12611)).toArray(Class2141[]::new);
    }
}
