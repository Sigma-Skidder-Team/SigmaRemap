// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;

public abstract class Class3895 extends Class3892
{
    public static final VoxelShape field17577;
    public static final Class7113 field17578;
    
    public Class3895(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public VoxelShape method11808(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3895.field17577;
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        return Block.method11812(class7097, class7098.method1139());
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (!this.method11967(class7097, class7098, class7096)) {
            final boolean booleanValue = class7096.method21772((IProperty<Boolean>)Class3895.field17578);
            final boolean method11968 = this.method11968(class7097, class7098, class7096);
            if (booleanValue && !method11968) {
                class7097.setBlockState(class7098, ((StateHolder<O, Class7096>)class7096).with((IProperty<Comparable>)Class3895.field17578, false), 2);
            }
            else if (!booleanValue) {
                class7097.setBlockState(class7098, ((StateHolder<O, Class7096>)class7096).with((IProperty<Comparable>)Class3895.field17578, true), 2);
                if (!method11968) {
                    class7097.method6907().method21341(class7098, this, this.method11977(class7096), Class1955.field10640);
                }
            }
        }
    }
    
    @Override
    public int method11851(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final Direction class7099) {
        return class7096.method21715(class7097, class7098, class7099);
    }
    
    @Override
    public int method11848(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final Direction class7099) {
        if (class7096.method21772((IProperty<Boolean>)Class3895.field17578)) {
            return (class7096.method21772((IProperty<Comparable>)Class3895.field17564) != class7099) ? 0 : this.method11974(class7097, class7098, class7096);
        }
        return 0;
    }
    
    @Override
    public void method11825(final Class7096 class7096, final World class7097, final BlockPos class7098, final Block class7099, final BlockPos class7100, final boolean b) {
        if (!class7096.method21752(class7097, class7098)) {
            Block.method11837(class7096, class7097, class7098, this.method11802() ? class7097.getTileEntity(class7098) : null);
            class7097.method6690(class7098, false);
            final Direction[] values = Direction.values();
            for (int length = values.length, i = 0; i < length; ++i) {
                class7097.method6696(class7098.method1149(values[i]), this);
            }
        }
        else {
            this.method11966(class7097, class7098, class7096);
        }
    }
    
    public void method11966(final World class1847, final BlockPos class1848, final Class7096 class1849) {
        if (!this.method11967(class1847, class1848, class1849)) {
            final boolean booleanValue = class1849.method21772((IProperty<Boolean>)Class3895.field17578);
            if (booleanValue != this.method11968(class1847, class1848, class1849)) {
                if (!class1847.method6833().method21342(class1848, this)) {
                    Class1955 class1850 = Class1955.field10641;
                    if (!this.method11976(class1847, class1848, class1849)) {
                        if (booleanValue) {
                            class1850 = Class1955.field10640;
                        }
                    }
                    else {
                        class1850 = Class1955.field10639;
                    }
                    class1847.method6833().method21341(class1848, this, this.method11977(class1849), class1850);
                }
            }
        }
    }
    
    public boolean method11967(final Class1852 class1852, final BlockPos class1853, final Class7096 class1854) {
        return false;
    }
    
    public boolean method11968(final World class1847, final BlockPos class1848, final Class7096 class1849) {
        return this.method11969(class1847, class1848, class1849) > 0;
    }
    
    public int method11969(final World class1847, final BlockPos class1848, final Class7096 class1849) {
        final Direction class1850 = class1849.method21772((IProperty<Direction>)Class3895.field17564);
        final BlockPos method1149 = class1848.method1149(class1850);
        final int method1150 = class1847.method6748(method1149, class1850);
        if (method1150 < 15) {
            final Class7096 method1151 = class1847.getBlockState(method1149);
            return Math.max(method1150, (method1151.method21696() != Blocks.REDSTONE_WIRE) ? 0 : ((int)method1151.method21772((IProperty<Integer>)Class3999.field18026)));
        }
        return method1150;
    }
    
    public int method11970(final Class1852 class1852, final BlockPos class1853, final Class7096 class1854) {
        final Direction class1855 = class1854.method21772((IProperty<Direction>)Class3895.field17564);
        final Direction method783 = class1855.rotateY();
        final Direction method784 = class1855.method784();
        return Math.max(this.method11971(class1852, class1853.method1149(method783), method783), this.method11971(class1852, class1853.method1149(method784), method784));
    }
    
    public int method11971(final Class1852 class1852, final BlockPos class1853, final Direction class1854) {
        final Class7096 method6701 = class1852.getBlockState(class1853);
        final Block method6702 = method6701.method21696();
        if (!this.method11973(method6701)) {
            return 0;
        }
        if (method6702 != Blocks.field29473) {
            return (method6702 != Blocks.REDSTONE_WIRE) ? class1852.method6964(class1853, class1854) : method6701.method21772((IProperty<Integer>)Class3999.field18026);
        }
        return 15;
    }
    
    @Override
    public boolean method11849(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        return ((StateHolder<O, Class7096>)this.getDefaultState()).with((IProperty<Comparable>)Class3895.field17564, class7074.method21644().getOpposite());
    }
    
    @Override
    public void method11853(final World class1847, final BlockPos class1848, final Class7096 class1849, final LivingEntity class1850, final ItemStack class1851) {
        if (this.method11968(class1847, class1848, class1849)) {
            class1847.method6833().method21345(class1848, this, 1);
        }
    }
    
    @Override
    public void method11828(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        this.method11972(class7097, class7098, class7096);
    }
    
    @Override
    public void method11829(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        if (!b) {
            if (class7096.method21696() != class7099.method21696()) {
                super.method11829(class7096, class7097, class7098, class7099, b);
                this.method11972(class7097, class7098, class7096);
            }
        }
    }
    
    public void method11972(final World class1847, final BlockPos class1848, final Class7096 class1849) {
        final Direction class1850 = class1849.method21772((IProperty<Direction>)Class3895.field17564);
        final BlockPos method1149 = class1848.method1149(class1850.getOpposite());
        class1847.method6698(method1149, this, class1848);
        class1847.method6697(method1149, this, class1850);
    }
    
    public boolean method11973(final Class7096 class7096) {
        return class7096.method21714();
    }
    
    public int method11974(final IBlockReader class1855, final BlockPos class1856, final Class7096 class1857) {
        return 15;
    }
    
    public static boolean method11975(final Class7096 class7096) {
        return class7096.method21696() instanceof Class3895;
    }
    
    public boolean method11976(final IBlockReader class1855, final BlockPos class1856, final Class7096 class1857) {
        final Direction method782 = class1857.method21772((IProperty<Direction>)Class3895.field17564).getOpposite();
        final Class7096 method783 = class1855.getBlockState(class1856.method1149(method782));
        return method11975(method783) && ((StateHolder<Object, Object>)method783).get((IProperty<Comparable>)Class3895.field17564) != method782;
    }
    
    public abstract int method11977(final Class7096 p0);
    
    static {
        field17577 = Block.method11778(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
        field17578 = Class8970.field37741;
    }
}
