// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

import java.util.Random;
import javax.annotation.Nullable;
import java.util.List;

public class Class3896 extends Class3895 implements Class3840
{
    private static String[] field17579;
    public static final Class7114<Class110> field17580;
    
    public Class3896(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)this.field17406.method32903()).with((IProperty<Comparable>)Class3896.field17564, Direction.NORTH)).with((IProperty<Comparable>)Class3896.field17578, false)).with(Class3896.field17580, Class110.field347));
    }
    
    @Override
    public int method11977(final Class7096 class7096) {
        return 2;
    }
    
    @Override
    public int method11974(final IBlockReader class1855, final BlockPos class1856, final Class7096 class1857) {
        final TileEntity method6727 = class1855.getTileEntity(class1856);
        return (method6727 instanceof Class499) ? ((Class499)method6727).method2537() : 0;
    }
    
    private int method11978(final World class1847, final BlockPos class1848, final Class7096 class1849) {
        return (class1849.method21772(Class3896.field17580) != Class110.field348) ? this.method11969(class1847, class1848, class1849) : Math.max(this.method11969(class1847, class1848, class1849) - this.method11970(class1847, class1848, class1849), 0);
    }
    
    @Override
    public boolean method11968(final World class1847, final BlockPos class1848, final Class7096 class1849) {
        final int method11969 = this.method11969(class1847, class1848, class1849);
        if (method11969 != 0) {
            final int method11970 = this.method11970(class1847, class1848, class1849);
            return method11969 > method11970 || (method11969 == method11970 && class1849.method21772(Class3896.field17580) == Class110.field347);
        }
        return false;
    }
    
    @Override
    public int method11969(final World class1847, final BlockPos class1848, final Class7096 class1849) {
        int n = super.method11969(class1847, class1848, class1849);
        final Direction class1850 = class1849.method21772((IProperty<Direction>)Class3896.field17564);
        final BlockPos method1149 = class1848.method1149(class1850);
        final Class7096 method1150 = class1847.getBlockState(method1149);
        if (!method1150.method21716()) {
            if (n < 15) {
                if (method1150.method21713(class1847, method1149)) {
                    final BlockPos method1151 = method1149.method1149(class1850);
                    final Class7096 method1152 = class1847.getBlockState(method1151);
                    if (!method1152.method21716()) {
                        if (method1152.method21706()) {
                            final Class862 method1153 = this.method11979(class1847, class1850, method1151);
                            if (method1153 != null) {
                                n = method1153.method5204();
                            }
                        }
                    }
                    else {
                        n = method1152.method21717(class1847, method1151);
                    }
                }
            }
        }
        else {
            n = method1150.method21717(class1847, method1149);
        }
        return n;
    }
    
    @Nullable
    private Class862 method11979(final World class1847, final Direction class1848, final BlockPos class1849) {
        final List<Entity> method6739 = class1847.method6739((Class<? extends Entity>)Class862.class, new AxisAlignedBB(class1849.getX(), class1849.getY(), class1849.getZ(), class1849.getX() + 1, class1849.getY() + 1, class1849.getZ() + 1), class1851 -> class1851 != null && class1851.method1882() == class1850);
        return (method6739.size() != 1) ? null : ((Class862)method6739.get(0));
    }
    
    @Override
    public Class2201 method11844(Class7096 class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        if (class7099.field3025.field27305) {
            class7096 = ((StateHolder<O, Class7096>)class7096).method21768(Class3896.field17580);
            class7097.method6705(class7099, class7098, Class8520.field35085, Class286.field1582, 0.3f, (class7096.method21772(Class3896.field17580) != Class110.field348) ? 0.5f : 0.55f);
            class7097.setBlockState(class7098, class7096, 2);
            this.method11980(class7097, class7098, class7096);
            return Class2201.field13400;
        }
        return Class2201.field13402;
    }
    
    @Override
    public void method11966(final World class1847, final BlockPos class1848, final Class7096 class1849) {
        if (!class1847.method6833().method21342(class1848, this)) {
            final int method11978 = this.method11978(class1847, class1848, class1849);
            final TileEntity method11979 = class1847.getTileEntity(class1848);
            if (method11978 != ((method11979 instanceof Class499) ? ((Class499)method11979).method2537() : 0) || class1849.method21772((IProperty<Boolean>)Class3896.field17578) != this.method11968(class1847, class1848, class1849)) {
                class1847.method6833().method21341(class1848, this, 2, this.method11976(class1847, class1848, class1849) ? Class1955.field10641 : Class1955.field10642);
            }
        }
    }
    
    private void method11980(final World class1847, final BlockPos class1848, final Class7096 class1849) {
        final int method11978 = this.method11978(class1847, class1848, class1849);
        final TileEntity method11979 = class1847.getTileEntity(class1848);
        int method11980 = 0;
        if (method11979 instanceof Class499) {
            final Class499 class1850 = (Class499)method11979;
            method11980 = class1850.method2537();
            class1850.method2538(method11978);
        }
        if (method11980 != method11978 || class1849.method21772(Class3896.field17580) == Class110.field347) {
            final boolean method11981 = this.method11968(class1847, class1848, class1849);
            final boolean booleanValue = class1849.method21772((IProperty<Boolean>)Class3896.field17578);
            if (booleanValue && !method11981) {
                class1847.setBlockState(class1848, ((StateHolder<O, Class7096>)class1849).with((IProperty<Comparable>)Class3896.field17578, false), 2);
            }
            else if (!booleanValue) {
                if (method11981) {
                    class1847.setBlockState(class1848, ((StateHolder<O, Class7096>)class1849).with((IProperty<Comparable>)Class3896.field17578, true), 2);
                }
            }
            this.method11972(class1847, class1848, class1849);
        }
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        this.method11980(class7097, class7098, class7096);
    }
    
    @Override
    public boolean method11857(final Class7096 class7096, final World class7097, final BlockPos class7098, final int n, final int n2) {
        super.method11857(class7096, class7097, class7098, n, n2);
        final TileEntity method6727 = class7097.getTileEntity(class7098);
        return method6727 != null && method6727.method2200(n, n2);
    }
    
    @Override
    public TileEntity method11898(final IBlockReader class1855) {
        return new Class499();
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class3896.field17564, Class3896.field17580, Class3896.field17578);
    }
    
    static {
        field17580 = Class8970.field37796;
    }
}
