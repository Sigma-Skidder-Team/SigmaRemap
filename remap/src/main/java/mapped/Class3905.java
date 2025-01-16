// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

import java.util.Random;

public abstract class Class3905 extends Class3902
{
    public static final Class7113 field17693;
    public static final VoxelShape field17694;
    public static final VoxelShape field17695;
    public static final VoxelShape field17696;
    public static final VoxelShape field17697;
    public static final VoxelShape field17698;
    public static final VoxelShape field17699;
    public static final VoxelShape field17700;
    public static final VoxelShape field17701;
    public static final VoxelShape field17702;
    public static final VoxelShape field17703;
    public static final VoxelShape field17704;
    public static final VoxelShape field17705;
    public static final VoxelShape field17706;
    public static final VoxelShape field17707;
    public static final VoxelShape field17708;
    public static final VoxelShape field17709;
    private final boolean field17710;
    
    public Class3905(final boolean field17710, final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3905.field17564, Direction.NORTH)).with((IProperty<Comparable>)Class3905.field17693, false)).with(Class3905.field17618, Class107.field333));
        this.field17710 = field17710;
    }
    
    @Override
    public int method11826(final Class1852 class1852) {
        return this.field17710 ? 30 : 20;
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        final Direction class7100 = class7096.get((IProperty<Direction>)Class3905.field17564);
        final boolean booleanValue = class7096.get((IProperty<Boolean>)Class3905.field17693);
        switch (Class8420.field34566[class7096.get(Class3905.field17618).ordinal()]) {
            case 1: {
                if (class7100.getAxis() == Axis.X) {
                    return booleanValue ? Class3905.field17704 : Class3905.field17696;
                }
                return booleanValue ? Class3905.field17705 : Class3905.field17697;
            }
            case 2: {
                switch (Class8420.field34565[class7100.ordinal()]) {
                    case 1: {
                        return booleanValue ? Class3905.field17709 : Class3905.field17701;
                    }
                    case 2: {
                        return booleanValue ? Class3905.field17708 : Class3905.field17700;
                    }
                    case 3: {
                        return booleanValue ? Class3905.field17707 : Class3905.field17699;
                    }
                    default: {
                        return booleanValue ? Class3905.field17706 : Class3905.field17698;
                    }
                }
                break;
            }
            default: {
                if (class7100.getAxis() == Axis.X) {
                    return booleanValue ? Class3905.field17702 : Class3905.field17694;
                }
                return booleanValue ? Class3905.field17703 : Class3905.field17695;
            }
        }
    }
    
    @Override
    public Class2201 method11844(final BlockState class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final Class7005 class7101) {
        if (!class7096.get((IProperty<Boolean>)Class3905.field17693)) {
            this.method12009(class7096, class7097, class7098);
            this.method12010(class7099, class7097, class7098, true);
            return Class2201.field13400;
        }
        return Class2201.field13401;
    }
    
    public void method12009(final BlockState class7096, final World class7097, final BlockPos class7098) {
        class7097.setBlockState(class7098, ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3905.field17693, true), 3);
        this.method12013(class7096, class7097, class7098);
        class7097.method6833().method21345(class7098, this, this.method11826(class7097));
    }
    
    public void method12010(final PlayerEntity playerEntity, final Class1851 class513, final BlockPos class514, final boolean b) {
        class513.method6705(b ? playerEntity : null, class514, this.method12011(b), Class286.field1582, 0.3f, b ? 0.6f : 0.5f);
    }
    
    public abstract Class7795 method12011(final boolean p0);
    
    @Override
    public void method11829(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
        if (!b) {
            if (class7096.getBlock() != class7099.getBlock()) {
                if (class7096.get((IProperty<Boolean>)Class3905.field17693)) {
                    this.method12013(class7096, class7097, class7098);
                }
                super.method11829(class7096, class7097, class7098, class7099, b);
            }
        }
    }
    
    @Override
    public int method11848(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final Direction class7099) {
        return class7096.get((IProperty<Boolean>)Class3905.field17693) ? 15 : 0;
    }
    
    @Override
    public int method11851(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final Direction class7099) {
        return (class7096.get((IProperty<Boolean>)Class3905.field17693) && Class3902.method12003(class7096) == class7099) ? 15 : 0;
    }
    
    @Override
    public boolean method11849(final BlockState class7096) {
        return true;
    }
    
    @Override
    public void method11822(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (class7096.get((IProperty<Boolean>)Class3905.field17693)) {
            if (!this.field17710) {
                class7097.setBlockState(class7098, ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3905.field17693, false), 3);
                this.method12013(class7096, class7097, class7098);
                this.method12010(null, class7097, class7098, false);
            }
            else {
                this.method12012(class7096, class7097, class7098);
            }
        }
    }
    
    @Override
    public void method11850(final BlockState class7096, final World class7097, final BlockPos class7098, final Entity class7099) {
        if (!class7097.isRemote) {
            if (this.field17710) {
                if (!class7096.get((IProperty<Boolean>)Class3905.field17693)) {
                    this.method12012(class7096, class7097, class7098);
                }
            }
        }
    }
    
    private void method12012(final BlockState class7096, final World class7097, final BlockPos class7098) {
        final boolean b = !class7097.method7128((Class<? extends Entity>)Class402.class, class7096.getShape(class7097, class7098).method24537().method18500(class7098)).isEmpty();
        if (b != class7096.get((IProperty<Boolean>)Class3905.field17693)) {
            class7097.setBlockState(class7098, (BlockState)((StateHolder<Object, Object>)class7096).with((IProperty<Comparable>)Class3905.field17693, b), 3);
            this.method12013(class7096, class7097, class7098);
            this.method12010(null, class7097, class7098, b);
        }
        if (b) {
            class7097.method6833().method21345(new BlockPos(class7098), this, this.method11826(class7097));
        }
    }
    
    private void method12013(final BlockState class7096, final World class7097, final BlockPos class7098) {
        class7097.method6696(class7098, this);
        class7097.method6696(class7098.method1149(Class3902.method12003(class7096).getOpposite()), this);
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3905.field17564, Class3905.field17693, Class3905.field17618);
    }
    
    static {
        field17693 = Class8970.field37741;
        field17694 = Block.method11778(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
        field17695 = Block.method11778(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
        field17696 = Block.method11778(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
        field17697 = Block.method11778(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
        field17698 = Block.method11778(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
        field17699 = Block.method11778(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
        field17700 = Block.method11778(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
        field17701 = Block.method11778(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
        field17702 = Block.method11778(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
        field17703 = Block.method11778(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
        field17704 = Block.method11778(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
        field17705 = Block.method11778(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
        field17706 = Block.method11778(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
        field17707 = Block.method11778(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
        field17708 = Block.method11778(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
        field17709 = Block.method11778(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
    }
}
