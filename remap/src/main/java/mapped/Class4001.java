// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class Class4001 extends Class4000
{
    private static String[] field18034;
    public static final Class7112 field18035;
    private final int field18036;
    
    public Class4001(final int field18036, final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class4001.field18035, 0));
        this.field18036 = field18036;
    }
    
    @Override
    public int method12165(final World class1847, final BlockPos class1848) {
        final int min = Math.min(class1847.method7128((Class<? extends Entity>) Entity.class, Class4001.field18033.offset(class1848)).size(), this.field18036);
        if (min <= 0) {
            return 0;
        }
        return MathHelper.ceil(Math.min(this.field18036, min) / (float)this.field18036 * 15.0f);
    }
    
    @Override
    public void method12162(final Class1851 class1851, final BlockPos class1852) {
        class1851.method6705(null, class1852, Class8520.field35365, Class286.field1582, 0.3f, 0.90000004f);
    }
    
    @Override
    public void method12163(final Class1851 class1851, final BlockPos class1852) {
        class1851.method6705(null, class1852, Class8520.field35364, Class286.field1582, 0.3f, 0.75f);
    }
    
    @Override
    public int method12166(final BlockState class7096) {
        return class7096.get((IProperty<Integer>)Class4001.field18035);
    }
    
    @Override
    public BlockState method12167(final BlockState class7096, final int i) {
        return ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class4001.field18035, i);
    }
    
    @Override
    public int method11826(final Class1852 class1852) {
        return 10;
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class4001.field18035);
    }
    
    static {
        field18035 = Class8970.field37790;
    }
}
