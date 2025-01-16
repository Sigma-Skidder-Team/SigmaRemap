// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4565 extends Class4535<Class5144>
{
    public Class4565(final Function<Dynamic<?>, ? extends Class5144> function) {
        super(function);
    }
    
    public boolean method13574(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5144 class1854) {
        final BlockState method1164 = class1854.field22133.method1164(random, class1853);
        BlockPos method1165;
        if (!class1854.field22142) {
            method1165 = class1853;
        }
        else {
            method1165 = class1851.method6958(Class2020.field11521, class1853);
        }
        int n = 0;
        final Mutable class1855 = new Mutable();
        for (int i = 0; i < class1854.field22137; ++i) {
            class1855.method1287(method1165).method1292(random.nextInt(class1854.field22138 + 1) - random.nextInt(class1854.field22138 + 1), random.nextInt(class1854.field22139 + 1) - random.nextInt(class1854.field22139 + 1), random.nextInt(class1854.field22140 + 1) - random.nextInt(class1854.field22140 + 1));
            final BlockPos method1166 = class1855.method1139();
            final BlockState method1167 = class1851.getBlockState(method1166);
            if (!class1851.method6961(class1855)) {
                if (!class1854.field22141) {
                    continue;
                }
                if (!class1851.getBlockState(class1855).getMaterial().method26442()) {
                    continue;
                }
            }
            if (method1164.method21752(class1851, class1855)) {
                if (class1854.field22135.isEmpty() || class1854.field22135.contains(method1167.getBlock())) {
                    if (!class1854.field22136.contains(method1167)) {
                        if (class1854.field22143) {
                            if (!class1851.getFluidState(method1166.method1145()).isTagged(Class7324.field28319)) {
                                if (!class1851.getFluidState(method1166.method1147()).isTagged(Class7324.field28319)) {
                                    if (!class1851.getFluidState(method1166.method1141()).isTagged(Class7324.field28319)) {
                                        if (!class1851.getFluidState(method1166.method1143()).isTagged(Class7324.field28319)) {
                                            continue;
                                        }
                                    }
                                }
                            }
                        }
                        class1854.field22134.method1254(class1851, class1855, method1164, random);
                        ++n;
                    }
                }
            }
        }
        return n > 0;
    }
}
