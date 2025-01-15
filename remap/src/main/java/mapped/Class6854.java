// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import com.google.common.collect.Lists;

public class Class6854 extends Class6851<Class511>
{
    private static String[] field26883;
    
    @Override
    public void method20955(final Class1849 class1849, final Class511 class1850) {
        final Class383 method20487 = class1849.method6789().method20487();
        final Class354 class1851 = new Class354(class1850);
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 1; ++k) {
                    final Class354 method20488 = class1851.method1134(i, j, k);
                    if (class1849.method6701(method20488).method21755(Class7188.field27885)) {
                        arrayList.add(Class363.method1167(method20487, method20488));
                    }
                }
            }
        }
        final Class365<?> method20489 = class1850.method2618();
        if (arrayList.isEmpty()) {
            method20489.method1195(Class8233.field33814);
        }
        else {
            method20489.method1196(Class8233.field33814, arrayList);
        }
    }
    
    @Override
    public Set<Class8233<?>> method20953() {
        return (Set<Class8233<?>>)ImmutableSet.of((Object)Class8233.field33814);
    }
}
