// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class6033 extends Class6032<Class4408>
{
    public static final Class7096 field24565;
    public static final Class7096 field24566;
    private static final Class7096 field24567;
    private static final Class7096 field24568;
    private static final Class7096 field24569;
    private Class8575 field24570;
    private Class8575 field24571;
    private long field24572;
    
    public Class6033(final Function<Dynamic<?>, ? extends Class4408> function) {
        super(function);
    }
    
    public void method17959(final Random random, final Class1860 class1860, final Class3090 class1861, final int n, final int n2, final int a, final double a2, final Class7096 class1862, final Class7096 class1863, final int n3, final long n4, final Class4408 class1864) {
        double n5 = 0.0;
        double n6 = 0.0;
        final Mutable class1865 = new Mutable();
        final float method9845 = class1861.method9845(class1865.setPos(n, 63, n2));
        final double min = Math.min(Math.abs(a2), this.field24570.method29027(n * 0.1, n2 * 0.1, false) * 15.0);
        if (min > 1.8) {
            final double abs = Math.abs(this.field24571.method29027(n * 0.09765625, n2 * 0.09765625, false));
            double n7 = min * min * 1.2;
            final double n8 = Math.ceil(abs * 40.0) + 14.0;
            if (n7 > n8) {
                n7 = n8;
            }
            if (method9845 > 0.1f) {
                n7 -= 2.0;
            }
            if (n7 <= 2.0) {
                n5 = 0.0;
            }
            else {
                n6 = n3 - n7 - 7.0;
                n5 = n7 + n3;
            }
        }
        final int n9 = n & 0xF;
        final int n10 = n2 & 0xF;
        Class7096 class1866 = class1861.method9872().method13339();
        Class7096 class1867 = class1861.method9872().method13338();
        final int n11 = (int)(a2 / 3.0 + 3.0 + random.nextDouble() * 0.25);
        int n12 = -1;
        int n13 = 0;
        final int n14 = 2 + random.nextInt(4);
        final int n15 = n3 + 18 + random.nextInt(10);
        for (int i = Math.max(a, (int)n5 + 1); i >= 0; --i) {
            class1865.setPos(n9, i, n10);
            Label_0364: {
                if (class1860.method6701(class1865).method21706()) {
                    if (i < (int)n5) {
                        if (random.nextDouble() > 0.01) {
                            class1860.method7008(class1865, Class6033.field24565, false);
                            break Label_0364;
                        }
                    }
                }
                if (class1860.method6701(class1865).method21697() == Class8059.field33161) {
                    if (i > (int)n6) {
                        if (i < n3) {
                            if (n6 != 0.0) {
                                if (random.nextDouble() > 0.15) {
                                    class1860.method7008(class1865, Class6033.field24565, false);
                                }
                            }
                        }
                    }
                }
            }
            final Class7096 method9846 = class1860.method6701(class1865);
            if (!method9846.method21706()) {
                if (method9846.method21696() == class1862.method21696()) {
                    if (n12 != -1) {
                        if (n12 > 0) {
                            --n12;
                            class1860.method7008(class1865, class1866, false);
                            if (n12 == 0) {
                                if (class1866.method21696() == Class7521.field29175) {
                                    if (n11 > 1) {
                                        n12 = random.nextInt(4) + Math.max(0, i - 63);
                                        class1866 = ((class1866.method21696() != Class7521.field29176) ? Class7521.field29217.method11878() : Class7521.field29587.method11878());
                                    }
                                }
                            }
                        }
                    }
                    else {
                        if (n11 > 0) {
                            if (i >= n3 - 4) {
                                if (i <= n3 + 1) {
                                    class1867 = class1861.method9872().method13338();
                                    class1866 = class1861.method9872().method13339();
                                }
                            }
                        }
                        else {
                            class1867 = Class6033.field24567;
                            class1866 = class1862;
                        }
                        if (i < n3) {
                            if (class1867 == null || class1867.method21706()) {
                                if (class1861.method9845(class1865.setPos(n, i, n2)) >= 0.15f) {
                                    class1867 = class1863;
                                }
                                else {
                                    class1867 = Class6033.field24569;
                                }
                            }
                        }
                        n12 = n11;
                        if (i < n3 - 1) {
                            if (i >= n3 - 7 - n11) {
                                class1860.method7008(class1865, class1866, false);
                            }
                            else {
                                class1867 = Class6033.field24567;
                                class1866 = class1862;
                                class1860.method7008(class1865, Class6033.field24568, false);
                            }
                        }
                        else {
                            class1860.method7008(class1865, class1867, false);
                        }
                    }
                }
                else if (method9846.method21696() == Class7521.field29548) {
                    if (n13 <= n14) {
                        if (i > n15) {
                            class1860.method7008(class1865, Class6033.field24566, false);
                            ++n13;
                        }
                    }
                }
            }
            else {
                n12 = -1;
            }
        }
    }
    
    @Override
    public void method17962(final long field24572) {
        Label_0071: {
            if (this.field24572 == field24572) {
                if (this.field24570 != null) {
                    if (this.field24571 != null) {
                        break Label_0071;
                    }
                }
            }
            final Class2317 class2317 = new Class2317(field24572);
            this.field24570 = new Class8575(class2317, 3, 0);
            this.field24571 = new Class8575(class2317, 0, 0);
        }
        this.field24572 = field24572;
    }
    
    static {
        field24565 = Class7521.field29548.method11878();
        field24566 = Class7521.field29331.method11878();
        field24567 = Class7521.field29147.method11878();
        field24568 = Class7521.field29177.method11878();
        field24569 = Class7521.field29330.method11878();
    }
}
