// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;
import org.apache.logging.log4j.Logger;

public class Class4541 extends Class4535<Class5122>
{
    private static final Logger field20026;
    private static final Class7499<?>[] field20027;
    private static final Class7096 field20028;
    
    public Class4541(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
    }
    
    public boolean method13535(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5122 class1854) {
        final int n = random.nextInt(2) + 2;
        final int n2 = -n - 1;
        final int n3 = n + 1;
        final int n4 = random.nextInt(2) + 2;
        final int n5 = -n4 - 1;
        final int n6 = n4 + 1;
        int n7 = 0;
        for (int i = n2; i <= n3; ++i) {
            for (int j = -1; j <= 4; ++j) {
                for (int k = n5; k <= n6; ++k) {
                    final BlockPos method1134 = class1853.method1134(i, j, k);
                    final boolean method1135 = class1851.method6701(method1134).method21697().method26439();
                    if (j == -1 && !method1135) {
                        return false;
                    }
                    if (j == 4 && !method1135) {
                        return false;
                    }
                    if (i != n2) {
                        if (i != n3) {
                            if (k != n5) {
                                if (k != n6) {
                                    continue;
                                }
                            }
                        }
                    }
                    if (j == 0) {
                        if (class1851.method6961(method1134)) {
                            if (class1851.method6961(method1134.method1137())) {
                                ++n7;
                            }
                        }
                    }
                }
            }
        }
        if (n7 >= 1 && n7 <= 5) {
            for (int l = n2; l <= n3; ++l) {
                for (int n8 = 3; n8 >= -1; --n8) {
                    for (int n9 = n5; n9 <= n6; ++n9) {
                        final BlockPos method1136 = class1853.method1134(l, n8, n9);
                        if (l != n2) {
                            if (n8 != -1) {
                                if (n9 != n5) {
                                    if (l != n3) {
                                        if (n8 != 4) {
                                            if (n9 != n6) {
                                                if (class1851.method6701(method1136).method21696() == Class7521.field29292) {
                                                    continue;
                                                }
                                                class1851.method6688(method1136, Class4541.field20028, 2);
                                                continue;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (method1136.getY() >= 0 && !class1851.method6701(method1136.method1139()).method21697().method26439()) {
                            class1851.method6688(method1136, Class4541.field20028, 2);
                        }
                        else if (class1851.method6701(method1136).method21697().method26439()) {
                            if (class1851.method6701(method1136).method21696() != Class7521.field29292) {
                                if (n8 == -1 && random.nextInt(4) != 0) {
                                    class1851.method6688(method1136, Class7521.field29285.method11878(), 2);
                                }
                                else {
                                    class1851.method6688(method1136, Class7521.field29159.method11878(), 2);
                                }
                            }
                        }
                    }
                }
            }
            for (int n10 = 0; n10 < 2; ++n10) {
                for (int n11 = 0; n11 < 3; ++n11) {
                    final BlockPos class1855 = new BlockPos(class1853.getX() + random.nextInt(n * 2 + 1) - n, class1853.getY(), class1853.getZ() + random.nextInt(n4 * 2 + 1) - n4);
                    if (class1851.method6961(class1855)) {
                        int n12 = 0;
                        final Iterator<Direction> iterator = Plane.HORIZONTAL.iterator();
                        while (iterator.hasNext()) {
                            if (!class1851.method6701(class1855.method1149(iterator.next())).method21697().method26439()) {
                                continue;
                            }
                            ++n12;
                        }
                        if (n12 == 1) {
                            class1851.method6688(class1855, Class4473.method13451(class1851, class1855, Class7521.field29292.method11878()), 2);
                            Class456.method2323(class1851, random, class1855, Class9020.field38066);
                            break;
                        }
                    }
                }
            }
            class1851.method6688(class1853, Class7521.field29290.method11878(), 2);
            final Class436 method1137 = class1851.method6727(class1853);
            if (!(method1137 instanceof Class494)) {
                Class4541.field20026.error("Failed to fetch mob spawner entity at ({}, {}, {})", (Object)class1853.getX(), (Object)class1853.getY(), (Object)class1853.getZ());
            }
            else {
                ((Class494)method1137).method2509().method13884(this.method13540(random));
            }
            return true;
        }
        return false;
    }
    
    private Class7499<?> method13540(final Random random) {
        return Class4541.field20027[random.nextInt(Class4541.field20027.length)];
    }
    
    static {
        field20026 = LogManager.getLogger();
        field20027 = new Class7499[] { Class7499.field29023, Class7499.field29052, Class7499.field29052, Class7499.field29030 };
        field20028 = Class7521.field29764.method11878();
    }
}
