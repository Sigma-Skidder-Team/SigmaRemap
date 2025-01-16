// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;
import net.minecraft.world.World;

import java.util.Random;

public class Class3951 extends Class3948
{
    private static String[] field17850;
    
    public Class3951(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public TileEntity method11898(final IBlockReader class1855) {
        return new Class467();
    }
    
    @Override
    public void method12066(final World class1847, final BlockPos class1848, final PlayerEntity class1849) {
        final TileEntity method6727 = class1847.getTileEntity(class1848);
        if (method6727 instanceof Class467) {
            class1849.method2833((Class434)method6727);
            class1849.method2857(Class8276.field34041);
        }
    }
    
    @Override
    public void method11823(final Class7096 class7096, final World class7097, final BlockPos class7098, final Random random) {
        if (class7096.method21772((IProperty<Boolean>)Class3951.field17847)) {
            final double n = class7098.getX() + 0.5;
            final double n2 = class7098.getY();
            final double n3 = class7098.getZ() + 0.5;
            if (random.nextDouble() < 0.1) {
                class7097.method6708(n, n2, n3, Class8520.field35212, Class286.field1582, 1.0f, 1.0f, false);
            }
            final Direction class7099 = class7096.method21772((IProperty<Direction>)Class3951.field17846);
            final Axis method790 = class7099.getAxis();
            final double n4 = random.nextDouble() * 0.6 - 0.3;
            final double n5 = (method790 != Axis.X) ? n4 : (class7099.getXOffset() * 0.52);
            final double n6 = random.nextDouble() * 6.0 / 16.0;
            final double n7 = (method790 != Axis.Z) ? n4 : (class7099.getZOffset() * 0.52);
            class7097.method6709(Class8432.field34639, n + n5, n2 + n6, n3 + n7, 0.0, 0.0, 0.0);
            class7097.method6709(Class8432.field34623, n + n5, n2 + n6, n3 + n7, 0.0, 0.0, 0.0);
        }
    }
}
