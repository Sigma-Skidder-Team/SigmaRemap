// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.BitSet;

public class Class7663
{
    private static String[] field30438;
    private static boolean field30439;
    private static BitSet field30440;
    private static BitSet field30441;
    
    public static boolean method24283() {
        return Class7663.field30439 && !Class9216.field39049;
    }
    
    public static void method24284() {
        Class7663.field30439 = Config.method28962().field23485;
    }
    
    public static void method24285(final Class1912 class1912) {
        if (class1912.method7534()) {
            final int method7515 = class1912.method7515();
            if (method7515 >= 0) {
                Class7663.field30440.set(method7515);
            }
        }
    }
    
    public static void method24286(final BitSet set) {
        if (set != null) {
            Class7663.field30440.or(set);
        }
    }
    
    public static boolean method24287(final Class1912 class1912) {
        if (class1912.method7534()) {
            final int method7515 = class1912.method7515();
            return method7515 >= 0 && Class7663.field30440.get(method7515);
        }
        return true;
    }
    
    public static void method24288(final Class1774 class1774) {
        if (class1774.method6360()) {
            Class7663.field30440.clear();
        }
    }
    
    public static void method24289(final int bitIndex) {
        if (bitIndex >= 0) {
            Class7663.field30441.set(bitIndex);
        }
    }
    
    public static boolean method24290(final int bitIndex) {
        return bitIndex >= 0 && Class7663.field30441.get(bitIndex);
    }
    
    public static void method24291() {
        Class7663.field30441.clear();
    }
    
    static {
        Class7663.field30440 = new BitSet();
        Class7663.field30441 = new BitSet();
    }
}
