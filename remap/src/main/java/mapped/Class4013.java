// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.world.World;

import java.util.Random;

public class Class4013 extends Block
{
    private static String[] field18084;
    
    public Class4013(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public void method11828(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
        if (class7097.method6789().method20502()) {
            class7097.setBlockState(class7098, Class7521.field29211.getDefaultState(), 3);
            class7097.method6955(2009, class7098, 0);
            class7097.method6705(null, class7098, Class8520.field35199, Class286.field1582, 1.0f, (1.0f + class7097.method6790().nextFloat() * 0.2f) * 0.7f);
        }
    }
    
    @Override
    public void method11823(final BlockState class7096, final World class7097, final BlockPos class7098, final Random random) {
        final Direction method798 = Direction.random(random);
        if (method798 != Direction.UP) {
            final BlockPos method799 = class7098.method1149(method798);
            final BlockState method800 = class7097.getBlockState(method799);
            if (!class7096.isSolid() || !method800.isSolidSide(class7097, method799, method798.getOpposite())) {
                final double n = class7098.getX();
                final double n2 = class7098.getY();
                final double n3 = class7098.getZ();
                double n4;
                double n5;
                double n6;
                if (method798 != Direction.DOWN) {
                    n4 = n2 + random.nextDouble() * 0.8;
                    if (method798.getAxis() != Axis.X) {
                        n5 = n + random.nextDouble();
                        if (method798 != Direction.SOUTH) {
                            n6 = n3 + 0.05;
                        }
                        else {
                            n6 = n3 + 1.0;
                        }
                    }
                    else {
                        n6 = n3 + random.nextDouble();
                        if (method798 != Direction.EAST) {
                            n5 = n + 0.05;
                        }
                        else {
                            n5 = n + 1.0;
                        }
                    }
                }
                else {
                    n4 = n2 - 0.05;
                    n5 = n + random.nextDouble();
                    n6 = n3 + random.nextDouble();
                }
                class7097.method6709(Class8432.field34609, n5, n4, n6, 0.0, 0.0, 0.0);
            }
        }
    }
}
