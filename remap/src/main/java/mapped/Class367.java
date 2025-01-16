// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.Set;
import java.util.List;
import java.util.Random;

public abstract class Class367 implements IDynamicSerializable
{
    public final Class7742<?> field2209;
    
    public Class367(final Class7742<?> field2209) {
        this.field2209 = field2209;
    }
    
    public abstract void method1241(final Class1851 p0, final Random p1, final List<BlockPos> p2, final List<BlockPos> p3, final Set<BlockPos> p4, final MutableBoundingBox p5);
    
    public void method1242(final Class1876 class1876, final BlockPos class1877, final Class7113 class1878, final Set<BlockPos> set, final MutableBoundingBox class1879) {
        this.method1243(class1876, class1877, ((StateHolder<O, BlockState>)Class7521.field29388.getDefaultState()).with((IProperty<Comparable>)class1878, true), set, class1879);
    }
    
    public void method1243(final Class1876 class1876, final BlockPos class1877, final BlockState class1878, final Set<BlockPos> set, final MutableBoundingBox class1879) {
        class1876.setBlockState(class1877, class1878, 19);
        set.add(class1877);
        class1879.expandTo(new MutableBoundingBox(class1877, class1877));
    }
}
