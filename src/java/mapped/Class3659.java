// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import java.util.Map;

public class Class3659 extends Class3643
{
    private static Map<Integer, Class222> field16939;
    private static Map<Byte, Integer> field16940;
    private static Set<Integer> field16941;
    
    public static Class7220 method11263() {
        return new Class7221(new Class3659());
    }
    
    private static Byte method11264(final Class9223 class9223) {
        byte b = 0;
        final String method34008 = class9223.method34008("type");
        if (method34008.equals("left")) {
            b |= 0x1;
        }
        if (method34008.equals("right")) {
            b |= 0x2;
        }
        byte b2 = (byte)(b | Class222.valueOf(class9223.method34008("facing").toUpperCase(Locale.ROOT)).ordinal() << 2);
        if (class9223.method34010().equals("minecraft:trapped_chest")) {
            b2 |= 0x10;
        }
        return b2;
    }
    
    @Override
    public int method11202(final Class6108 class6108, final Class8322 class6109, final int n) {
        final Class222 class6110 = Class3659.field16939.get(n);
        byte b = (byte)(0x0 | class6110.ordinal() << 2);
        final boolean contains = Class3659.field16941.contains(n);
        if (contains) {
            b |= 0x10;
        }
        final int method11205;
        if (Class3659.field16939.containsKey(method11205 = this.method11205(class6108, class6109.method27702(Class222.field771))) && contains == Class3659.field16941.contains(method11205)) {
            b |= (byte)((class6110 != Class222.field774) ? 2 : 1);
        }
        else {
            final int method11206;
            if (Class3659.field16939.containsKey(method11206 = this.method11205(class6108, class6109.method27702(Class222.field772))) && contains == Class3659.field16941.contains(method11206)) {
                b |= (byte)((class6110 != Class222.field773) ? 2 : 1);
            }
            else {
                final int method11207;
                if (Class3659.field16939.containsKey(method11207 = this.method11205(class6108, class6109.method27702(Class222.field774))) && contains == Class3659.field16941.contains(method11207)) {
                    b |= (byte)((class6110 != Class222.field771) ? 1 : 2);
                }
                else {
                    final int method11208;
                    if (Class3659.field16939.containsKey(method11208 = this.method11205(class6108, class6109.method27702(Class222.field773)))) {
                        if (contains == Class3659.field16941.contains(method11208)) {
                            b |= (byte)((class6110 != Class222.field772) ? 1 : 2);
                        }
                    }
                }
            }
        }
        final Integer n2 = Class3659.field16940.get(b);
        return (n2 != null) ? n2 : n;
    }
    
    static {
        Class3659.field16939 = new HashMap<Integer, Class222>();
        Class3659.field16940 = new HashMap<Byte, Integer>();
        Class3659.field16941 = new HashSet<Integer>();
    }
}
