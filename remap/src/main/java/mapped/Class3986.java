// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

import java.util.Random;

public class Class3986 extends Block
{
    private static String[] field17995;
    
    public Class3986(final Properties class9288) {
        super(class9288);
    }
    
    @Override
    public void onBlockAdded(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
        class7097.method6833().method21345(class7098, this, this.tickRate(class7097));
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        class7099.method6833().method21345(class7100, this, this.tickRate(class7099));
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public void method11822(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (method12131(class7097.getBlockState(class7098.method1139()))) {
            if (class7098.getY() >= 0) {
                final Class424 class7099 = new Class424(class7097, class7098.getX() + 0.5, class7098.getY(), class7098.getZ() + 0.5, class7097.getBlockState(class7098));
                this.method12130(class7099);
                class7097.method6886(class7099);
            }
        }
    }
    
    public void method12130(final Class424 class424) {
    }
    
    @Override
    public int tickRate(final Class1852 class1852) {
        return 2;
    }
    
    public static boolean method12131(final BlockState class7096) {
        final Block method21696 = class7096.getBlock();
        final Material method21697 = class7096.getMaterial();
        if (!class7096.method21706()) {
            if (method21696 != Blocks.FIRE) {
                if (!method21697.method26438()) {
                    return method21697.method26442();
                }
            }
        }
        return true;
    }
    
    public void method12132(final World class1847, final BlockPos class1848, final BlockState class1849, final BlockState class1850) {
    }
    
    public void method12133(final World class1847, final BlockPos class1848) {
    }
    
    @Override
    public void method11823(final BlockState class7096, final World class7097, final BlockPos class7098, final Random random) {
        if (random.nextInt(16) == 0) {
            if (method12131(class7097.getBlockState(class7098.method1139()))) {
                class7097.addParticle(new Class6911(Class8432.field34620, class7096), class7098.getX() + (double)random.nextFloat(), class7098.getY() - 0.05, class7098.getZ() + (double)random.nextFloat(), 0.0, 0.0, 0.0);
            }
        }
    }
    
    public int method12134(final BlockState class7096) {
        return -16777216;
    }
}
