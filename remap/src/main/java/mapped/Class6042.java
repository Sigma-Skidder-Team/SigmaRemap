// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class6042 extends Class6040
{
    private static final Class7096 field24579;
    private static final Class7096 field24580;
    private static final Class7096 field24581;
    
    public Class6042(final Function<Dynamic<?>, ? extends Class4408> function) {
        super(function);
    }
    
    @Override
    public void method17959(final Random random, final IChunk class1860, final Class3090 class1861, final int n, final int n2, final int a, final double a2, final Class7096 class1862, final Class7096 class1863, final int n3, final long n4, final Class4408 class1864) {
        double n5 = 0.0;
        final double min = Math.min(Math.abs(a2), this.field24588.method29027(n * 0.25, n2 * 0.25, false) * 15.0);
        if (min > 0.0) {
            final double abs = Math.abs(this.field24589.method29027(n * 0.001953125, n2 * 0.001953125, false));
            double n6 = min * min * 2.5;
            final double n7 = Math.ceil(abs * 50.0) + 14.0;
            if (n6 > n7) {
                n6 = n7;
            }
            n5 = n6 + 64.0;
        }
        final int n8 = n & 0xF;
        final int n9 = n2 & 0xF;
        Class7096 class1865 = Class6042.field24579;
        Class7096 class1866 = class1861.method9872().method13339();
        final int n10 = (int)(a2 / 3.0 + 3.0 + random.nextDouble() * 0.25);
        final boolean b = Math.cos(a2 / 3.0 * 3.141592653589793) > 0.0;
        int n11 = -1;
        boolean b2 = false;
        final Mutable class1867 = new Mutable();
        for (int i = Math.max(a, (int)n5 + 1); i >= 0; --i) {
            class1867.setPos(n8, i, n9);
            if (class1860.getBlockState(class1867).method21706()) {
                if (i < (int)n5) {
                    class1860.method7008(class1867, class1862, false);
                }
            }
            final Class7096 method6701 = class1860.getBlockState(class1867);
            if (!method6701.method21706()) {
                if (method6701.method21696() == class1862.method21696()) {
                    if (n11 != -1) {
                        if (n11 > 0) {
                            --n11;
                            if (!b2) {
                                class1860.method7008(class1867, this.method17964(n, i, n2), false);
                            }
                            else {
                                class1860.method7008(class1867, Class6042.field24580, false);
                            }
                        }
                    }
                    else {
                        b2 = false;
                        if (n10 > 0) {
                            if (i >= n3 - 4) {
                                if (i <= n3 + 1) {
                                    class1865 = Class6042.field24579;
                                    class1866 = class1861.method9872().method13339();
                                }
                            }
                        }
                        else {
                            class1865 = Class7521.field29147.getDefaultState();
                            class1866 = class1862;
                        }
                        if (i < n3) {
                            if (class1865 == null || class1865.method21706()) {
                                class1865 = class1863;
                            }
                        }
                        n11 = n10 + Math.max(0, i - n3);
                        if (i < n3 - 1) {
                            class1860.method7008(class1867, class1866, false);
                            final Block method6702 = class1866.method21696();
                            Label_0810: {
                                if (method6702 != Class7521.field29482) {
                                    if (method6702 != Class7521.field29483) {
                                        if (method6702 != Class7521.field29484) {
                                            if (method6702 != Class7521.field29485) {
                                                if (method6702 != Class7521.field29486) {
                                                    if (method6702 != Class7521.field29487) {
                                                        if (method6702 != Class7521.field29488) {
                                                            if (method6702 != Class7521.field29489) {
                                                                if (method6702 != Class7521.field29490) {
                                                                    if (method6702 != Class7521.field29491) {
                                                                        if (method6702 != Class7521.field29492) {
                                                                            if (method6702 != Class7521.field29493) {
                                                                                if (method6702 != Class7521.field29494) {
                                                                                    if (method6702 != Class7521.field29495) {
                                                                                        if (method6702 != Class7521.field29496) {
                                                                                            if (method6702 != Class7521.field29497) {
                                                                                                break Label_0810;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                class1860.method7008(class1867, Class6042.field24580, false);
                            }
                        }
                        else if (i > n3 + 3 + n10) {
                            Class7096 class1868;
                            if (i >= 64 && i <= 127) {
                                if (!b) {
                                    class1868 = this.method17964(n, i, n2);
                                }
                                else {
                                    class1868 = Class6042.field24581;
                                }
                            }
                            else {
                                class1868 = Class6042.field24580;
                            }
                            class1860.method7008(class1867, class1868, false);
                        }
                        else {
                            class1860.method7008(class1867, class1861.method9872().method13338(), false);
                            b2 = true;
                        }
                    }
                }
            }
            else {
                n11 = -1;
            }
        }
    }
    
    static {
        field24579 = Class7521.field29482.getDefaultState();
        field24580 = Class7521.field29483.getDefaultState();
        field24581 = Class7521.field29546.getDefaultState();
    }
}
