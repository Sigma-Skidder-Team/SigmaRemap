// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;
import net.minecraft.world.World;

public abstract class Class3948 extends Class3841
{
    public static final Class7115 field17846;
    public static final Class7113 field17847;
    
    public Class3948(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)this.field17406.method32903()).with((IProperty<Comparable>)Class3948.field17846, Direction.NORTH)).with((IProperty<Comparable>)Class3948.field17847, false));
    }
    
    @Override
    public int method11781(final Class7096 class7096) {
        return class7096.method21772((IProperty<Boolean>)Class3948.field17847) ? super.getLightValue(class7096) : 0;
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        if (!class7097.isRemote) {
            this.method12066(class7097, class7098, class7099);
            return Class2201.field13400;
        }
        return Class2201.field13400;
    }
    
    public abstract void method12066(final World p0, final BlockPos p1, final PlayerEntity p2);
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        return ((StateHolder<O, Class7096>)this.getDefaultState()).with((IProperty<Comparable>)Class3948.field17846, class7074.method21644().getOpposite());
    }
    
    @Override
    public void method11853(final World class1847, final BlockPos class1848, final Class7096 class1849, final LivingEntity class1850, final ItemStack class1851) {
        if (class1851.method27667()) {
            final TileEntity method6727 = class1847.getTileEntity(class1848);
            if (method6727 instanceof Class466) {
                ((Class466)method6727).method2335(class1851.method27664());
            }
        }
    }
    
    @Override
    public void method11829(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        if (class7096.method21696() != class7099.method21696()) {
            final TileEntity method6727 = class7097.getTileEntity(class7098);
            if (method6727 instanceof Class466) {
                Class9193.method33638(class7097, class7098, (Class446)method6727);
                class7097.method6783(class7098, this);
            }
            super.method11829(class7096, class7097, class7098, class7099, b);
        }
    }
    
    @Override
    public boolean method11873(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public int method11874(final Class7096 class7096, final World class7097, final BlockPos class7098) {
        return Class3418.method10897(class7097.getTileEntity(class7098));
    }
    
    @Override
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12307;
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((StateHolder<O, Class7096>)class7096).with((IProperty<Comparable>)Class3948.field17846, class7097.method8142(class7096.method21772((IProperty<Direction>)Class3948.field17846)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772((IProperty<Direction>)Class3948.field17846)));
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class3948.field17846, Class3948.field17847);
    }
    
    static {
        field17846 = Class3892.field17564;
        field17847 = Class4024.field18113;
    }
}
