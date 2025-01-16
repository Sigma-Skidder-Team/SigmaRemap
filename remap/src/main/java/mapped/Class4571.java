// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;

import java.util.function.Function;

public class Class4571 extends Class4535<Class5122>
{
    private static final Class169 field20060;
    private final BlockState field20061;
    private final BlockState field20062;
    private final BlockState field20063;
    
    public Class4571(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
        this.field20061 = Class7521.field29599.getDefaultState();
        this.field20062 = Class7521.field29217.getDefaultState();
        this.field20063 = Class7521.field29173.getDefaultState();
    }
    
    public boolean method13535(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, BlockPos class1853, final Class5122 class1854) {
        for (class1853 = class1853.method1137(); class1851.method6961(class1853) && class1853.getY() > 2; class1853 = class1853.method1139()) {}
        if (Class4571.field20060.test(class1851.getBlockState(class1853))) {
            for (int i = -2; i <= 2; ++i) {
                for (int j = -2; j <= 2; ++j) {
                    if (class1851.method6961(class1853.add(i, -1, j)) && class1851.method6961(class1853.add(i, -2, j))) {
                        return false;
                    }
                }
            }
            for (int k = -1; k <= 0; ++k) {
                for (int l = -2; l <= 2; ++l) {
                    for (int n = -2; n <= 2; ++n) {
                        class1851.setBlockState(class1853.add(l, k, n), this.field20062, 2);
                    }
                }
            }
            class1851.setBlockState(class1853, this.field20063, 2);
            final Iterator<Direction> iterator = Plane.HORIZONTAL.iterator();
            while (iterator.hasNext()) {
                class1851.setBlockState(class1853.method1149(iterator.next()), this.field20063, 2);
            }
            for (int n2 = -2; n2 <= 2; ++n2) {
                for (int n3 = -2; n3 <= 2; ++n3) {
                    if (n2 != -2) {
                        if (n2 != 2) {
                            if (n3 != -2) {
                                if (n3 != 2) {
                                    continue;
                                }
                            }
                        }
                    }
                    class1851.setBlockState(class1853.add(n2, 1, n3), this.field20062, 2);
                }
            }
            class1851.setBlockState(class1853.add(2, 1, 0), this.field20061, 2);
            class1851.setBlockState(class1853.add(-2, 1, 0), this.field20061, 2);
            class1851.setBlockState(class1853.add(0, 1, 2), this.field20061, 2);
            class1851.setBlockState(class1853.add(0, 1, -2), this.field20061, 2);
            for (int n4 = -1; n4 <= 1; ++n4) {
                for (int n5 = -1; n5 <= 1; ++n5) {
                    if (n4 == 0 && n5 == 0) {
                        class1851.setBlockState(class1853.add(n4, 4, n5), this.field20062, 2);
                    }
                    else {
                        class1851.setBlockState(class1853.add(n4, 4, n5), this.field20061, 2);
                    }
                }
            }
            for (int n6 = 1; n6 <= 3; ++n6) {
                class1851.setBlockState(class1853.add(-1, n6, -1), this.field20062, 2);
                class1851.setBlockState(class1853.add(-1, n6, 1), this.field20062, 2);
                class1851.setBlockState(class1853.add(1, n6, -1), this.field20062, 2);
                class1851.setBlockState(class1853.add(1, n6, 1), this.field20062, 2);
            }
            return true;
        }
        return false;
    }
    
    static {
        field20060 = Class169.method766(Class7521.field29175);
    }
}
