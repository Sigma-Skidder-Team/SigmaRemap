// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Properties;
import java.util.Set;

import net.minecraft.world.dimension.DimensionType;
import org.apache.commons.lang3.tuple.ImmutablePair;
import java.util.Arrays;
import java.util.HashMap;
import org.apache.commons.lang3.tuple.Pair;

public class Class9203
{
    private static Class9103[] field38995;
    private static int field38996;
    
    public static Class9103 method33675() {
        if (Class9203.field38995 == null) {
            return null;
        }
        final DimensionType field36393 = Class8663.field36393;
        if (field36393 != null) {
            final int n = field36393.method1270() - Class9203.field38996;
            Class9103 class9103 = null;
            if (n >= 0) {
                if (n < Class9203.field38995.length) {
                    class9103 = Class9203.field38995[n];
                }
            }
            return class9103;
        }
        return null;
    }
    
    public static void method33676() {
        Class9203.field38995 = null;
        Class9203.field38996 = 0;
        final Pair<Class9103[], Integer> method33677 = method33677();
        Class9203.field38995 = (Class9103[])method33677.getLeft();
        Class9203.field38996 = (int)method33677.getRight();
    }
    
    private static Pair<Class9103[], Integer> method33677() {
        final String s = "optifine/gui/loading/background";
        final String s2 = ".png";
        final String[] method32775 = Class9084.method32775(s, s2);
        final HashMap hashMap = new HashMap();
        for (int i = 0; i < method32775.length; ++i) {
            final String str = method32775[i];
            final String method32776 = Class9518.method35527(str, s, s2);
            final int method32777 = Config.method28933(method32776, Integer.MIN_VALUE);
            if (method32777 != Integer.MIN_VALUE) {
                hashMap.put(method32777, str);
            }
            else {
                method33678("Invalid dimension ID: " + method32776 + ", path: " + str);
            }
        }
        final Set keySet = hashMap.keySet();
        final Integer[] array = (Integer[])keySet.toArray(new Integer[keySet.size()]);
        Arrays.sort(array);
        if (array.length > 0) {
            final Properties method32778 = Class9084.method32784("optifine/gui/loading/loading.properties", "CustomLoadingScreens");
            final int intValue = array[0];
            final Class9103[] array2 = new Class9103[array[array.length - 1] - intValue + 1];
            for (int j = 0; j < array.length; ++j) {
                final Integer n = array[j];
                array2[n - intValue] = Class9103.method32897((String)hashMap.get(n), n, method32778);
            }
            return (Pair<Class9103[], Integer>)new ImmutablePair((Object)array2, (Object)intValue);
        }
        return (Pair<Class9103[], Integer>)new ImmutablePair((Object)null, (Object)0);
    }
    
    public static void method33678(final String str) {
        Config.warn("CustomLoadingScreen: " + str);
    }
    
    public static void method33679(final String str) {
        Config.method28847("CustomLoadingScreen: " + str);
    }
    
    static {
        Class9203.field38995 = null;
        Class9203.field38996 = 0;
    }
}
