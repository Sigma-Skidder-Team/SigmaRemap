// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Comparator;
import java.util.Arrays;
import java.util.Random;

public enum Class1965
{
    field10723(0, "normal", false), 
    field10724(1, "lazy", false), 
    field10725(2, "worried", false), 
    field10726(3, "playful", false), 
    field10727(4, "brown", true), 
    field10728(5, "weak", true), 
    field10729(6, "aggressive", false);
    
    private static final Class1965[] field10730;
    private final int field10731;
    private final String field10732;
    private final boolean field10733;
    
    private Class1965(final int field10731, final String field10732, final boolean field10733) {
        this.field10731 = field10731;
        this.field10732 = field10732;
        this.field10733 = field10733;
    }
    
    public int method7958() {
        return this.field10731;
    }
    
    public String method7959() {
        return this.field10732;
    }
    
    public boolean method7960() {
        return this.field10733;
    }
    
    private static Class1965 method7961(final Class1965 class1965, final Class1965 class1966) {
        if (!class1965.method7960()) {
            return class1965;
        }
        return (class1965 != class1966) ? Class1965.field10723 : class1965;
    }
    
    public static Class1965 method7962(int n) {
        if (n < 0 || n >= Class1965.field10730.length) {
            n = 0;
        }
        return Class1965.field10730[n];
    }
    
    public static Class1965 method7963(final String anObject) {
        for (final Class1965 class1965 : values()) {
            if (class1965.field10732.equals(anObject)) {
                return class1965;
            }
        }
        return Class1965.field10723;
    }
    
    public static Class1965 method7964(final Random random) {
        final int nextInt = random.nextInt(16);
        if (nextInt == 0) {
            return Class1965.field10724;
        }
        if (nextInt == 1) {
            return Class1965.field10725;
        }
        if (nextInt == 2) {
            return Class1965.field10726;
        }
        if (nextInt == 4) {
            return Class1965.field10729;
        }
        if (nextInt >= 9) {
            return (nextInt >= 11) ? Class1965.field10723 : Class1965.field10727;
        }
        return Class1965.field10728;
    }
    
    static {
        field10730 = Arrays.stream(values()).sorted(Comparator.comparingInt(Class1965::method7958)).toArray(Class1965[]::new);
    }
}
