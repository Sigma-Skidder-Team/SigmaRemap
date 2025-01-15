// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class6041 extends Class6040
{
    private static final Class7096 field24579;
    private static final Class7096 field24580;
    private static final Class7096 field24581;
    
    public Class6041(final Function<Dynamic<?>, ? extends Class4408> function) {
        super(function);
    }
    
    @Override
    public void method17959(final Random random, final Class1860 class1860, final Class3090 class1861, final int n, final int n2, final int n3, final double n4, final Class7096 class1862, final Class7096 class1863, final int n5, final long n6, final Class4408 class1864) {
        final int n7 = n & 0xF;
        final int n8 = n2 & 0xF;
        Class7096 class1865 = Class6041.field24579;
        Class7096 class1866 = class1861.method9872().method13339();
        final int n9 = (int)(n4 / 3.0 + 3.0 + random.nextDouble() * 0.25);
        final boolean b = Math.cos(n4 / 3.0 * 3.141592653589793) > 0.0;
        int n10 = -1;
        boolean b2 = false;
        int n11 = 0;
        final Mutable class1867 = new Mutable();
        for (int i = n3; i >= 0; --i) {
            if (n11 < 15) {
                class1867.setPos(n7, i, n8);
                final Class7096 method6701 = class1860.method6701(class1867);
                if (!method6701.method21706()) {
                    if (method6701.method21696() == class1862.method21696()) {
                        if (n10 != -1) {
                            if (n10 > 0) {
                                --n10;
                                if (!b2) {
                                    class1860.method7008(class1867, this.method17964(n, i, n2), false);
                                }
                                else {
                                    class1860.method7008(class1867, Class6041.field24580, false);
                                }
                            }
                        }
                        else {
                            b2 = false;
                            if (n9 > 0) {
                                if (i >= n5 - 4) {
                                    if (i <= n5 + 1) {
                                        class1865 = Class6041.field24579;
                                        class1866 = class1861.method9872().method13339();
                                    }
                                }
                            }
                            else {
                                class1865 = Class7521.field29147.method11878();
                                class1866 = class1862;
                            }
                            if (i < n5) {
                                if (class1865 == null || class1865.method21706()) {
                                    class1865 = class1863;
                                }
                            }
                            n10 = n9 + Math.max(0, i - n5);
                            if (i < n5 - 1) {
                                class1860.method7008(class1867, class1866, false);
                                if (class1866 == Class6041.field24579) {
                                    class1860.method7008(class1867, Class6041.field24580, false);
                                }
                            }
                            else if (i <= 86 + n9 * 2) {
                                if (i <= n5 + 3 + n9) {
                                    class1860.method7008(class1867, class1861.method9872().method13338(), false);
                                    b2 = true;
                                }
                                else {
                                    Class7096 class1868;
                                    if (i >= 64 && i <= 127) {
                                        if (!b) {
                                            class1868 = this.method17964(n, i, n2);
                                        }
                                        else {
                                            class1868 = Class6041.field24581;
                                        }
                                    }
                                    else {
                                        class1868 = Class6041.field24580;
                                    }
                                    class1860.method7008(class1867, class1868, false);
                                }
                            }
                            else if (!b) {
                                class1860.method7008(class1867, Class7521.field29155.method11878(), false);
                            }
                            else {
                                class1860.method7008(class1867, Class7521.field29157.method11878(), false);
                            }
                        }
                        ++n11;
                    }
                }
                else {
                    n10 = -1;
                }
            }
        }
    }
    
    static {
        field24579 = Class7521.field29482.method11878();
        field24580 = Class7521.field29483.method11878();
        field24581 = Class7521.field29546.method11878();
    }
}
