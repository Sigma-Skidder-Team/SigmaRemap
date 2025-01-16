// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.Direction;

import java.util.List;
import java.util.Random;

public class Class4513 extends Class4500
{
    private final boolean field19914;
    private final boolean field19915;
    
    public Class4513(final int n, final Random random, final MutableBoundingBox field19849, final Direction class179) {
        super(Class9520.field40975, n);
        this.method13456(class179);
        this.field19896 = this.method13493(random);
        this.field19849 = field19849;
        this.field19914 = (random.nextInt(2) == 0);
        this.field19915 = (random.nextInt(2) == 0);
    }
    
    public Class4513(final Class1795 class1795, final CompoundNBT class1796) {
        super(Class9520.field40975, class1796);
        this.field19914 = class1796.getBoolean("Left");
        this.field19915 = class1796.getBoolean("Right");
    }
    
    @Override
    public void method13415(final CompoundNBT class51) {
        super.method13415(class51);
        class51.putBoolean("Left", this.field19914);
        class51.putBoolean("Right", this.field19915);
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        this.method13494((Class4507)class4473, list, random, 1, 1);
        if (this.field19914) {
            this.method13495((Class4507)class4473, list, random, 1, 2);
        }
        if (this.field19915) {
            this.method13496((Class4507)class4473, list, random, 1, 2);
        }
    }
    
    public static Class4513 method13508(final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Direction class179, final int n4) {
        final MutableBoundingBox method21408 = MutableBoundingBox.getComponentToAddBoundingBox(n, n2, n3, -1, -1, 0, 5, 5, 7, class179);
        return (Class4500.method13497(method21408) && Class4473.method13435(list, method21408) == null) ? new Class4513(n4, random, method21408, class179) : null;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final ChunkPos class1854) {
        this.method13445(class1851, class1853, 0, 0, 0, 4, 4, 6, true, random, Class6924.method21296());
        this.method13492(class1851, random, class1853, this.field19896, 1, 1, 0);
        this.method13492(class1851, random, class1853, Class1982.field10976, 1, 1, 6);
        final BlockState class1855 = ((StateHolder<O, BlockState>) Blocks.WALL_TORCH.getDefaultState()).with((IProperty<Comparable>)Class4023.field18110, Direction.EAST);
        final BlockState class1856 = ((StateHolder<O, BlockState>) Blocks.WALL_TORCH.getDefaultState()).with((IProperty<Comparable>)Class4023.field18110, Direction.WEST);
        this.method13447(class1851, class1853, random, 0.1f, 1, 2, 1, class1855);
        this.method13447(class1851, class1853, random, 0.1f, 3, 2, 1, class1856);
        this.method13447(class1851, class1853, random, 0.1f, 1, 2, 5, class1855);
        this.method13447(class1851, class1853, random, 0.1f, 3, 2, 5, class1856);
        if (this.field19914) {
            this.method13444(class1851, class1853, 0, 1, 2, 0, 3, 4, Class4513.field19848, Class4513.field19848, false);
        }
        if (this.field19915) {
            this.method13444(class1851, class1853, 4, 1, 2, 4, 3, 4, Class4513.field19848, Class4513.field19848, false);
        }
        return true;
    }
}
