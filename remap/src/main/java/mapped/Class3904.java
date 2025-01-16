// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

import java.util.Random;

public class Class3904 extends Class3902
{
    private static String[] field17617;
    public static final Class7113 field17684;
    public static final VoxelShape field17685;
    public static final VoxelShape field17686;
    public static final VoxelShape field17687;
    public static final VoxelShape field17688;
    public static final VoxelShape field17689;
    public static final VoxelShape field17690;
    public static final VoxelShape field17691;
    public static final VoxelShape field17692;
    
    public Class3904(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)this.field17406.method32903()).with((IProperty<Comparable>)Class3904.field17564, Direction.NORTH)).with((IProperty<Comparable>)Class3904.field17684, false)).with(Class3904.field17618, Class107.field333));
    }
    
    @Override
    public VoxelShape method11808(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        switch (Class8073.field33262[class7096.method21772(Class3904.field17618).ordinal()]) {
            case 1: {
                switch (Class8073.field33260[class7096.method21772((IProperty<Direction>)Class3904.field17564).getAxis().ordinal()]) {
                    case 1: {
                        return Class3904.field17690;
                    }
                    default: {
                        return Class3904.field17689;
                    }
                }
                break;
            }
            case 2: {
                switch (Class8073.field33261[class7096.method21772((IProperty<Direction>)Class3904.field17564).ordinal()]) {
                    case 1: {
                        return Class3904.field17688;
                    }
                    case 2: {
                        return Class3904.field17687;
                    }
                    case 3: {
                        return Class3904.field17686;
                    }
                    default: {
                        return Class3904.field17685;
                    }
                }
                break;
            }
            default: {
                switch (Class8073.field33260[class7096.method21772((IProperty<Direction>)Class3904.field17564).getAxis().ordinal()]) {
                    case 1: {
                        return Class3904.field17692;
                    }
                    default: {
                        return Class3904.field17691;
                    }
                }
                break;
            }
        }
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        if (!class7097.isRemote) {
            class7097.method6705(null, class7098, Class8520.field35343, Class286.field1582, 0.3f, ((boolean)this.method12006(class7096, class7097, class7098).method21772((IProperty<Boolean>)Class3904.field17684)) ? 0.6f : 0.5f);
            return Class2201.field13400;
        }
        final Class7096 class7102 = ((StateHolder<O, Class7096>)class7096).method21768((IProperty<Comparable>)Class3904.field17684);
        if (class7102.method21772((IProperty<Boolean>)Class3904.field17684)) {
            method12007(class7102, class7097, class7098, 1.0f);
        }
        return Class2201.field13400;
    }
    
    public Class7096 method12006(Class7096 class7096, final World class7097, final BlockPos class7098) {
        class7096 = ((StateHolder<O, Class7096>)class7096).method21768((IProperty<Comparable>)Class3904.field17684);
        class7097.setBlockState(class7098, class7096, 3);
        this.method12008(class7096, class7097, class7098);
        return class7096;
    }
    
    private static void method12007(final Class7096 class7096, final Class1851 class7097, final BlockPos class7098, final float n) {
        final Direction method782 = class7096.method21772((IProperty<Direction>)Class3904.field17564).getOpposite();
        final Direction method783 = Class3902.method12003(class7096).getOpposite();
        class7097.method6709(new Class6912(1.0f, 0.0f, 0.0f, n), class7098.getX() + 0.5 + 0.1 * method782.getXOffset() + 0.2 * method783.getXOffset(), class7098.getY() + 0.5 + 0.1 * method782.getYOffset() + 0.2 * method783.getYOffset(), class7098.getZ() + 0.5 + 0.1 * method782.getZOffset() + 0.2 * method783.getZOffset(), 0.0, 0.0, 0.0);
    }
    
    @Override
    public void method11823(final Class7096 class7096, final World class7097, final BlockPos class7098, final Random random) {
        if (class7096.method21772((IProperty<Boolean>)Class3904.field17684)) {
            if (random.nextFloat() < 0.25f) {
                method12007(class7096, class7097, class7098, 0.5f);
            }
        }
    }
    
    @Override
    public void method11829(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        if (!b) {
            if (class7096.method21696() != class7099.method21696()) {
                if (class7096.method21772((IProperty<Boolean>)Class3904.field17684)) {
                    this.method12008(class7096, class7097, class7098);
                }
                super.method11829(class7096, class7097, class7098, class7099, b);
            }
        }
    }
    
    @Override
    public int method11848(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final Direction class7099) {
        return class7096.method21772((IProperty<Boolean>)Class3904.field17684) ? 15 : 0;
    }
    
    @Override
    public int method11851(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final Direction class7099) {
        return (class7096.method21772((IProperty<Boolean>)Class3904.field17684) && Class3902.method12003(class7096) == class7099) ? 15 : 0;
    }
    
    @Override
    public boolean method11849(final Class7096 class7096) {
        return true;
    }
    
    private void method12008(final Class7096 class7096, final World class7097, final BlockPos class7098) {
        class7097.method6696(class7098, this);
        class7097.method6696(class7098.method1149(Class3902.method12003(class7096).getOpposite()), this);
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class3904.field17618, Class3904.field17564, Class3904.field17684);
    }
    
    static {
        field17684 = Class8970.field37741;
        field17685 = Block.method11778(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
        field17686 = Block.method11778(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
        field17687 = Block.method11778(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
        field17688 = Block.method11778(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
        field17689 = Block.method11778(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
        field17690 = Block.method11778(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
        field17691 = Block.method11778(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
        field17692 = Block.method11778(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);
    }
}
