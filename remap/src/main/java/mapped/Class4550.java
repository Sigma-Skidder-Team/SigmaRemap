// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.cache.CacheLoader;
import java.util.concurrent.TimeUnit;
import com.google.common.cache.CacheBuilder;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;
import java.util.List;
import com.google.common.cache.LoadingCache;
import net.minecraft.util.math.MathHelper;

public class Class4550 extends Class4535<Class5143>
{
    private static final LoadingCache<Long, List<Class9341>> field20029;
    
    public Class4550(final Function<Dynamic<?>, ? extends Class5143> function) {
        super(function);
    }
    
    public static List<Class9341> method13560(final Class1851 class1851) {
        return (List)Class4550.field20029.getUnchecked((Object)(new Random(class1851.method6753()).nextLong() & 0xFFFFL));
    }
    
    public boolean method13561(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5143 class1854) {
        List<Class9341> list = class1854.method16059();
        if (list.isEmpty()) {
            list = method13560(class1851);
        }
        for (final Class9341 class1855 : list) {
            if (!class1855.method34618(class1853)) {
                continue;
            }
            this.method13562(class1851, random, class1854, class1855);
        }
        return true;
    }
    
    private void method13562(final Class1851 class1851, final Random random, final Class5143 class1852, final Class9341 class1853) {
        final int method34621 = class1853.method34621();
        for (final BlockPos class1854 : BlockPos.method1154(new BlockPos(class1853.method34619() - method34621, 0, class1853.method34620() - method34621), new BlockPos(class1853.method34619() + method34621, class1853.method34622() + 10, class1853.method34620() + method34621))) {
            if (class1854.distanceSq(class1853.method34619(), class1854.getY(), class1853.method34620(), false) <= method34621 * method34621 + 1 && class1854.getY() < class1853.method34622()) {
                this.method13529(class1851, class1854, Class7521.field29286.method11878());
            }
            else {
                if (class1854.getY() <= 65) {
                    continue;
                }
                this.method13529(class1851, class1854, Class7521.field29147.method11878());
            }
        }
        if (class1853.method34623()) {
            final Class385 class1855 = new Class385();
            for (int i = -2; i <= 2; ++i) {
                for (int j = -2; j <= 2; ++j) {
                    for (int k = 0; k <= 3; ++k) {
                        final boolean b = MathHelper.abs(i) == 2;
                        final boolean b2 = MathHelper.abs(j) == 2;
                        final boolean b3 = k == 3;
                        if (!b) {
                            if (!b2) {
                                if (!b3) {
                                    continue;
                                }
                            }
                        }
                        boolean b4 = false;
                        Label_0503: {
                            if (i != -2) {
                                if (i != 2) {
                                    if (!b3) {
                                        b4 = false;
                                        break Label_0503;
                                    }
                                }
                            }
                            b4 = true;
                        }
                        final boolean b5 = b4;
                        boolean b6 = false;
                        Label_0541: {
                            if (j != -2) {
                                if (j != 2) {
                                    if (!b3) {
                                        b6 = false;
                                        break Label_0541;
                                    }
                                }
                            }
                            b6 = true;
                        }
                        final boolean b7 = b6;
                        this.method13529(class1851, class1855.method1284(class1853.method34619() + i, class1853.method34622() + k, class1853.method34620() + j), (Class7096)((Class7097<Object, Object>)((Class7097<Object, Object>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29381.method11878()).method21773((Class7111<Comparable>)Class3853.field17465, b5 && j != -2)).method21773((Class7111<Comparable>)Class3853.field17467, b5 && j != 2)).method21773((Class7111<Comparable>)Class3853.field17468, b7 && i != -2)).method21773((Class7111<Comparable>)Class3853.field17466, b7 && i != 2));
                    }
                }
            }
        }
        final Class858 class1856 = Class7499.field28975.method23371(class1851.method6744());
        class1856.method5182(class1852.method16060());
        class1856.method1851(class1852.method16058());
        class1856.method1730(class1853.method34619() + 0.5f, class1853.method34622() + 1, class1853.method34620() + 0.5f, random.nextFloat() * 360.0f, 0.0f);
        class1851.method6886(class1856);
        this.method13529(class1851, new BlockPos(class1853.method34619(), class1853.method34622(), class1853.method34620()), Class7521.field29172.method11878());
    }
    
    static {
        field20029 = CacheBuilder.newBuilder().expireAfterWrite(5L, TimeUnit.MINUTES).build((CacheLoader)new Class6048(null));
    }
}
