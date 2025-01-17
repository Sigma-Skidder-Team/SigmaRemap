// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public abstract class Class3860 extends Class3841 implements Class3856
{
    public static final Class7113 field17483;
    public static final VoxelShape field17484;
    private final Class8289 field17485;
    
    public Class3860(final Properties class9288, final Class8289 field17485) {
        super(class9288);
        this.field17485 = field17485;
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7096.method21772((IProperty<Boolean>)Class3860.field17483)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public VoxelShape method11808(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3860.field17484;
    }
    
    @Override
    public boolean method11854() {
        return true;
    }
    
    @Override
    public TileEntity method11898(final IBlockReader class1855) {
        return new Class497();
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        final ItemStack method2715 = class7099.method2715(class7100);
        final boolean b = method2715.getItem() instanceof Class3829 && class7099.field3025.field27305;
        if (class7097.isRemote) {
            return b ? Class2201.field13400 : Class2201.field13401;
        }
        final TileEntity method2716 = class7097.getTileEntity(class7098);
        if (!(method2716 instanceof Class497)) {
            return Class2201.field13402;
        }
        final Class497 class7102 = (Class497)method2716;
        if (b) {
            if (class7102.method2530(((Class3829)method2715.getItem()).method11767())) {
                if (!class7099.method2889()) {
                    method2715.method27693(1);
                }
            }
        }
        return class7102.method2527(class7099) ? Class2201.field13400 : Class2201.field13402;
    }
    
    @Override
    public IFluidState method11864(final Class7096 class7096) {
        return class7096.method21772((IProperty<Boolean>)Class3860.field17483) ? Class7558.field29976.method22177(false) : super.method11864(class7096);
    }
    
    public Class8289 method11928() {
        return this.field17485;
    }
    
    static {
        field17483 = Class8970.field37747;
        field17484 = Block.method11778(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
    }
}
