// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4602 extends Class4535<Class5135>
{
    public Class4602(final Function<Dynamic<?>, ? extends Class5135> function) {
        super(function);
    }
    
    public boolean method13660(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5135 class1854) {
        if (class1854.field22112.contains(class1851.getBlockState(class1853.method1139()))) {
            if (class1854.field22113.contains(class1851.getBlockState(class1853))) {
                if (class1854.field22114.contains(class1851.getBlockState(class1853.method1137()))) {
                    class1851.setBlockState(class1853, class1854.field22111, 2);
                    return true;
                }
            }
        }
        return false;
    }
}
