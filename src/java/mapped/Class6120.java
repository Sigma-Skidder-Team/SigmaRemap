// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public class Class6120 implements Class6113
{
    private static String[] field24839;
    private final List<Class354> field24840;
    private final List<Float> field24841;
    private final List<Float> field24842;
    private final List<Float> field24843;
    private final List<Float> field24844;
    private final List<Float> field24845;
    
    public Class6120() {
        this.field24840 = Lists.newArrayList();
        this.field24841 = Lists.newArrayList();
        this.field24842 = Lists.newArrayList();
        this.field24843 = Lists.newArrayList();
        this.field24844 = Lists.newArrayList();
        this.field24845 = Lists.newArrayList();
    }
    
    public void method18315(final Class354 class354, final float f, final float f2, final float f3, final float f4, final float f5) {
        this.field24840.add(class354);
        this.field24841.add(f);
        this.field24842.add(f5);
        this.field24843.add(f2);
        this.field24844.add(f3);
        this.field24845.add(f4);
    }
    
    @Override
    public void method18269(final Class7351 class7351, final Class7807 class7352, final double n, final double n2, final double n3) {
        Class8726.method30059();
        Class8726.method30011();
        Class8726.method30117();
        Class8726.method30041();
        final Class7392 method22694 = Class7392.method22694();
        final Class4148 method22695 = method22694.method22696();
        method22695.method12390(5, Class9237.field39615);
        for (int i = 0; i < this.field24840.size(); ++i) {
            final Class354 class7353 = this.field24840.get(i);
            final float n4 = this.field24841.get(i) / 2.0f;
            Class1656.method5734(method22695, class7353.method1074() + 0.5f - n4 - n, class7353.method1075() + 0.5f - n4 - n2, class7353.method1076() + 0.5f - n4 - n3, class7353.method1074() + 0.5f + n4 - n, class7353.method1075() + 0.5f + n4 - n2, class7353.method1076() + 0.5f + n4 - n3, this.field24843.get(i), this.field24844.get(i), this.field24845.get(i), this.field24842.get(i));
        }
        method22694.method22695();
        Class8726.method30040();
        Class8726.method30060();
    }
}
