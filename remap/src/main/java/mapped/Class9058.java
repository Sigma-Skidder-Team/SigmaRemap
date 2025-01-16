// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Class9058
{
    private static final Random field38362;
    
    public static void method32617(final Class6313 obj) {
        if (obj != null) {
            Config.method28847("Model: " + obj + ", ao: " + obj.method18692() + ", gui3d: " + obj.method18693() + ", builtIn: " + obj.method18695() + ", particle: " + obj.method18696());
            final Direction[] field524 = Direction.VALUES;
            for (int i = 0; i < field524.length; ++i) {
                final Direction class179 = field524[i];
                method32618(class179.getName(), obj.method18691(null, class179, Class9058.field38362), "  ");
            }
            method32618("General", obj.method18691(null, null, Class9058.field38362), "  ");
        }
    }
    
    private static void method32618(final String s, final List<Class8754> list, final String s2) {
        final Iterator<Class8754> iterator = list.iterator();
        while (iterator.hasNext()) {
            method32619(s, iterator.next(), s2);
        }
    }
    
    public static void method32619(final String str, final Class8754 class8754, final String s) {
        Config.method28847(s + "Quad: " + class8754.getClass().getName() + ", type: " + str + ", face: " + class8754.method30294() + ", tint: " + class8754.method30293() + ", sprite: " + class8754.method30295());
        method32620(class8754.method30291(), "  " + s);
    }
    
    public static void method32620(final int[] array, final String s) {
        final int i = array.length / 4;
        Config.method28847(s + "Length: " + array.length + ", step: " + i);
        for (int j = 0; j < 4; ++j) {
            final int n = j * i;
            Config.method28847(s + j + " xyz: " + Float.intBitsToFloat(array[n + 0]) + "," + Float.intBitsToFloat(array[n + 1]) + "," + Float.intBitsToFloat(array[n + 2]) + " col: " + array[n + 3] + " u,v: " + Float.intBitsToFloat(array[n + 4]) + "," + Float.intBitsToFloat(array[n + 5]));
        }
    }
    
    public static Class6313 method32621(final Class6313 class6313) {
        final List method32622 = method32622(class6313.method18691(null, null, Class9058.field38362));
        final Direction[] field524 = Direction.VALUES;
        final HashMap hashMap = new HashMap();
        for (int i = 0; i < field524.length; ++i) {
            final Direction class6314 = field524[i];
            hashMap.put(class6314, method32622(class6313.method18691(null, class6314, Class9058.field38362)));
        }
        return new Class6315(method32622, hashMap, class6313.method18692(), class6313.method18693(), true, class6313.method18696(), class6313.method18697(), class6313.method18698());
    }
    
    public static List method32622(final List list) {
        final ArrayList list2 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(method32623((Class8754)iterator.next()));
        }
        return list2;
    }
    
    public static Class8754 method32623(final Class8754 class8754) {
        return new Class8754(class8754.method30291().clone(), class8754.method30293(), class8754.method30294(), class8754.method30295());
    }
    
    static {
        field38362 = new Random(0L);
    }
}
