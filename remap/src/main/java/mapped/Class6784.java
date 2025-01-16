// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

import java.util.Random;
import java.util.List;

public class Class6784
{
    private static String[] field26684;
    private static final Class7530[] field26685;
    private static final Class7530[] field26686;
    
    private static Class4484 method20739(final Class7530 class7530, final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Direction class7531, final int n4) {
        final Class<? extends Class4484> field29905 = class7530.field29905;
        Class4484 class7532 = null;
        if (field29905 != Class4491.class) {
            if (field29905 != Class4493.class) {
                if (field29905 != Class4488.class) {
                    if (field29905 != Class4498.class) {
                        if (field29905 != Class4497.class) {
                            if (field29905 != Class4486.class) {
                                if (field29905 != Class4495.class) {
                                    if (field29905 != Class4489.class) {
                                        if (field29905 != Class4487.class) {
                                            if (field29905 != Class4490.class) {
                                                if (field29905 != Class4496.class) {
                                                    if (field29905 != Class4492.class) {
                                                        if (field29905 == Class4499.class) {
                                                            class7532 = Class4499.method13491(list, n, n2, n3, class7531, n4);
                                                        }
                                                    }
                                                    else {
                                                        class7532 = Class4492.method13485(list, n, n2, n3, class7531, n4);
                                                    }
                                                }
                                                else {
                                                    class7532 = Class4496.method13488(list, n, n2, n3, class7531, n4);
                                                }
                                            }
                                            else {
                                                class7532 = Class4490.method13483(list, n, n2, n3, class7531, n4);
                                            }
                                        }
                                        else {
                                            class7532 = Class4487.method13480(list, random, n, n2, n3, class7531, n4);
                                        }
                                    }
                                    else {
                                        class7532 = Class4489.method13482(list, random, n, n2, n3, class7531, n4);
                                    }
                                }
                                else {
                                    class7532 = Class4495.method13487(list, n, n2, n3, class7531, n4);
                                }
                            }
                            else {
                                class7532 = Class4486.method13479(list, random, n, n2, n3, class7531, n4);
                            }
                        }
                        else {
                            class7532 = Class4497.method13489(list, n, n2, n3, n4, class7531);
                        }
                    }
                    else {
                        class7532 = Class4498.method13490(list, n, n2, n3, n4, class7531);
                    }
                }
                else {
                    class7532 = Class4488.method13481(list, n, n2, n3, class7531, n4);
                }
            }
            else {
                class7532 = Class4493.method13486(list, n, n2, n3, class7531, n4);
            }
        }
        else {
            class7532 = Class4491.method13484(list, random, n, n2, n3, class7531, n4);
        }
        return class7532;
    }
    
    static {
        field26685 = new Class7530[] { new Class7530(Class4491.class, 30, 0, true), new Class7530(Class4493.class, 10, 4), new Class7530(Class4488.class, 10, 4), new Class7530(Class4498.class, 10, 3), new Class7530(Class4497.class, 5, 2), new Class7530(Class4486.class, 5, 1) };
        field26686 = new Class7530[] { new Class7530(Class4495.class, 25, 0, true), new Class7530(Class4492.class, 15, 5), new Class7530(Class4489.class, 5, 10), new Class7530(Class4487.class, 5, 10), new Class7530(Class4490.class, 10, 3, true), new Class7530(Class4496.class, 7, 2), new Class7530(Class4499.class, 5, 2) };
    }
}
