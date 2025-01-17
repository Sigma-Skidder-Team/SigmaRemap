// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;

public class Class3949 extends Class3948
{
    private static String[] field17848;
    
    public Class3949(final Properties class9288) {
        super(class9288);
    }
    
    @Override
    public TileEntity method11898(final IBlockReader class1855) {
        return new Class468();
    }
    
    @Override
    public void method12066(final World class1847, final BlockPos class1848, final PlayerEntity class1849) {
        final TileEntity method6727 = class1847.getTileEntity(class1848);
        if (method6727 instanceof Class468) {
            class1849.method2833((Class434)method6727);
            class1849.method2857(Class8276.field34048);
        }
    }
    
    @Override
    public void method11823(final Class7096 class7096, final World class7097, final BlockPos class7098, final Random random) {
        if (class7096.method21772((IProperty<Boolean>)Class3949.field17847)) {
            final double n = class7098.getX() + 0.5;
            final double n2 = class7098.getY();
            final double n3 = class7098.getZ() + 0.5;
            if (random.nextDouble() < 0.1) {
                class7097.method6708(n, n2, n3, Class8520.field35594, Class286.field1582, 1.0f, 1.0f, false);
            }
            class7097.method6709(Class8432.field34639, n, n2 + 1.1, n3, 0.0, 0.0, 0.0);
        }
    }
}
