// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;

public class Class3649 extends Class3643
{
    private static Map<Integer, Class9068> field16923;
    private static Map<Short, Integer> field16924;
    
    public static Class7220 method11224() {
        final LinkedList list = new LinkedList();
        list.add("minecraft:oak_stairs");
        list.add("minecraft:cobblestone_stairs");
        list.add("minecraft:brick_stairs");
        list.add("minecraft:stone_brick_stairs");
        list.add("minecraft:nether_brick_stairs");
        list.add("minecraft:sandstone_stairs");
        list.add("minecraft:spruce_stairs");
        list.add("minecraft:birch_stairs");
        list.add("minecraft:jungle_stairs");
        list.add("minecraft:quartz_stairs");
        list.add("minecraft:acacia_stairs");
        list.add("minecraft:dark_oak_stairs");
        list.add("minecraft:red_sandstone_stairs");
        list.add("minecraft:purpur_stairs");
        list.add("minecraft:prismarine_stairs");
        list.add("minecraft:prismarine_brick_stairs");
        list.add("minecraft:dark_prismarine_stairs");
        return new Class7219(list, new Class3649());
    }
    
    private static short method11225(final Class9068 class9068) {
        short n = 0;
        if (class9068.method32662()) {
            n |= 0x1;
        }
        return (short)((short)((short)(n | class9068.method32663() << 1) | class9068.method32664() << 4) | class9068.method32665().ordinal() << 9);
    }
    
    @Override
    public int method11202(final Class6108 class6108, final Class8322 class6109, final int i) {
        final Class9068 class6110 = Class3649.field16923.get(i);
        if (class6110 != null) {
            short n = 0;
            if (class6110.method32662()) {
                n |= 0x1;
            }
            final Integer n2 = Class3649.field16924.get((short)((short)((short)(n | this.method11226(class6108, class6109, class6110) << 1) | class6110.method32664() << 4) | class6110.method32665().ordinal() << 9));
            return (n2 != null) ? n2 : i;
        }
        return i;
    }
    
    private int method11226(final Class6108 class6108, final Class8322 class6109, final Class9068 class6110) {
        final Class222 method32665 = class6110.method32665();
        final Class9068 class6111 = Class3649.field16923.get(this.method11205(class6108, class6109.method27702(method32665)));
        if (class6111 != null) {
            if (class6111.method32662() == class6110.method32662()) {
                final Class222 method32666 = class6111.method32665();
                if (method32665.method855() != method32666.method855()) {
                    if (this.method11227(class6108, class6110, class6109, method32666.method851())) {
                        return (method32666 != this.method11228(method32665)) ? 4 : 3;
                    }
                }
            }
        }
        final Class9068 class6112 = Class3649.field16923.get(this.method11205(class6108, class6109.method27702(method32665.method851())));
        if (class6112 != null) {
            if (class6112.method32662() == class6110.method32662()) {
                final Class222 method32667 = class6112.method32665();
                if (method32665.method855() != method32667.method855()) {
                    if (this.method11227(class6108, class6110, class6109, method32667)) {
                        return (method32667 != this.method11228(method32665)) ? 2 : 1;
                    }
                }
            }
        }
        return 0;
    }
    
    private boolean method11227(final Class6108 class6108, final Class9068 class6109, final Class8322 class6110, final Class222 class6111) {
        final Class9068 class6112 = Class3649.field16923.get(this.method11205(class6108, class6110.method27702(class6111)));
        if (class6112 != null) {
            if (class6112.method32665() == class6109.method32665()) {
                return class6112.method32662() != class6109.method32662();
            }
        }
        return true;
    }
    
    private Class222 method11228(final Class222 class222) {
        switch (Class8911.field37456[class222.ordinal()]) {
            case 1: {
                return Class222.field774;
            }
            case 2: {
                return Class222.field773;
            }
            case 3: {
                return Class222.field771;
            }
            case 4: {
                return Class222.field772;
            }
            default: {
                return class222;
            }
        }
    }
    
    static {
        Class3649.field16923 = new HashMap<Integer, Class9068>();
        Class3649.field16924 = new HashMap<Short, Integer>();
    }
}
