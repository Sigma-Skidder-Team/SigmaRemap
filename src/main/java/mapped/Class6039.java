// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class6039 extends Class6032<Class4408>
{
    private static final Class7096 field24573;
    private static final Class7096 field24574;
    private static final Class7096 field24575;
    private static final Class7096 field24576;
    public long field24577;
    public Class8577 field24578;
    
    public Class6039(final Function<Dynamic<?>, ? extends Class4408> function) {
        super(function);
    }
    
    public void method17959(final Random random, final Class1860 class1860, final Class3090 class1861, final int n, final int n2, final int n3, final double n4, final Class7096 class1862, final Class7096 class1863, final int n5, final long n6, final Class4408 class1864) {
        final int n7 = n5 + 1;
        final int n8 = n & 0xF;
        final int n9 = n2 & 0xF;
        final boolean b = this.field24578.method29029(n * 0.03125, n2 * 0.03125, 0.0) * 75.0 + random.nextDouble() > 0.0;
        final boolean b2 = this.field24578.method29029(n * 0.03125, 109.0, n2 * 0.03125) * 75.0 + random.nextDouble() > 0.0;
        final int n10 = (int)(n4 / 3.0 + 3.0 + random.nextDouble() * 0.25);
        final Class385 class1865 = new Class385();
        int n11 = -1;
        Class7096 class1866 = Class6039.field24574;
        Class7096 class1867 = Class6039.field24574;
        for (int i = 127; i >= 0; --i) {
            class1865.method1284(n8, i, n9);
            final Class7096 method6701 = class1860.method6701(class1865);
            if (method6701.method21696() != null && !method6701.method21706()) {
                if (method6701.method21696() == class1862.method21696()) {
                    if (n11 != -1) {
                        if (n11 > 0) {
                            --n11;
                            class1860.method7008(class1865, class1867, false);
                        }
                    }
                    else {
                        if (n10 > 0) {
                            if (i >= n7 - 4) {
                                if (i <= n7 + 1) {
                                    class1866 = Class6039.field24574;
                                    class1867 = Class6039.field24574;
                                    if (b2) {
                                        class1866 = Class6039.field24575;
                                        class1867 = Class6039.field24574;
                                    }
                                    if (b) {
                                        class1866 = Class6039.field24576;
                                        class1867 = Class6039.field24576;
                                    }
                                }
                            }
                        }
                        else {
                            class1866 = Class6039.field24573;
                            class1867 = Class6039.field24574;
                        }
                        if (i < n7) {
                            if (class1866 == null || class1866.method21706()) {
                                class1866 = class1863;
                            }
                        }
                        n11 = n10;
                        if (i < n7 - 1) {
                            class1860.method7008(class1865, class1867, false);
                        }
                        else {
                            class1860.method7008(class1865, class1866, false);
                        }
                    }
                }
            }
            else {
                n11 = -1;
            }
        }
    }
    
    @Override
    public void method17962(final long field24577) {
        if (this.field24577 != field24577 || this.field24578 == null) {
            this.field24578 = new Class8577(new Class2317(field24577), 3, 0);
        }
        this.field24577 = field24577;
    }
    
    static {
        field24573 = Class7521.field29764.method11878();
        field24574 = Class7521.field29338.method11878();
        field24575 = Class7521.field29177.method11878();
        field24576 = Class7521.field29339.method11878();
    }
}
