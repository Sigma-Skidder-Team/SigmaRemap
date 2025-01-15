// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.List;

public abstract class Class7626
{
    public final int field30203;
    public final int field30204;
    public final int field30205;
    public final int field30206;
    
    public Class7626(final int field30203, final int field30204, final int field30205, final int field30206) {
        this.field30203 = field30203;
        this.field30204 = field30204;
        this.field30205 = field30205;
        this.field30206 = field30206;
    }
    
    public void method23962(final int n, final int n2, final int n3, final int n4) {
        final int n5 = n + this.field30205;
        final int n6 = n2 + this.field30206;
        boolean b = false;
        if (n3 >= n5) {
            if (n3 <= n5 + this.field30203) {
                if (n4 >= n6) {
                    if (n4 <= n6 + this.field30204) {
                        b = true;
                    }
                }
            }
        }
        this.method23960(n5, n6, b);
    }
    
    public abstract void method23960(final int p0, final int p1, final boolean p2);
    
    public int method23963() {
        return this.field30205 + this.field30203;
    }
    
    public int method23964() {
        return this.field30206 + this.field30204;
    }
    
    public abstract void method23961(final int p0);
    
    public static void method23965(final List<Class7626> list, final Class5056 class5056, final int n, final int n2, final int n3, final int n4) {
        for (final Class7626 class5057 : list) {
            if (class5056.method15531() <= class5057.method23963()) {
                continue;
            }
            class5057.method23962(n, n2, n3, n4);
        }
    }
    
    public static void method23966(final Class5056 class5056, final Class624 class5057, final List<Class7626> list, final int n, final double n2, final double n3) {
        if (n == 0) {
            final int index = class5056.method15535().indexOf(class5057);
            if (index > -1) {
                class5056.method15533(index);
                final int method15538 = class5056.method15538();
                final int method15539 = class5056.method15537(index);
                final int n4 = (int)(n2 - method15538);
                final int n5 = (int)(n3 - method15539);
                for (final Class7626 class5058 : list) {
                    if (n4 < class5058.field30205) {
                        continue;
                    }
                    if (n4 > class5058.method23963()) {
                        continue;
                    }
                    if (n5 < class5058.field30206) {
                        continue;
                    }
                    if (n5 > class5058.method23964()) {
                        continue;
                    }
                    class5058.method23961(index);
                }
            }
        }
    }
}
