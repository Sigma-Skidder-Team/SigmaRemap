// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4562 extends Class4535<Class5141>
{
    private static final Class7096 field20040;
    
    public Class4562(final Function<Dynamic<?>, ? extends Class5141> function) {
        super(function);
    }
    
    public boolean method13542(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, Class354 class1853, final Class5141 class1854) {
        while (class1853.method1075() > 5 && class1851.method6961(class1853)) {
            class1853 = class1853.method1139();
        }
        if (class1853.method1075() <= 4) {
            return false;
        }
        class1853 = class1853.method1140(4);
        final Class7859 class1855 = new Class7859(class1853);
        if (class1851.method6966(class1855.field32290, class1855.field32291, Class9312.field39979).method7047(Class4535.field19972.method13596()).isEmpty()) {
            final boolean[] array = new boolean[2048];
            for (int n = random.nextInt(4) + 4, i = 0; i < n; ++i) {
                final double n2 = random.nextDouble() * 6.0 + 3.0;
                final double n3 = random.nextDouble() * 4.0 + 2.0;
                final double n4 = random.nextDouble() * 6.0 + 3.0;
                final double n5 = random.nextDouble() * (16.0 - n2 - 2.0) + 1.0 + n2 / 2.0;
                final double n6 = random.nextDouble() * (8.0 - n3 - 4.0) + 2.0 + n3 / 2.0;
                final double n7 = random.nextDouble() * (16.0 - n4 - 2.0) + 1.0 + n4 / 2.0;
                for (int j = 1; j < 15; ++j) {
                    for (int k = 1; k < 15; ++k) {
                        for (int l = 1; l < 7; ++l) {
                            final double n8 = (j - n5) / (n2 / 2.0);
                            final double n9 = (l - n6) / (n3 / 2.0);
                            final double n10 = (k - n7) / (n4 / 2.0);
                            if (n8 * n8 + n9 * n9 + n10 * n10 < 1.0) {
                                array[(j * 16 + k) * 8 + l] = true;
                            }
                        }
                    }
                }
            }
            for (int n11 = 0; n11 < 16; ++n11) {
                for (int n12 = 0; n12 < 16; ++n12) {
                    for (int n13 = 0; n13 < 8; ++n13) {
                        boolean b = false;
                        Label_0711: {
                            Label_0485: {
                                if (!array[(n11 * 16 + n12) * 8 + n13]) {
                                    if (n11 >= 15 || !array[((n11 + 1) * 16 + n12) * 8 + n13]) {
                                        if (n11 <= 0 || !array[((n11 - 1) * 16 + n12) * 8 + n13]) {
                                            if (n12 >= 15 || !array[(n11 * 16 + n12 + 1) * 8 + n13]) {
                                                if (n12 <= 0 || !array[(n11 * 16 + (n12 - 1)) * 8 + n13]) {
                                                    if (n13 >= 7 || !array[(n11 * 16 + n12) * 8 + n13 + 1]) {
                                                        if (n13 <= 0) {
                                                            break Label_0485;
                                                        }
                                                        if (!array[(n11 * 16 + n12) * 8 + (n13 - 1)]) {
                                                            break Label_0485;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    b = true;
                                    break Label_0711;
                                }
                            }
                            b = false;
                        }
                        if (b) {
                            final Class8059 method21697 = class1851.method6701(class1853.method1134(n11, n13, n12)).method21697();
                            if (n13 >= 4 && method21697.method26438()) {
                                return false;
                            }
                            if (n13 < 4) {
                                if (!method21697.method26439()) {
                                    if (class1851.method6701(class1853.method1134(n11, n13, n12)) != class1854.field22127) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (int n14 = 0; n14 < 16; ++n14) {
                for (int n15 = 0; n15 < 16; ++n15) {
                    for (int n16 = 0; n16 < 8; ++n16) {
                        if (array[(n14 * 16 + n15) * 8 + n16]) {
                            class1851.method6688(class1853.method1134(n14, n16, n15), (n16 < 4) ? class1854.field22127 : Class4562.field20040, 2);
                        }
                    }
                }
            }
            for (int n17 = 0; n17 < 16; ++n17) {
                for (int n18 = 0; n18 < 16; ++n18) {
                    for (int n19 = 4; n19 < 8; ++n19) {
                        if (array[(n17 * 16 + n18) * 8 + n19]) {
                            final Class354 method21698 = class1853.method1134(n17, n19 - 1, n18);
                            if (Class4535.method13533(class1851.method6701(method21698).method21696())) {
                                if (class1851.method6992(Class237.field911, class1853.method1134(n17, n19, n18)) > 0) {
                                    if (class1851.method6959(method21698).method9872().method13338().method21696() != Class7521.field29392) {
                                        class1851.method6688(method21698, Class7521.field29155.method11878(), 2);
                                    }
                                    else {
                                        class1851.method6688(method21698, Class7521.field29392.method11878(), 2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class1854.field22127.method21697() == Class8059.field33163) {
                for (int n20 = 0; n20 < 16; ++n20) {
                    for (int n21 = 0; n21 < 16; ++n21) {
                        for (int n22 = 0; n22 < 8; ++n22) {
                            boolean b2 = false;
                            Label_1463: {
                                Label_1237: {
                                    if (!array[(n20 * 16 + n21) * 8 + n22]) {
                                        if (n20 >= 15 || !array[((n20 + 1) * 16 + n21) * 8 + n22]) {
                                            if (n20 <= 0 || !array[((n20 - 1) * 16 + n21) * 8 + n22]) {
                                                if (n21 >= 15 || !array[(n20 * 16 + n21 + 1) * 8 + n22]) {
                                                    if (n21 <= 0 || !array[(n20 * 16 + (n21 - 1)) * 8 + n22]) {
                                                        if (n22 >= 7 || !array[(n20 * 16 + n21) * 8 + n22 + 1]) {
                                                            if (n22 <= 0) {
                                                                break Label_1237;
                                                            }
                                                            if (!array[(n20 * 16 + n21) * 8 + (n22 - 1)]) {
                                                                break Label_1237;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        b2 = true;
                                        break Label_1463;
                                    }
                                }
                                b2 = false;
                            }
                            if (b2) {
                                if (n22 < 4 || random.nextInt(2) != 0) {
                                    if (class1851.method6701(class1853.method1134(n20, n22, n21)).method21697().method26439()) {
                                        class1851.method6688(class1853.method1134(n20, n22, n21), Class7521.field29148.method11878(), 2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class1854.field22127.method21697() == Class8059.field33161) {
                for (int n23 = 0; n23 < 16; ++n23) {
                    for (int n24 = 0; n24 < 16; ++n24) {
                        final Class354 method21699 = class1853.method1134(n23, 4, n24);
                        if (class1851.method6959(method21699).method9847(class1851, method21699, false)) {
                            class1851.method6688(method21699, Class7521.field29330.method11878(), 2);
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    static {
        field20040 = Class7521.field29764.method11878();
    }
}
