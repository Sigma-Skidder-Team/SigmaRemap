// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class Class7258 extends Class7257
{
    @Override
    public Fluid method22174() {
        return Class7558.field29975;
    }
    
    @Override
    public Fluid method22176() {
        return Class7558.field29976;
    }
    
    @Override
    public Item method22149() {
        return Items.field31350;
    }
    
    @Override
    public void animateTick(final World class1847, final BlockPos class1848, final IFluidState class1849, final Random random) {
        if (!class1849.isSource() && !class1849.get((IProperty<Boolean>)Class7258.field28132)) {
            if (random.nextInt(64) == 0) {
                class1847.method6708(class1848.getX() + 0.5, class1848.getY() + 0.5, class1848.getZ() + 0.5, Class8520.field35710, Class286.field1582, random.nextFloat() * 0.25f + 0.75f, random.nextFloat() + 0.5f, false);
            }
        }
        else if (random.nextInt(10) == 0) {
            class1847.method6709(Class8432.field34645, class1848.getX() + (double)random.nextFloat(), class1848.getY() + (double)random.nextFloat(), class1848.getZ() + (double)random.nextFloat(), 0.0, 0.0, 0.0);
        }
    }
    
    @Nullable
    @Override
    public IParticleData getDripParticleData() {
        return Class8432.field34609;
    }
    
    @Override
    public boolean method22178() {
        return true;
    }
    
    @Override
    public void method22180(final Class1851 class1851, final BlockPos class1852, final BlockState class1853) {
        Block.method11837(class1853, class1851.method6744(), class1852, class1853.getBlock().method11802() ? class1851.getTileEntity(class1852) : null);
    }
    
    @Override
    public int method22186(final Class1852 class1852) {
        return 4;
    }
    
    @Override
    public BlockState getBlockState(final IFluidState IFluidState) {
        return ((StateHolder<O, BlockState>)Class7521.field29173.getDefaultState()).with((IProperty<Comparable>)Class3859.field17480, Class7257.method22193(IFluidState));
    }
    
    @Override
    public boolean isEquivalentTo(final Fluid class7255) {
        return class7255 == Class7558.field29976 || class7255 == Class7558.field29975;
    }
    
    @Override
    public int method22191(final Class1852 class1852) {
        return 1;
    }
    
    @Override
    public int method22156(final Class1852 class1852) {
        return 5;
    }
    
    @Override
    public boolean canDisplace(final IFluidState IFluidState, final IBlockReader class7100, final BlockPos class7101, final Fluid class7102, final Direction class7103) {
        return class7103 == Direction.DOWN && !class7102.isIn(Class7324.field28319);
    }
    
    @Override
    public float getExplosionResistance() {
        return 100.0f;
    }
}
