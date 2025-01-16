// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.Direction;

import java.util.List;

public class Class9087
{
    private static String[] field38480;
    private static final List<Class8754> field38481;
    
    public static Class6313 method32832(Class6313 method22995, final BlockState class7096, final Class9145 class7097) {
        if (class7097.method33389()) {
            method22995 = Class7464.method22995(method22995, class7096);
        }
        return method22995;
    }
    
    public static List<Class8754> method32833(List<Class8754> method18260, final Class1856 class1856, final BlockState class1857, final BlockPos class1858, final Direction class1859, final Class6332 class1860, final long n, final Class9145 class1861) {
        if (class1859 != null) {
            if (class1861.method33389() && Class7464.method22996(class1856.getBlockState(class1858.method1149(class1859)), class1857)) {
                return Class9087.field38481;
            }
            if (!class1861.method33379(method18260)) {
                if (Config.method28910()) {
                    method18260 = Class6110.method18260(class1856, class1857, class1858, class1859, method18260);
                }
            }
        }
        final List<Class8754> method18261 = class1861.method33390();
        method18261.clear();
        for (int i = 0; i < method18260.size(); ++i) {
            final Class8754 class1862 = method18260.get(i);
            final Class8754[] method18262 = method32835(class1862, class1856, class1857, class1858, class1859, n, class1861);
            if (i == 0) {
                if (method18260.size() == 1) {
                    if (method18262.length == 1) {
                        if (method18262[0] == class1862) {
                            if (class1862.method30312() == null) {
                                return method18260;
                            }
                        }
                    }
                }
            }
            for (int j = 0; j < method18262.length; ++j) {
                final Class8754 class1863 = method18262[j];
                method18261.add(class1863);
                if (class1863.method30312() != null) {
                    class1861.method33398(method32834(class1860)).method26376(class1863.method30312(), class1857);
                    class1861.method33400(true);
                }
            }
        }
        return method18261;
    }
    
    private static Class6332 method32834(final Class6332 class6332) {
        return (class6332 != null && class6332 != Class9484.field40759) ? class6332 : Class9484.field40760;
    }
    
    private static Class8754[] method32835(Class8754 method24259, final Class1856 class1856, final BlockState class1857, final BlockPos class1858, final Direction class1859, final long n, final Class9145 class1860) {
        if (!class1860.method33380(method24259)) {
            final Class8754 class1861 = method24259;
            if (Config.method28949()) {
                final Class8754[] method24260 = Class7970.method25831(class1856, class1857, class1858, method24259, class1860);
                if (method24260.length != 1 || method24260[0] != method24259) {
                    return method24260;
                }
            }
            if (Config.method28950()) {
                method24259 = Class7657.method24259(class1858, method24259);
                if (method24259 != class1861) {
                    return class1860.method33391(method24259);
                }
            }
            return class1860.method33391(method24259);
        }
        return class1860.method33391(method24259);
    }
    
    static {
        field38481 = (List)ImmutableList.of();
    }
}
