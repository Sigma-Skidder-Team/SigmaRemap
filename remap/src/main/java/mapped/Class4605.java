// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4605 extends Class4535<Class5131>
{
    public Class4605(final Function<Dynamic<?>, ? extends Class5131> function) {
        super(function);
    }
    
    public boolean method13662(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5131 class1854) {
        if (!class1854.field22104.contains(class1851.getBlockState(class1853.method1137()).getBlock())) {
            return false;
        }
        if (class1854.field22101 && !class1854.field22104.contains(class1851.getBlockState(class1853.method1139()).getBlock())) {
            return false;
        }
        final BlockState method6701 = class1851.getBlockState(class1853);
        if (!method6701.method21706() && !class1854.field22104.contains(method6701.getBlock())) {
            return false;
        }
        int n = 0;
        int n2 = 0;
        if (class1854.field22104.contains(class1851.getBlockState(class1853.method1145()).getBlock())) {
            ++n2;
        }
        if (class1854.field22104.contains(class1851.getBlockState(class1853.method1147()).getBlock())) {
            ++n2;
        }
        if (class1854.field22104.contains(class1851.getBlockState(class1853.method1141()).getBlock())) {
            ++n2;
        }
        if (class1854.field22104.contains(class1851.getBlockState(class1853.method1143()).getBlock())) {
            ++n2;
        }
        if (class1854.field22104.contains(class1851.getBlockState(class1853.method1139()).getBlock())) {
            ++n2;
        }
        int n3 = 0;
        if (class1851.method6961(class1853.method1145())) {
            ++n3;
        }
        if (class1851.method6961(class1853.method1147())) {
            ++n3;
        }
        if (class1851.method6961(class1853.method1141())) {
            ++n3;
        }
        if (class1851.method6961(class1853.method1143())) {
            ++n3;
        }
        if (class1851.method6961(class1853.method1139())) {
            ++n3;
        }
        if (n2 == class1854.field22102) {
            if (n3 == class1854.field22103) {
                class1851.setBlockState(class1853, class1854.field22100.method21791(), 2);
                class1851.method6834().method21345(class1853, class1854.field22100.method21779(), 0);
                ++n;
            }
        }
        return n > 0;
    }
}
