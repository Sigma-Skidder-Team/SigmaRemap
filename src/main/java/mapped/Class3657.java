// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.Map;

public class Class3657 extends Class3643
{
    private static Map<Integer, Class8387> field16934;
    private static Map<Byte, Integer> field16935;
    private static Map<Integer, Class222> field16936;
    
    public static Class7220 method11253() {
        return new Class7226(new Class3657());
    }
    
    private static byte method11254(final Class9223 class9223) {
        byte b = 0;
        if (class9223.method34008("attached").equals("true")) {
            b |= 0x1;
        }
        if (class9223.method34008("disarmed").equals("true")) {
            b |= 0x2;
        }
        if (class9223.method34008("powered").equals("true")) {
            b |= 0x4;
        }
        if (class9223.method34008("east").equals("true")) {
            b |= 0x8;
        }
        if (class9223.method34008("north").equals("true")) {
            b |= 0x10;
        }
        if (class9223.method34008("south").equals("true")) {
            b |= 0x20;
        }
        if (class9223.method34008("west").equals("true")) {
            b |= 0x40;
        }
        return b;
    }
    
    @Override
    public int method11202(final Class6108 class6108, final Class8322 class6109, final int i) {
        final Class8387 class6110 = Class3657.field16934.get(i);
        if (class6110 != null) {
            byte b = 0;
            if (class6110.method27955()) {
                b |= 0x1;
            }
            if (class6110.method27956()) {
                b |= 0x2;
            }
            if (class6110.method27957()) {
                b |= 0x4;
            }
            final int method11205 = this.method11205(class6108, class6109.method27702(Class222.field773));
            final int method11206 = this.method11205(class6108, class6109.method27702(Class222.field771));
            final int method11207 = this.method11205(class6108, class6109.method27702(Class222.field772));
            final int method11208 = this.method11205(class6108, class6109.method27702(Class222.field774));
            if (Class3657.field16934.containsKey(method11205) || Class3657.field16936.get(method11205) == Class222.field774) {
                b |= 0x8;
            }
            if (Class3657.field16934.containsKey(method11206) || Class3657.field16936.get(method11206) == Class222.field772) {
                b |= 0x10;
            }
            if (Class3657.field16934.containsKey(method11207) || Class3657.field16936.get(method11207) == Class222.field771) {
                b |= 0x20;
            }
            if (Class3657.field16934.containsKey(method11208) || Class3657.field16936.get(method11208) == Class222.field773) {
                b |= 0x40;
            }
            final Integer n = Class3657.field16935.get(b);
            return (n != null) ? n : i;
        }
        return i;
    }
    
    static {
        Class3657.field16934 = new HashMap<Integer, Class8387>();
        Class3657.field16935 = new HashMap<Byte, Integer>();
        Class3657.field16936 = new HashMap<Integer, Class222>();
    }
}
