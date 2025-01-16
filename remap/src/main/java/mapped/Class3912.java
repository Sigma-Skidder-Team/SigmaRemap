// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class Class3912 extends Class3910
{
    private static String[] field17718;
    
    public Class3912(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public void method11823(final BlockState class7096, final World class7097, final BlockPos class7098, final Random random) {
        super.method11823(class7096, class7097, class7098, random);
        if (random.nextInt(10) == 0) {
            class7097.method6709(Class8432.field34634, class7098.getX() + (double)random.nextFloat(), class7098.getY() + 1.1, class7098.getZ() + (double)random.nextFloat(), 0.0, 0.0, 0.0);
        }
    }
}
