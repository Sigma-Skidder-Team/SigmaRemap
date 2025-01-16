// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;

import java.util.function.Function;

public class Class4540 extends Class4535<Class5116>
{
    public Class4540(final Function<Dynamic<?>, ? extends Class5116> function) {
        super(function);
    }
    
    public boolean method13538(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5116 class1854) {
        for (final BlockPos class1855 : BlockPos.getAllInBoxMutable(class1853.add(-1, -2, -1), class1853.add(1, 2, 1))) {
            final boolean b = class1855.getX() == class1853.getX();
            final boolean b2 = class1855.getY() == class1853.getY();
            final boolean b3 = class1855.getZ() == class1853.getZ();
            final boolean b4 = Math.abs(class1855.getY() - class1853.getY()) == 2;
            if (b) {
                if (b2) {
                    if (b3) {
                        this.method13529(class1851, class1855.toImmutable(), Class7521.field29638.getDefaultState());
                        class1854.method16016().ifPresent(class1859 -> {
                            class1856.method6727(class1857);
                            final Class488 class1860;
                            if (!(!(class1860 instanceof Class488))) {
                                class1860.method2446(class1859, class1858.method16017());
                                class1860.method2161();
                            }
                            return;
                        });
                        continue;
                    }
                }
            }
            if (!b2) {
                if (b4) {
                    if (b) {
                        if (b3) {
                            this.method13529(class1851, class1855, Class7521.field29172.getDefaultState());
                            continue;
                        }
                    }
                }
                if (b || b3) {
                    if (!b4) {
                        this.method13529(class1851, class1855, Class7521.field29172.getDefaultState());
                        continue;
                    }
                }
                this.method13529(class1851, class1855, Class7521.field29147.getDefaultState());
            }
            else {
                this.method13529(class1851, class1855, Class7521.field29147.getDefaultState());
            }
        }
        return true;
    }
}
