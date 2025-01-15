// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;

public class Class3650 extends Class3643
{
    private static Map<Integer, Class7549> field16925;
    private static Map<Short, Integer> field16926;
    
    public static Class7220 method11232() {
        final LinkedList list = new LinkedList();
        list.add("minecraft:oak_door");
        list.add("minecraft:birch_door");
        list.add("minecraft:jungle_door");
        list.add("minecraft:dark_oak_door");
        list.add("minecraft:acacia_door");
        list.add("minecraft:spruce_door");
        list.add("minecraft:iron_door");
        return new Class7229(list, new Class3650());
    }
    
    private static short method11233(final Class7549 class7549) {
        short n = 0;
        if (class7549.method23709()) {
            n |= 0x1;
        }
        if (class7549.method23712()) {
            n |= 0x2;
        }
        if (class7549.method23711()) {
            n |= 0x4;
        }
        if (class7549.method23710()) {
            n |= 0x8;
        }
        return (short)((short)(n | class7549.method23713().ordinal() << 4) | (class7549.method23714() & 0x7) << 6);
    }
    
    @Override
    public int method11202(final Class6108 class6108, final Class8322 class6109, final int i) {
        final Class7549 class6110 = Class3650.field16925.get(i);
        if (class6110 != null) {
            short n = (short)(0x0 | (class6110.method23714() & 0x7) << 6);
            short s;
            if (!class6110.method23709()) {
                final Class7549 class6111 = Class3650.field16925.get(this.method11205(class6108, class6109.method27702(Class222.field776)));
                if (class6111 == null) {
                    return i;
                }
                if (class6111.method23712()) {
                    n |= 0x2;
                }
                if (class6110.method23711()) {
                    n |= 0x4;
                }
                if (class6110.method23710()) {
                    n |= 0x8;
                }
                s = (short)(n | class6111.method23713().ordinal() << 4);
            }
            else {
                final Class7549 class6112 = Class3650.field16925.get(this.method11205(class6108, class6109.method27702(Class222.field775)));
                if (class6112 == null) {
                    return i;
                }
                short n2 = (short)(n | 0x1);
                if (class6110.method23712()) {
                    n2 |= 0x2;
                }
                if (class6112.method23711()) {
                    n2 |= 0x4;
                }
                if (class6112.method23710()) {
                    n2 |= 0x8;
                }
                s = (short)(n2 | class6110.method23713().ordinal() << 4);
            }
            final Integer n3 = Class3650.field16926.get(s);
            return (n3 != null) ? n3 : i;
        }
        return i;
    }
    
    static {
        Class3650.field16925 = new HashMap<Integer, Class7549>();
        Class3650.field16926 = new HashMap<Short, Integer>();
    }
}
