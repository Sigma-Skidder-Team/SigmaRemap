// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

import java.util.Random;

public class Class3927 extends Class3926
{
    private static String[] field17790;
    private final Block field17793;
    
    public Class3927(final Block field17793, final Properties class9288) {
        super(class9288);
        this.field17793 = field17793;
    }
    
    @Override
    public void onBlockAdded(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
        this.method12037(class7096, class7097, class7098);
    }
    
    @Override
    public void method11822(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (!Class3922.method12038(class7096, class7097, class7098)) {
            class7097.setBlockState(class7098, ((StateHolder<O, BlockState>)this.field17793.getDefaultState()).with((IProperty<Comparable>)Class3927.field17782, false).with((IProperty<Comparable>)Class3927.field17791, (Comparable)class7096.get((IProperty<V>)Class3927.field17791)), 2);
        }
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7097.getOpposite() == class7096.get(Class3927.field17791) && !class7096.method21752(class7099, class7100)) {
            return Blocks.AIR.getDefaultState();
        }
        if (class7096.get(Class3927.field17782)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        this.method12037(class7096, class7099, class7100);
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
}
