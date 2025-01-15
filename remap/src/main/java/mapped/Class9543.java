// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Class9543
{
    private static final Map<EntityType, Integer> field41079;
    private static final Map<String, Integer> field41080;
    private static final Map<String, Integer> field41081;
    
    public static int method35624(final Entity class399) {
        return (class399 != null) ? method35625(class399.getType()) : -1;
    }
    
    public static int method35625(final EntityType class7499) {
        final Integer n = Class9543.field41079.get(class7499);
        return (n != null) ? n : -1;
    }
    
    public static int method35626(final String s) {
        final Integer n = Class9543.field41080.get(s);
        return (n != null) ? n : -1;
    }
    
    public static int method35627(String lowerCase) {
        lowerCase = lowerCase.toLowerCase(Locale.ROOT);
        final Integer n = Class9543.field41081.get(lowerCase);
        return (n != null) ? n : -1;
    }
    
    static {
        field41079 = new HashMap<EntityType, Integer>();
        field41080 = new HashMap<String, Integer>();
        field41081 = new HashMap<String, Integer>();
        for (final EntityType obj : Class90.field210) {
            final int method504 = Class90.field210.method504(obj);
            final Class1932 method505 = Class90.field210.method503(obj);
            final String string = method505.toString();
            final String method506 = method505.method7797();
            if (Class9543.field41079.containsKey(obj)) {
                Class8571.method28848("Duplicate entity type: " + obj + ", id1: " + Class9543.field41079.get(obj) + ", id2: " + method504);
            }
            if (Class9543.field41080.containsKey(string)) {
                Class8571.method28848("Duplicate entity location: " + string + ", id1: " + Class9543.field41080.get(string) + ", id2: " + method504);
            }
            if (Class9543.field41081.containsKey(string)) {
                Class8571.method28848("Duplicate entity name: " + method506 + ", id1: " + Class9543.field41081.get(method506) + ", id2: " + method504);
            }
            Class9543.field41079.put(obj, method504);
            Class9543.field41080.put(string, method504);
            Class9543.field41081.put(method506, method504);
        }
    }
}
