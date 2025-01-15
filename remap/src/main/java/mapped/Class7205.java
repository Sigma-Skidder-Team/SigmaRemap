// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Class7205
{
    private static final Map<Integer, Class74> field27991;
    
    private static void method22103(final Integer n, final String s) {
        final Class74 class74 = new Class74("");
        class74.method420(new Class71(s));
        Class7205.field27991.put(n, class74);
    }
    
    private static void method22104(final List<Integer> list, final String s) {
        final Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            method22103((int)iterator.next(), s);
        }
    }
    
    public static boolean method22105(final int i) {
        return Class7205.field27991.containsKey(i);
    }
    
    public static Class74 method22106(final int n, final int n2, final int n3, final int i) {
        final Class74 class74 = Class7205.field27991.get(i);
        if (class74 == null) {
            return null;
        }
        final Class74 clone = class74.clone();
        clone.method420(new Class68("x", n));
        clone.method420(new Class68("y", n2));
        clone.method420(new Class68("z", n3));
        return clone;
    }
    
    static {
        field27991 = new ConcurrentHashMap<Integer, Class74>();
        method22104(Arrays.asList(61, 62), "Furnace");
        method22104(Arrays.asList(54, 146), "Chest");
        method22103(130, "EnderChest");
        method22103(84, "RecordPlayer");
        method22103(23, "Trap");
        method22103(158, "Dropper");
        method22104(Arrays.asList(63, 68), "Sign");
        method22103(52, "MobSpawner");
        method22103(25, "Music");
        method22104(Arrays.asList(33, 34, 29, 36), "Piston");
        method22103(117, "Cauldron");
        method22103(116, "EnchantTable");
        method22104(Arrays.asList(119, 120), "Airportal");
        method22103(138, "Beacon");
        method22103(144, "Skull");
        method22104(Arrays.asList(178, 151), "DLDetector");
        method22103(154, "Hopper");
        method22104(Arrays.asList(149, 150), "Comparator");
        method22103(140, "FlowerPot");
        method22104(Arrays.asList(176, 177), "Banner");
        method22103(209, "EndGateway");
        method22103(137, "Control");
    }
}
