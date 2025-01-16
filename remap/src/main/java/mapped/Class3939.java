// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util2.Direction;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class Class3939 extends Class3841
{
    private static String[] field17823;
    public static final Class7115 field17824;
    public static final Class7113 field17825;
    
    public Class3939(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3939.field17824, Direction.NORTH)).with((IProperty<Comparable>)Class3939.field17825, false));
    }
    
    @Override
    public Class2201 method11844(final BlockState class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        if (!class7097.isRemote) {
            final TileEntity method6727 = class7097.getTileEntity(class7098);
            if (method6727 instanceof Class457) {
                class7099.method2833((Class434)method6727);
                class7099.method2857(Class8276.field34046);
            }
            return Class2201.field13400;
        }
        return Class2201.field13400;
    }
    
    @Override
    public void method11829(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
        if (class7096.getBlock() != class7099.getBlock()) {
            final TileEntity method6727 = class7097.getTileEntity(class7098);
            if (method6727 instanceof Class446) {
                Class9193.method33638(class7097, class7098, (Class446)method6727);
                class7097.method6783(class7098, this);
            }
            super.method11829(class7096, class7097, class7098, class7099, b);
        }
    }
    
    @Override
    public void method11822(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        final TileEntity method6727 = class7097.getTileEntity(class7098);
        if (method6727 instanceof Class457) {
            ((Class457)method6727).method2330();
        }
    }
    
    @Nullable
    @Override
    public TileEntity method11898(final IBlockReader class1855) {
        return new Class457();
    }
    
    @Override
    public Class2115 method11797(final BlockState class7096) {
        return Class2115.field12307;
    }
    
    @Override
    public void method11853(final World class1847, final BlockPos class1848, final BlockState class1849, final LivingEntity class1850, final ItemStack class1851) {
        if (class1851.method27667()) {
            final TileEntity method6727 = class1847.getTileEntity(class1848);
            if (method6727 instanceof Class457) {
                ((Class457)method6727).method2335(class1851.method27664());
            }
        }
    }
    
    @Override
    public boolean method11873(final BlockState class7096) {
        return true;
    }
    
    @Override
    public int method11874(final BlockState class7096, final World class7097, final BlockPos class7098) {
        return Class3418.method10897(class7097.getTileEntity(class7098));
    }
    
    @Override
    public BlockState method11790(final BlockState class7096, final Class2052 class7097) {
        return ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3939.field17824, class7097.method8142(class7096.get((IProperty<Direction>)Class3939.field17824)));
    }
    
    @Override
    public BlockState method11791(final BlockState class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.get((IProperty<Direction>)Class3939.field17824)));
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3939.field17824, Class3939.field17825);
    }
    
    @Override
    public BlockState method11846(final Class7074 class7074) {
        return ((StateHolder<O, BlockState>)this.getDefaultState()).with((IProperty<Comparable>)Class3939.field17824, class7074.method21642().getOpposite());
    }
    
    static {
        field17824 = Class8970.field37756;
        field17825 = Class8970.field37739;
    }
}
