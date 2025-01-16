// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.Iterator;
import java.util.Random;

public class Class3968 extends Class3967
{
    private static String[] field17929;
    
    public Class3968(final Class9288 class9288) {
        super(0.3125f, class9288);
        this.method11877(((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)this.field17406.method32903()).with((IProperty<Comparable>)Class3968.field17921, false)).with((IProperty<Comparable>)Class3968.field17922, false)).with((IProperty<Comparable>)Class3968.field17923, false)).with((IProperty<Comparable>)Class3968.field17924, false)).with((IProperty<Comparable>)Class3968.field17925, false)).with((IProperty<Comparable>)Class3968.field17926, false));
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        return this.method12106(class7074.method21654(), class7074.method21639());
    }
    
    public Class7096 method12106(final Class1855 class1855, final BlockPos class1856) {
        final Block method21696 = class1855.getBlockState(class1856.method1139()).getBlock();
        final Block method21697 = class1855.getBlockState(class1856.method1137()).getBlock();
        final Block method21698 = class1855.getBlockState(class1856.method1141()).getBlock();
        final Block method21699 = class1855.getBlockState(class1856.method1147()).getBlock();
        final Block method21700 = class1855.getBlockState(class1856.method1143()).getBlock();
        final Block method21701 = class1855.getBlockState(class1856.method1145()).getBlock();
        final Class7096 method21702 = this.getDefaultState();
        final Class7113 field17926 = Class3968.field17926;
        if (method21696 != this) {
            if (method21696 != Class7521.field29631) {
                if (method21696 != Class7521.field29403) {
                    final boolean b = false;
                    return (Class7096)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Class7096>)method21702).with((IProperty<Comparable>)field17926, b)).with((IProperty<Comparable>)Class3968.field17925, method21697 == this || method21697 == Class7521.field29631)).with((IProperty<Comparable>)Class3968.field17921, method21698 == this || method21698 == Class7521.field29631)).with((IProperty<Comparable>)Class3968.field17922, method21699 == this || method21699 == Class7521.field29631)).with((IProperty<Comparable>)Class3968.field17923, method21700 == this || method21700 == Class7521.field29631)).with((IProperty<Comparable>)Class3968.field17924, method21701 == this || method21701 == Class7521.field29631);
                }
            }
        }
        final boolean b = true;
        return (Class7096)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Class7096>)method21702).with((IProperty<Comparable>)field17926, b)).with((IProperty<Comparable>)Class3968.field17925, method21697 == this || method21697 == Class7521.field29631)).with((IProperty<Comparable>)Class3968.field17921, method21698 == this || method21698 == Class7521.field29631)).with((IProperty<Comparable>)Class3968.field17922, method21699 == this || method21699 == Class7521.field29631)).with((IProperty<Comparable>)Class3968.field17923, method21700 == this || method21700 == Class7521.field29631)).with((IProperty<Comparable>)Class3968.field17924, method21701 == this || method21701 == Class7521.field29631);
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7096.method21752(class7099, class7100)) {
            final Block method21696 = class7098.method21696();
            if (method21696 != this) {
                if (method21696 != Class7521.field29631) {
                    if (class7097 != Direction.DOWN || method21696 != Class7521.field29403) {
                        final boolean b = false;
                        return (Class7096)((StateHolder<Object, Object>)class7096).with((IProperty<Comparable>)Class3968.field17927.get(class7097), b);
                    }
                }
            }
            final boolean b = true;
            return (Class7096)((StateHolder<Object, Object>)class7096).with((IProperty<Comparable>)Class3968.field17927.get(class7097), b);
        }
        class7099.method6833().method21345(class7100, this, 1);
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (!class7096.method21752(class7097, class7098)) {
            class7097.method7149(class7098, true);
        }
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        final Class7096 method6701 = class7097.getBlockState(class7098.method1139());
        final boolean b = !class7097.getBlockState(class7098.method1137()).method21706() && !method6701.method21706();
        final Iterator<Direction> iterator = Plane.HORIZONTAL.iterator();
        while (iterator.hasNext()) {
            final BlockPos method6702 = class7098.method1149(iterator.next());
            if (class7097.getBlockState(method6702).getBlock() != this) {
                continue;
            }
            if (b) {
                return false;
            }
            final Block method6703 = class7097.getBlockState(method6702.method1139()).getBlock();
            if (method6703 != this && method6703 != Class7521.field29403) {
                continue;
            }
            return true;
        }
        final Block method6704 = method6701.method21696();
        return method6704 == this || method6704 == Class7521.field29403;
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class3968.field17921, Class3968.field17922, Class3968.field17923, Class3968.field17924, Class3968.field17925, Class3968.field17926);
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
}
