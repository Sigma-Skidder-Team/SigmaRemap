// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import com.github.steveice10.opennbt.tag.TagCreateException;
import java.lang.reflect.Constructor;
import com.github.steveice10.opennbt.tag.TagRegisterException;
import java.util.Map;

public class Class8116
{
    private static final Map<Integer, Class<? extends Class61>> field33451;
    private static final Map<Class<? extends Class61>, Integer> field33452;
    
    public static void method26701(final int n, final Class<? extends Class61> clazz) throws TagRegisterException {
        if (Class8116.field33451.containsKey(n)) {
            throw new Class2380("Tag ID \"" + n + "\" is already in use.");
        }
        if (!Class8116.field33452.containsKey(clazz)) {
            Class8116.field33451.put(n, clazz);
            Class8116.field33452.put(clazz, n);
            return;
        }
        throw new Class2380("Tag \"" + clazz.getSimpleName() + "\" is already registered.");
    }
    
    public static void method26702(final int i) {
        Class8116.field33452.remove(method26703(i));
        Class8116.field33451.remove(i);
    }
    
    public static Class<? extends Class61> method26703(final int n) {
        if (Class8116.field33451.containsKey(n)) {
            return Class8116.field33451.get(n);
        }
        return null;
    }
    
    public static int method26704(final Class<? extends Class61> clazz) {
        if (Class8116.field33452.containsKey(clazz)) {
            return Class8116.field33452.get(clazz);
        }
        return -1;
    }
    
    public static Class61 method26705(final int n, final String s) throws TagCreateException {
        final Class clazz = Class8116.field33451.get(n);
        if (clazz == null) {
            throw new Class2336("Could not find tag with ID \"" + n + "\".");
        }
        try {
            final Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class);
            declaredConstructor.setAccessible(true);
            return (Class61)declaredConstructor.newInstance(s);
        }
        catch (final Exception ex) {
            throw new Class2336("Failed to create instance of tag \"" + clazz.getSimpleName() + "\".", ex);
        }
    }
    
    static {
        field33451 = new HashMap<Integer, Class<? extends Class61>>();
        field33452 = new HashMap<Class<? extends Class61>, Integer>();
        method26701(1, Class72.class);
        method26701(2, Class70.class);
        method26701(3, Class68.class);
        method26701(4, Class69.class);
        method26701(5, Class65.class);
        method26701(6, Class66.class);
        method26701(7, Class67.class);
        method26701(8, Class71.class);
        method26701(9, Class60.class);
        method26701(10, Class74.class);
        method26701(11, Class62.class);
        method26701(12, Class75.class);
        method26701(60, Class73.class);
        method26701(61, Class64.class);
        method26701(65, Class63.class);
    }
}
