// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class3940 extends Class3841
{
    private static String[] field17826;
    public static final Class7112 field17827;
    public static final Class7113 field17828;
    public static final VoxelShape field17829;
    
    public Class3940(final Properties class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3940.field17827, 0)).with((IProperty<Comparable>)Class3940.field17828, false));
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3940.field17829;
    }
    
    @Override
    public boolean isTransparent(final BlockState class7096) {
        return true;
    }
    
    @Override
    public int method11848(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Direction class7099) {
        return class7096.get(Class3940.field17827);
    }
    
    public static void method12055(final BlockState class7096, final World class7097, final BlockPos class7098) {
        if (class7097.dimension.method20503()) {
            int round = class7097.method6992(Class237.field911, class7098) - class7097.method6785();
            final float method6713 = class7097.method6713(1.0f);
            if (!class7096.get(Class3940.field17828)) {
                if (round > 0) {
                    round = Math.round(round * MathHelper.cos(method6713 + (((method6713 >= 3.1415927f) ? 6.2831855f : 0.0f) - method6713) * 0.2f));
                }
            }
            else {
                round = 15 - round;
            }
            final int method6714 = MathHelper.method35651(round, 0, 15);
            if (class7096.get(Class3940.field17827) != method6714) {
                class7097.setBlockState(class7098, (BlockState)((StateHolder<Object, Object>)class7096).with((IProperty<Comparable>)Class3940.field17827, method6714), 3);
            }
        }
    }
    
    @Override
    public Class2201 method11844(final BlockState class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        if (!class7099.method2880()) {
            return super.method11844(class7096, class7097, class7098, class7099, class7100, class7101);
        }
        if (!class7097.isRemote) {
            final BlockState class7102 = class7096.method21768((IProperty<Comparable>)Class3940.field17828);
            class7097.setBlockState(class7098, class7102, 4);
            method12055(class7102, class7097, class7098);
            return Class2201.field13400;
        }
        return Class2201.field13400;
    }
    
    @Override
    public Class2115 method11797(final BlockState class7096) {
        return Class2115.field12307;
    }
    
    @Override
    public boolean method11849(final BlockState class7096) {
        return true;
    }
    
    @Override
    public TileEntity method11898(final IBlockReader class1855) {
        return new Class496();
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3940.field17827, Class3940.field17828);
    }
    
    static {
        field17827 = Class8970.field37790;
        field17828 = Class8970.field37734;
        field17829 = Block.method11778(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);
    }
}
