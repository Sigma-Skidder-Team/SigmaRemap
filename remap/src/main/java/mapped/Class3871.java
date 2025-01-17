// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;

public class Class3871 extends Class3870 implements Class3872
{
    private static String[] field17514;
    
    public Class3871(final Properties class9288) {
        super(class9288);
    }
    
    @Override
    public boolean method11798(final BlockState class7096, final Class7074 class7097) {
        return false;
    }
    
    @Override
    public boolean method11945(final IBlockReader class1855, final BlockPos class1856, final BlockState class1857, final boolean b) {
        return true;
    }
    
    @Override
    public boolean method11946(final World class1847, final Random random, final BlockPos class1848, final BlockState class1849) {
        return true;
    }
    
    @Override
    public void method11947(final Class1849 class1849, final Random random, final BlockPos class1850, final BlockState class1851) {
        Block.method11839(class1849, class1850, new ItemStack(this));
    }
}
