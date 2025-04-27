// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.Map;

public enum Class2221
{
    field13637(1, 298, "minecraft:leather_helmet"), 
    field13638(3, 299, "minecraft:leather_chestplate"), 
    field13639(2, 300, "minecraft:leather_leggings"), 
    field13640(1, 301, "minecraft:leather_boots"), 
    field13641(2, 302, "minecraft:chainmail_helmet"), 
    field13642(5, 303, "minecraft:chainmail_chestplate"), 
    field13643(4, 304, "minecraft:chainmail_leggings"), 
    field13644(1, 305, "minecraft:chainmail_boots"), 
    field13645(2, 306, "minecraft:iron_helmet"), 
    field13646(6, 307, "minecraft:iron_chestplate"), 
    field13647(5, 308, "minecraft:iron_leggings"), 
    field13648(2, 309, "minecraft:iron_boots"), 
    field13649(3, 310, "minecraft:diamond_helmet"), 
    field13650(8, 311, "minecraft:diamond_chestplate"), 
    field13651(6, 312, "minecraft:diamond_leggings"), 
    field13652(3, 313, "minecraft:diamond_boots"), 
    field13653(2, 314, "minecraft:gold_helmet"), 
    field13654(5, 315, "minecraft:gold_chestplate"), 
    field13655(3, 316, "minecraft:gold_leggings"), 
    field13656(1, 317, "minecraft:gold_boots"), 
    field13657(0, 0, "none");
    
    private static Map<Integer, Class2221> field13658;
    private final int field13659;
    private final int field13660;
    private final String field13661;
    
    public static Class2221 method8409(final int i) {
        final Class2221 class2221 = Class2221.field13658.get(i);
        return (class2221 != null) ? class2221 : Class2221.field13657;
    }
    
    public static Class2221 method8410(final String anObject) {
        for (final Class2221 class2221 : values()) {
            if (class2221.method8415().equals(anObject)) {
                return class2221;
            }
        }
        return Class2221.field13657;
    }
    
    public static boolean method8411(final int i) {
        return Class2221.field13658.containsKey(i);
    }
    
    public static boolean method8412(final String anObject) {
        final Class2221[] values = values();
        for (int length = values.length, i = 0; i < length; ++i) {
            if (values[i].method8415().equals(anObject)) {
                return true;
            }
        }
        return false;
    }
    
    public int method8413() {
        return this.field13660;
    }
    
    Class2221(final int field13659, final int field13660, final String field13661) {
        this.field13659 = field13659;
        this.field13660 = field13660;
        this.field13661 = field13661;
    }
    
    public int method8414() {
        return this.field13659;
    }
    
    public String method8415() {
        return this.field13661;
    }
    
    static {
        Class2221.field13658 = new HashMap<Integer, Class2221>();
        for (final Class2221 class2221 : values()) {
            Class2221.field13658.put(class2221.method8413(), class2221);
        }
    }
}
