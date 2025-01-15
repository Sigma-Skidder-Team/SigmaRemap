// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.Collection;

public class Class6126 implements Class6113
{
    private final Class869 field24868;
    private Collection<Class354> field24869;
    
    public Class6126(final Class869 field24868) {
        this.field24869 = Lists.newArrayList();
        this.field24868 = field24868;
    }
    
    public void method18347(final Collection<Class354> field24869) {
        this.field24869 = field24869;
    }
    
    @Override
    public void method18269(final Class7351 class7351, final Class7807 class7352, final double n, final double n2, final double n3) {
        final Class354 method18162 = this.method18350().method18162();
        for (final Class354 class7353 : this.field24869) {
            if (!method18162.method1081(class7353, 160.0)) {
                continue;
            }
            method18348(class7353);
        }
    }
    
    private static void method18348(final Class354 class354) {
        Class7282.method22334(class354.method1133(-0.5, -0.5, -0.5), class354.method1133(1.5, 1.5, 1.5), 1.0f, 0.0f, 0.0f, 0.15f);
        method18349("Raid center", class354, -65536);
    }
    
    private static void method18349(final String s, final Class354 class354, final int n) {
        Class7282.method22341(s, class354.method1074() + 0.5, class354.method1075() + 1.3, class354.method1076() + 0.5, n, 0.04f, true, 0.0f, true);
    }
    
    private Class6092 method18350() {
        return this.field24868.field4644.method5833();
    }
}
