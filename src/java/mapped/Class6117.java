// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class Class6117 implements Class6113
{
    private static String[] field24830;
    private final Map<Class354, Class354> field24831;
    private final Map<Class354, Float> field24832;
    private final List<Class354> field24833;
    
    public Class6117() {
        this.field24831 = Maps.newHashMap();
        this.field24832 = Maps.newHashMap();
        this.field24833 = Lists.newArrayList();
    }
    
    public void method18312(final Class354 class354, final List<Class354> list, final List<Float> list2) {
        for (int i = 0; i < list.size(); ++i) {
            this.field24831.put((Class354)list.get(i), class354);
            this.field24832.put((Class354)list.get(i), list2.get(i));
        }
        this.field24833.add(class354);
    }
    
    @Override
    public void method18269(final Class7351 class7351, final Class7807 class7352, final double n, final double n2, final double n3) {
        Class8726.method30059();
        Class8726.method30011();
        Class8726.method30117();
        Class8726.method30041();
        final Class354 class7353 = new Class354(n, 0.0, n3);
        final Class7392 method22694 = Class7392.method22694();
        final Class4148 method22695 = method22694.method22696();
        method22695.method12390(5, Class9237.field39615);
        for (final Map.Entry<Class354, V> entry : this.field24831.entrySet()) {
            final Class354 class7354 = entry.getKey();
            final Class354 class7355 = (Class354)entry.getValue();
            final float n4 = class7355.method1074() * 128 % 256 / 256.0f;
            final float n5 = class7355.method1075() * 128 % 256 / 256.0f;
            final float n6 = class7355.method1076() * 128 % 256 / 256.0f;
            final float floatValue = this.field24832.get(class7354);
            if (!class7353.method1081(class7354, 160.0)) {
                continue;
            }
            Class1656.method5734(method22695, class7354.method1074() + 0.5f - n - floatValue, class7354.method1075() + 0.5f - n2 - floatValue, class7354.method1076() + 0.5f - n3 - floatValue, class7354.method1074() + 0.5f - n + floatValue, class7354.method1075() + 0.5f - n2 + floatValue, class7354.method1076() + 0.5f - n3 + floatValue, n4, n5, n6, 0.5f);
        }
        for (final Class354 class7356 : this.field24833) {
            if (!class7353.method1081(class7356, 160.0)) {
                continue;
            }
            Class1656.method5734(method22695, class7356.method1074() - n, class7356.method1075() - n2, class7356.method1076() - n3, class7356.method1074() + 1.0f - n, class7356.method1075() + 1.0f - n2, class7356.method1076() + 1.0f - n3, 1.0f, 1.0f, 1.0f, 1.0f);
        }
        method22694.method22695();
        Class8726.method30008();
        Class8726.method30040();
        Class8726.method30060();
    }
}
