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

import javax.annotation.Nullable;

public class SlabBlock extends Block implements Class3856
{
    private static String[] field17776;
    public static final Class7114<Class186> field17777;
    public static final Class7113 field17778;
    public static final VoxelShape field17779;
    public static final VoxelShape field17780;
    
    public SlabBlock(final Properties class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>) this.getDefaultState().with(SlabBlock.field17777, Class186.field599)).with((IProperty<Comparable>) SlabBlock.field17778, false));
    }
    
    @Override
    public boolean isTransparent(final BlockState class7096) {
        return class7096.get(SlabBlock.field17777) != Class186.field600;
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(SlabBlock.field17777, SlabBlock.field17778);
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        switch (Class9296.field39868[class7096.get(SlabBlock.field17777).ordinal()]) {
            case 1: {
                return VoxelShapes.fullCube();
            }
            case 2: {
                return SlabBlock.field17780;
            }
            default: {
                return SlabBlock.field17779;
            }
        }
    }
    
    @Nullable
    @Override
    public BlockState method11846(final Class7074 class7074) {
        final BlockPos method21639 = class7074.method21639();
        final BlockState method21640 = class7074.method21654().getBlockState(method21639);
        if (method21640.getBlock() != this) {
            final BlockState class7075 = ((StateHolder<O, BlockState>) this.getDefaultState().with(SlabBlock.field17777, Class186.field599)).with((IProperty<Comparable>) SlabBlock.field17778, class7074.method21654().getFluidState(method21639).getFluid() == Class7558.field29976);
            final Direction method21641 = class7074.method21648();
            return (method21641 != Direction.DOWN && (method21641 == Direction.UP || class7074.method21649().y - method21639.getY() <= 0.5)) ? class7075 : class7075.with(SlabBlock.field17777, Class186.field598);
        }
        return (BlockState)((StateHolder<Object, Object>) method21640.with(SlabBlock.field17777, Class186.field600)).with((IProperty<Comparable>) SlabBlock.field17778, false);
    }
    
    @Override
    public boolean method11798(final BlockState class7096, final Class7074 class7097) {
        final ItemStack method21651 = class7097.method21651();
        final Class186 class7098 = class7096.get(SlabBlock.field17777);
        if (class7098 == Class186.field600 || method21651.getItem() != this.method11704()) {
            return false;
        }
        if (!class7097.method21641()) {
            return true;
        }
        final boolean b = class7097.method21649().y - class7097.method21639().getY() > 0.5;
        final Direction method21652 = class7097.method21648();
        if (class7098 != Class186.field599) {
            return method21652 == Direction.DOWN || (!b && method21652.getAxis().isHorizontal());
        }
        return method21652 == Direction.UP || (b && method21652.getAxis().isHorizontal());
    }
    
    @Override
    public IFluidState method11864(final BlockState class7096) {
        return class7096.get(SlabBlock.field17778) ? Class7558.field29976.method22177(false) : super.method11864(class7096);
    }
    
    @Override
    public boolean method11921(final Class1851 class1851, final BlockPos class1852, final BlockState class1853, final IFluidState class1854) {
        return class1853.get(SlabBlock.field17777) != Class186.field600 && super.method11921(class1851, class1852, class1853, class1854);
    }
    
    @Override
    public boolean method11920(final IBlockReader class1855, final BlockPos class1856, final BlockState class1857, final Fluid class1858) {
        return class1857.get(SlabBlock.field17777) != Class186.field600 && super.method11920(class1855, class1856, class1857, class1858);
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7096.get(SlabBlock.field17778)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11796(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Class2084 class7099) {
        switch (Class9296.field39869[class7099.ordinal()]) {
            case 1: {
                return false;
            }
            case 2: {
                return class7097.getFluidState(class7098).isTagged(Class7324.field28319);
            }
            case 3: {
                return false;
            }
            default: {
                return false;
            }
        }
    }
    
    static {
        field17777 = Class8970.field37800;
        field17778 = Class8970.field37747;
        field17779 = Block.method11778(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
        field17780 = Block.method11778(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);
    }
}
